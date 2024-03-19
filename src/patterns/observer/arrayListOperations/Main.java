package patterns.observer.ArrayListOperations;

public class Main {

	public static void main(String[] args) {
	
		ObservableList<Integer> firstObservableList = new ObservableList<>();
		
		ListListener<Integer> firstListener = new FirstListener<Integer>();
		
		firstObservableList.registerListener(firstListener);
		
		// add items
		firstObservableList.add(1);
		firstObservableList.add(2);
		firstObservableList.add(3);
		
		// TODO: remove items
		
	}
}
