package patterns.observer.arrayListOperations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestObservableList {

	static class MockTestListener<T> implements ListListener<T> {
		int onListUpdateCallCount = 0;

		@Override
		public void onListUpdate(List<T> list, OperationType operationType, Object listItem) {
			onListUpdateCallCount++;
		}
	}


	@DisplayName("When new operations is performed on ObservableList, then ObservableList is updated")
	@Test
	void testAddAndRemoveOperationsOnObservableList() {

		ObservableList<Integer> numberListObservable = new ObservableList<Integer>();
		ObservableList<String> wordListObservable = new ObservableList<String>();

		// add items to first observable list
		numberListObservable.add(100);
		numberListObservable.add(200);
		numberListObservable.add(300);

		// remove items from second observable list
		numberListObservable.remove(Integer.valueOf(200));
		
		Assertions.assertEquals(List.of(100, 300), numberListObservable);

		// add items to second observable list
		wordListObservable.add("Foo");
		wordListObservable.add("Bar");
		wordListObservable.add("Baz");

		// remove items from second observable list
		wordListObservable.remove("Foo");

		wordListObservable.add("Cpt");
		
		wordListObservable.set(0, null);

		List testList = List.of("Bar", "Baz", "Cpt");
		Assertions.assertTrue(testList.size() == wordListObservable.size() && testList.containsAll(wordListObservable)
				&& wordListObservable.containsAll(testList));

	}
	
	@DisplayName("When a listener is removed from Observable List, expect that listener to be unsubscribed")
	@Test
	void testUnsubscribeOnRemovedListenerFromObservableList() {
		ObservableList<Integer> numberListObservable = new ObservableList<Integer>();

		MockTestListener<Integer> firstListener = new MockTestListener<Integer>();
		MockTestListener<Integer> secondListener = new MockTestListener<Integer>();
		MockTestListener<Integer> thirdListener = new MockTestListener<Integer>();

		numberListObservable.registerListener(firstListener);
		numberListObservable.registerListener(secondListener);
		numberListObservable.registerListener(thirdListener);

		// add items to first observable list
		numberListObservable.add(100);

		// expect each listener to have 1 invocation to onListUpdate method
		Assertions.assertEquals(1, firstListener.onListUpdateCallCount);
		Assertions.assertEquals(1, secondListener.onListUpdateCallCount);
		Assertions.assertEquals(1, thirdListener.onListUpdateCallCount);
		
		
		// unregister second listener
		numberListObservable.removeListener(secondListener);
		
		// add new number
		numberListObservable.add(900);
		
		// expect second listener not to invoke onListUpdate method
		Assertions.assertEquals(2, firstListener.onListUpdateCallCount);
		Assertions.assertEquals(1, secondListener.onListUpdateCallCount); // <-- does not receive any updates
		Assertions.assertEquals(2, thirdListener.onListUpdateCallCount);
		
	}
}
