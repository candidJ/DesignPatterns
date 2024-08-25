package patterns.observer.arrayListOperations;

public class ArrayListOperationsApplication {

	public static void main(String[] args) {

		// instances of Producer/Subject
		ObservableList<Integer> numberListObservable = new ObservableList<>();
		ObservableList<String> wordListObservable = new ObservableList<>();

		// instance of subscribers/observers/listener
		ListListener<Integer> firstListener = new TestListener<>();
		ListListener<String> secondListener = new TestListener<>();

		// register/add the Subscribers to Producers
		numberListObservable.registerListener(firstListener);
		wordListObservable.registerListener(secondListener);

		// Performing operations(ADD and REMOVE) on Producer will trigger notification to all Listeners
		numberListObservable.add(100);
		numberListObservable.add(200);
		numberListObservable.add(300);
		numberListObservable.remove(1);

		wordListObservable.add("Foo");
		wordListObservable.add("Bar");
		wordListObservable.add("Baz");
		wordListObservable.remove(0);

		// unsubscribe a listener ('firstListener')
		numberListObservable.removeListener(firstListener);
		// should not trigger notification for unregistered listener ('firstListener')
		numberListObservable.add(400);

		// operations on Subject continues to trigger notification on registered listener (wordListObservable)
		wordListObservable.add("Cyx");
	}
}
