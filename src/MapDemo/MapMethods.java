package MapDemo;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * public interface Map<K,V>
 * 
 * int size(): return the number of key-value (entries) mappings in map.
 * 
 * boolean isEmpty(): return true if map contains no key-value (entries) mappings else false.
 * 
 * boolean containsKey(Object key): return true if map contains a mapping for the specified key.
 * 
 * boolean containsValue(Object value): return true if map maps one or more keys to the specified value.
 * 
 * Object get(Object key): return the value to which the specified key is mapped, or null if map contains no mapping for the key.
 * 
 * Object put(K key, V value): return the previous value associated with key, or null if there was no mapping for key.
 * (insert entry and return previous value)
 * 
 * Object remove(Object key): return the previous value associated with key, or null if there was no mapping for key.
 * (remove entry and return old value)
 * 
 * void putAll(Map m): copies all of the mappings from the specified map to map (m).
 * 
 * void clear(): removes all of the mappings from map. The map will be empty after this call returns.
    
 * Set keySet(): return a set view of the keys contained in map.
 * 
 * Collection<V> values(): return a collection view of the values contained in map.
 * 
 * Set entrySet(): return a set view of the mappings contained in map.
 * 
 * interface Entry<K,V> --> inner interface of map (if no map then what is use of entry hence it is inner interface)
 * 
 * Object getKey(): return the key corresponding to entry.
 * 
 * Object getValue(): return the value corresponding to entry.
 * 
 * Object setValue(Object value): return old value corresponding to the entry.
 * 
 * 
 * @author Dharmik Mehta
 */
public class MapMethods {
	public static void main(String[] args) {
		
		
	}
}