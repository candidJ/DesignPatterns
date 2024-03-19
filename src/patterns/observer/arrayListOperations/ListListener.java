package patterns.observer.arrayListOperations;

import java.util.List;

public interface ListListener<T> {

	 void onListUpdate(List<T> list, OperationType operationType, Object listItem);
}
