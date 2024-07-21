package patterns.observer.arrayListOperations;

import org.junit.jupiter.api.*;

import java.util.List;

public class TestObservableList {

	static class MockTestListener<T> implements ListListener<T> {
		int onListUpdateCallCount = 0;

		@Override
		public void onListUpdate(List<T> list, OperationType operationType, Object listItem) {
			onListUpdateCallCount++;
		}
	}

	@Nested
	class OperationOnPublisher {
		ObservableList<Integer> numberListObservable = new ObservableList<Integer>();
		ObservableList<String> wordListObservable = new ObservableList<String>();
		@BeforeEach
		void addItemsToObservableList() {

			// add items to first Producer
			numberListObservable.add(100);
			numberListObservable.add(200);
			numberListObservable.add(300);

			// add items to second Producer
			wordListObservable.add("Foo");
			wordListObservable.add("Bar");
			wordListObservable.add("Baz");
		}

		@DisplayName("When 3 new items are added to Producer, then size of Producer is 3")
		@Test
		void testSizeOfProducer() {
			Assertions.assertEquals(numberListObservable.size(), 3);
			Assertions.assertEquals(wordListObservable.size(), 3);
		}

		@DisplayName("When 3 new Strings('Foo', 'Bar', 'Baz') are added to wordListObservable, then these items must be present inside wordListObservable")
		@Test
		void testContentInsideWordListObservable() {
			List<String> testList = List.of("Foo", "Bar", "Baz");
			Assertions.assertEquals(testList, wordListObservable);
		}

		@DisplayName("When 3 new Integers(1, 2, 3) are added to numberListObservable, then these items must be present inside numberListObservable")
		@Test
		void testContentInsideNumberListObservable() {
			List<Integer> testList = List.of(100,200,300);
			Assertions.assertEquals(testList, numberListObservable);
		}

		@DisplayName("When an item ('Foo') is removed and a new item 'Cpt' is added to wordListObservable, then expect 'Foo' Not to Present and 'Cpt' to be present inside wordListObservable")
		@Test
		void testRemoveOperationOnWordListObservable() {
			wordListObservable.remove("Foo");
			wordListObservable.add("Cpt");
			List<String> testList = List.of("Bar", "Baz", "Cpt");

			Assertions.assertTrue(testList.size() == wordListObservable.size() && testList.containsAll(wordListObservable)
					&& wordListObservable.containsAll(testList));
		}

		@DisplayName("When a Integer(200) is removed from numberListObservable, then expect 200 to be NOT present inside numberListObservable")
		@Test
		void testRemoveOperationOnNumberListObservable() {
			numberListObservable.remove(Integer.valueOf(200));
			Assertions.assertEquals(List.of(100, 300), numberListObservable);
		}
	}
	@Nested
	class TestListeners {
		ObservableList<Integer> numberListObservable = new ObservableList<Integer>();

		MockTestListener<Integer> firstListener = new MockTestListener<Integer>();
		MockTestListener<Integer> secondListener = new MockTestListener<Integer>();
		MockTestListener<Integer> thirdListener = new MockTestListener<Integer>();

		@BeforeEach
		void registerListeners() {
			numberListObservable.registerListener(firstListener);
			numberListObservable.registerListener(secondListener);
			numberListObservable.registerListener(thirdListener);
		}

		@DisplayName("When a listener is registered to Producer's notification list, then invoke all register listener on any operation on Producer")
		@Test
		void testRegisterListenerIsNotified() {
			// add items to first observable list
			numberListObservable.add(100);

			// expect each listener to have 1 invocation to onListUpdate method
			Assertions.assertEquals(1, firstListener.onListUpdateCallCount);
			Assertions.assertEquals(1, secondListener.onListUpdateCallCount);
			Assertions.assertEquals(1, thirdListener.onListUpdateCallCount);
		}


		@DisplayName("When a listener is removed from Producer, expect that listener to be unsubscribed")
		@Test
		void testUnsubscribeOnRemovedListenerFromObservableList() {
			// unregister second listener
			numberListObservable.removeListener(secondListener);

			// add new number
			numberListObservable.add(900);

			// expect second listener not to invoke onListUpdate method
			Assertions.assertEquals(1, firstListener.onListUpdateCallCount);
			Assertions.assertEquals(0, secondListener.onListUpdateCallCount); // <-- does not receive any updates
			Assertions.assertEquals(1, thirdListener.onListUpdateCallCount);
		}
	}
}
