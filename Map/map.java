//kisi bhi elemt ko add karna delete karna present hai ki nhi get karna sab O(1) me hota hai
//Types of map:
//1.Hashmap,2.TreeMap,3.LinkedHash Map
//key is always unique.
package Map;
import java.util.*;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Ankit", 77);
		map.put("Rajat_Bklol", 7);
		map.put("Nikhil", 67);
		map.put("Amisha", 78);
		map.put("Anku", 68);
		map.put("Puneet", 48);
		map.put("Rajat_Bklol", 27);
		map.put("Pooja", 98);
//		map.put(null, 77);
		System.out.println(map);
		System.out.println(map.containsKey("Rahul"));
//		Set<String> key = map.keySet();
//		for (String k : key) {
//			System.out.println(k + " " + map.get(k));
//		}
		//Set<String> key = map.keySet();
		for (String k :  map.keySet()) {
			System.out.println(k + " " + map.get(k));
		}
//		// remove
//		System.out.println(map.remove("Pooja"));
//		System.out.println(map);
//		// key prsent hai ya nhi
//		System.out.println(map.containsKey("Rajat_Bklol"));
//		System.out.println(map.containsKey("Ramu"));
//		// get
//		System.out.println(map.get("Rajat_Bklol"));
//		System.out.println(map.get("Kamlesh"));

		TreeMap<String, Integer> map1 = new TreeMap<>();//hasmap ke andar value ese hi random order me store hota hai par treemap ke andar key ko sorted order me rakhte hai.isme null as a key aa sakta hai complexity-log(n) isme key ko null nhi kar sakte
		map1.put("Ankit", 77);
		map1.put("Rajat_Bklol", 7);
		map1.put("Nikhil", 67);
		map1.put("Amisha", 78);
		map1.put("Anku", 68);
		map1.put("Puneet", 48);
		map1.put("Rajat_Bklol", 27);
		map1.put("Pooja", 98);
//		map.put(null, 77);
	//	System.out.println(map1);
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();//Insertion order preserve hai.Matlab jis order me value daloge usi order me print hoga
		map2.put("Ankit", 77);
		map2.put("Rajat_Bklol", 7);
		map2.put("Nikhil", 67);
		map2.put("Amisha", 78);
		map2.put("Anku", 68);
		map2.put("Puneet", 48);
		map2.put("Rajat_Bklol", 27);
		map2.put("Pooja", 98);
//		map.put(null, 77);
	//	System.out.println(map2);
	//way-1
	Set<String> key=map2.keySet();
	System.out.println(key);
	for(String k:key){
		System.out.println(k+" "+map2.get(k));//key or uske corresponding value
	}
	//way-2
	ArrayList<String> li=new ArrayList<>(map.keySet());
	for(int i=0;i<li.size();i++){
		System.out.print(li.get(i)+" "+ map.get(li.get(i))+" ");

	}

	}
}