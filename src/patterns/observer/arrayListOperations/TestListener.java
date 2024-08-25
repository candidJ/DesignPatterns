package patterns.observer.arrayListOperations;

import java.util.List;

// Concrete Subscriber
public class TestListener<T> implements ListListener<T>{

	@Override
	public void onListUpdate(List<T> list, OperationType operationType, Object listItem) {
		if(list.isEmpty()) {
			System.out.println("The list is empty.");
		} else {
			System.out.println("Item "+ listItem + " is" + (operationType == OperationType.ADD ? " added" : " removed")+ ". Updated List: " + list);
		}
	}
}
