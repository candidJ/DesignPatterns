package patterns.observer.ArrayListOperations;

import java.util.List;

public interface ListListener<T> {

	 void onListUpdate(List<T> list, OperationType operationType, T listItem);
}
