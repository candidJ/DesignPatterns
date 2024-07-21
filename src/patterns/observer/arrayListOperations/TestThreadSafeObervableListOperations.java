package patterns.observer.arrayListOperations;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestThreadSafeObervableListOperations {

	static class MockTestListener<T> implements ListListener<T> {
		int onListUpdateCallCount = 0;

		@Override
		public void onListUpdate(List<T> list, OperationType operationType, Object listItem) {
			onListUpdateCallCount++;
		}
	}

	@DisplayName("When Multiple threads modify (add or remove) items to ObservableList, then operations need to be thread safe")
	@Test
	void testThreadSafeOperations() throws InterruptedException {

		int numberOfThreads = 10;
		int numberOfOperationsPerThread = 1000;

		ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
		CountDownLatch countDownLatch = new CountDownLatch(numberOfThreads);

		ObservableList<Integer> observableList = new ObservableList<>();
		MockTestListener<Integer> mockTestListener = new MockTestListener<>();

		observableList.registerListener(mockTestListener);

		for (int outerIterator = 0; outerIterator < numberOfThreads; outerIterator++) {
			// give thread-pool tasks to execute
			// thread pool internally uses blocking queue so add and remove operations must be synchronized
			executorService.execute(() -> {
				for (int innerIterator = 0; innerIterator < numberOfOperationsPerThread; innerIterator++) {
					observableList.add(innerIterator);
					observableList.remove(Integer.valueOf(innerIterator));
				}
				countDownLatch.countDown();
			});
		}

		// await for threads to finish task execution
		countDownLatch.await();

		executorService.shutdown();

		Assertions.assertEquals(mockTestListener.onListUpdateCallCount,
				numberOfThreads * numberOfOperationsPerThread * 2);

	}

}
