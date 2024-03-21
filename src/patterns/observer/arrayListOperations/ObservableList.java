package patterns.observer.arrayListOperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObservableList<T> extends java.util.ArrayList<T> {

	private List<ListListener<T>> listeners = Collections.synchronizedList(new ArrayList<>());

	public synchronized void registerListener(ListListener<T> listener) {
		listeners.add(listener);
	}

	public synchronized void removeListener(ListListener<T> listener) {
		listeners.remove(listener);
	}

	private synchronized void notifyListeners(OperationType operationType, Object item) {
		for (ListListener<T> listener : listeners) {
			listener.onListUpdate(this, operationType, item);
		}

	}

	// Add operations
	@Override
	public synchronized boolean add(T item) {
		boolean isItemAddedToTheList = false;
		try {
			isItemAddedToTheList = super.add(item);
			// notify each subscriber when new item is ADDED to list
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
			// notify each subscriber when new item is ADDED to list
			this.notifyListeners(OperationType.ADD, item);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Index out of bounds. Cannot add item at index " + index + ".");
			e.printStackTrace();
		}

	}

	// Remove operations
	@Override
	public synchronized T remove(int index) {
		T removedItem = null;
		try {
			removedItem = super.remove(index);
			// notify each subscriber when new item is REMOVED from list
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
			// notify each subscriber when new item is REMOVED from the list
			this.notifyListeners(OperationType.REMOVE, item);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isItemRemovedToTheList;
	}

}
