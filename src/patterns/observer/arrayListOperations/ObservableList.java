package patterns.observer.ArrayListOperations;

import java.util.ArrayList;

public class ObservableList<T> extends java.util.ArrayList<T>{
	
	private ArrayList<ListListener<T>> listeners = new ArrayList<>();
	
	
	public void registerListener(ListListener<T>listener) {
			listeners.add(listener);
	}
	
	public void removeListener(ListListener<T> listener) {
		listeners.remove(listener);
//		this.notifyListeners(OperationType.REMOVE);
	}
	
	
	public void notifyListeners(OperationType operationType, T item) {
		for(ListListener<T> listener: listeners ) {
			listener.onListUpdate(this, operationType, item);
		}
		
	}
	
	
	@Override
	public boolean add(T item) {
		boolean isItemAddedToTheList = false;
		try {
		  isItemAddedToTheList = super.add(item);
		  // notify each subscriber when new item is added to list
		  this.notifyListeners(OperationType.ADD, item);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isItemAddedToTheList;
		
	}
	
//	@Override
//	public boolean remove(Object item) {
//		boolean isItemRemovedToTheList = false;
//		try {
//			isItemRemovedToTheList = super.remove(item);
//		  // notify each subscriber when new item is added to list
//		  this.notifyListeners(OperationType.REMOVE, item);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return isItemRemovedToTheList;
//		
//	}
//	
	
}
