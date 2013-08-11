package net.davidjkelley.recipes.client;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.user.client.ui.ListBox;

public class EasyListBox<T> extends ListBox {
	private Map<Integer, T> indexToObjectMap = new HashMap<Integer, T>();
	
	public void addItem (String name, String value, T o) {
		addItem(name, value);
		indexToObjectMap.put(new Integer(getItemCount() - 1), o);
	}
	
	public T getSelectedObject () {
		int index = getSelectedIndex();
		T o = indexToObjectMap.get(index);
		return o;
	}
	
	public void setSelectedObject (T object) {
		if (object == null) {
			return;
		}
		
		for (Integer i : indexToObjectMap.keySet()) {
			T value = indexToObjectMap.get(i);
			if (value.equals(object)) {
				this.setSelectedIndex(i);
				return;
			}
		}
	}
}
