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
		
		int numberOfThreads = 1000;
		int numberOfOperationsPerThread = 1000;
		
		  ExecutorService executorService = Executors.newFixedThreadPool(numberOfOperationsPerThread);
		  CountDownLatch countDownLatch = new CountDownLatch(numberOfThreads);
		  
		  ObservableList<Integer> observableList = new ObservableList<>();
		  MockTestListener<Integer> mockTestListener = new MockTestListener<>();
		  
		  observableList.registerListener(mockTestListener);
		
		  for(int index = 0; index < numberOfThreads; index++) {
			  // start a new thread
			  executorService.execute(()-> {
				  observableList.add(1);
				  observableList.remove(Integer.valueOf(1));
				  
				  countDownLatch.countDown();
			  });
		  }
		  
		  // wait for thread to finish execution
		  countDownLatch.await();

		  Assertions.assertEquals(mockTestListener.onListUpdateCallCount, numberOfOperationsPerThread * 2);
		  executorService.shutdown();
	}

}
