package dictionaryobsolete;

import java.util.Dictionary;
import java.util.Enumeration;

public class DictionaryToy extends Dictionary {
	
	public int size() {
		return 1;
	}
	
	public boolean isEmpty() {
		return true;
	}
	
	public Enumeration keys() {
		return null;
	}
	
	public Enumeration elements() {
		return null;
	}
	
	public Object get(Object key) {
		return 1;
	}
	
	public Object put(Object key, Object value) {
		return null;
	}
	
	public Object remove(Object key) {
		return null;
	}
	
}
