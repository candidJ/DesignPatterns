package patterns.observer.arrayListOperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Subject/Producer/Notifier
public class ObservableList<T> extends java.util.ArrayList<T> {

	// List of interested Listeners/Subscribers/Observers
	private List<ListListener<T>> listeners = Collections.synchronizedList(new ArrayList<>());

	public void registerListener(ListListener<T> listener) {
		synchronized (listener) {
			listeners.add(listener);
		}
	}

	public void removeListener(ListListener<T> listener) {
		synchronized (listener) {
			listeners.remove(listener);
		}
	}

	private void notifyListeners(OperationType operationType, Object item) {
		synchronized (listeners) {
			for (ListListener<T> listener : listeners) {
				listener.onListUpdate(this, operationType, item);
			}
		}
	}

	// Add operations on Subject notifies each subscriber when a new item is ADDED
	@Override
	public synchronized boolean add(T item) {
		boolean isItemAddedToTheList = false;
		try {
			isItemAddedToTheList = super.add(item);
			this.notifyListeners(OperationType.ADD, item);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isItemAddedToTheList;
	}

	@Override
	public synchronized void add(int index, T item) {
		try {
			super.add(index, item);
			this.notifyListeners(OperationType.ADD, item);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Index out of bounds. Cannot add item at index " + index + ".");
			e.printStackTrace();
		}

	}

	// Remove operations on Subject notifies each subscriber when a new item is Removed
	@Override
	public synchronized T remove(int index) {
		T removedItem = null;
		try {
			removedItem = super.remove(index);
			this.notifyListeners(OperationType.REMOVE, removedItem);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Index out of bounds. Cannot remove item at index " + index + ".");
			e.printStackTrace();
		}
		return removedItem;

	}

	@Override
	public synchronized boolean remove(Object item) {
		boolean isItemRemovedToTheList = false;
		try {
			isItemRemovedToTheList = super.remove(item);
			this.notifyListeners(OperationType.REMOVE, item);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isItemRemovedToTheList;
	}
	
	@Override
	public void removeRange(int fromIndex, int toIndex) {
		
		try {
			List<T> subList = super.subList(fromIndex, toIndex);
			super.removeRange(fromIndex, toIndex);
			
			for(T itemT: subList) {
				this.notifyListeners(OperationType.REMOVE, itemT);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
