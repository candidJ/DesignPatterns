package patterns.observer.arrayListOperations;

public class ArrayListOperationsApplication {

	public static void main(String[] args) {
	
		ObservableList<Integer> numberListObservable = new ObservableList<Integer>();
		ObservableList<String> wordListObservable = new ObservableList<String>();
		
		ListListener<Integer> firstListener = new TestListener<Integer>();
		ListListener<String> secondListener = new TestListener<String>();
		
		numberListObservable.registerListener(firstListener);
		wordListObservable.registerListener(secondListener);
		
		// add items to first observable list
		numberListObservable.add(100);
		numberListObservable.add(200);
		numberListObservable.add(300);
		
		// remove items from second observable list
		numberListObservable.remove(1);
		
		// add items to second observable list
		wordListObservable.add("Foo");
		wordListObservable.add("Bar");
		wordListObservable.add("Baz");
		
		// remove items from second observable list
		wordListObservable.remove(0);
		
		// unregister listener
		numberListObservable.removeListener(firstListener);
		numberListObservable.add(400); // should not trigger listener
		
		// operations on registered listener (wordListObservable) continue to work correctly
		wordListObservable.add("Cyx");
	}
}
