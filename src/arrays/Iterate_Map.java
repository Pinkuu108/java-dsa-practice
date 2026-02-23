package arrays;

import java.util.HashMap;
import java.util.Map;

public class Iterate_Map {

	public static void main(String[] args) {
	Map<Integer, String> m=new HashMap<Integer, String>();
	m.put(1, "a");
	m.put(2, "d");
	m.put(3, "b");
	m.put(4, "c");
	for (Integer key : m.keySet()) {
		System.out.println(m+" "+m.get(key));
	}
	
	}

}
