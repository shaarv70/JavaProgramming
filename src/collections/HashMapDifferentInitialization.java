package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapDifferentInitialization
{
	public static HashMap<Integer,String> mymap; 
	static
	{
		mymap= new HashMap<>();
		mymap.put(100,"200");
		mymap.put(200, "300");
	}


	public static void main(String[] args) 
	{
		//1 normal way using hashmap class

		//2. Static way:Static HashMap
		System.out.println(HashMapDifferentInitialization.mymap.get(100));

		//3. immutable map with only single entry

		Map<String,Integer> map= Collections.singletonMap("test", 100);
		System.out.println(map.get("test"));
		//map.put("abc", 200);//java.lang.UnsupportedOperationException

		//4.JDK 8

		Map<String, String> map2= Stream.of(new String[][] {
			{"Tom","AGrade"},
			{"Harry","BGrade"}
		}).collect(Collectors.toMap(data->data[0], data->data[1]));
		System.out.println(map2.get("Tom"));
		map2.put("James","CGrad");
		System.out.println(map2.get("James"));

		//5.empty map
		Map<String,String> map3= Map.of();
		//map.put("100",400);//java.lang.UnsupportedOperationException

		//6.Singleton map having single entry by above way
		Map<String,String> map4= Map.of("k1","v1");
		System.out.println(map4.get("k1"));
		//	map4.put("k2", "78"); //java.lang.UnsupportedOperationException

		//7.Multimap by above way- only 10 pairs can be stored
		Map<String,String> map5= Map.of("k1","v1","k2","V2","k3","v3");
		System.out.println(map5.get("k3"));
		
		//9. Create synchronized hashmap
		HashMap<Integer,String> mymap1= new HashMap();
		mymap1.put(100,"200");
		mymap1.put(200, "300"); 
		mymap1.put(500, "789");
		
		Map  sync=Collections.synchronizedMap(mymap1);
		System.out.println(sync);
		
		
		//10.Concurrent HashMap:It doesnt throw concurrentmodificationexception(thread safe)multithreading allowed- here lock is present 
		//on segment level not on complete object level. 
		
		ConcurrentHashMap<Integer, String> con= new ConcurrentHashMap<Integer, String>();
		con.put(400,"Naveen");
		con.put(678, "Udemy");
		con.put(878, "qa automation");
		System.out.println(con.get(678));
		

		//11 Maps using Guava- for this we need to add  guava dependency in pom.xml  

		/*	Map<String,String> map6= ImmutablMap.of("Google","GoogleIndia","Amazon","AmazonIndia");

          syso(map6.get("Google");
           map6.put("KPIT","Technologyu"); java.lang.UnsupportedOperationException*/


	}

}
