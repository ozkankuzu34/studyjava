import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Ders4 {
	
	public static void main(String[] args) {
		/*
		String[] myStringArray=new String[3];
		myStringArray[0]="James";
		myStringArray[1]="Lars";
		myStringArray[2]="Kirk";
		
		System.out.println(myStringArray[1]);
		
		int[] myIntegerArray=new int[3];
		
		myIntegerArray[0]=50;
		myIntegerArray[1]=60;
		myIntegerArray[2]=70;
		
		System.out.println(myIntegerArray[1]);
		
		int[] myNumberArray= {1,2,3,4,5,6,7,8};
		
		System.out.println(myNumberArray[2]);
		*/
		
		
		/*
		//lists
		ArrayList<String> myMusicians=new ArrayList<String>();
		myMusicians.add("james");
		myMusicians.add("Lars");
		myMusicians.add(1, "kirk");
		myMusicians.add("rob");
		
		System.out.println(myMusicians.get(0));
		System.out.println(myMusicians.get(1));
		System.out.println(myMusicians.get(2));
		System.out.println(myMusicians.get(3));
		
		*/
		/*
		//Set
		HashSet<String> mySet=new HashSet<>();
		mySet.add("James");
		mySet.add("James");
		
		System.out.println(mySet.size());
		*/
		
		//HashMap
		HashMap<String, String> myHashMap=new HashMap<>();
		myHashMap.put("name", "james");
		myHashMap.put("instrument", "guitar");
		
		System.out.println(myHashMap.get("name"));
		System.out.println(myHashMap.get("instrument"));
		
		HashMap<String, Integer>mySecondMap=new HashMap<>();
		mySecondMap.put("run", 100);
		mySecondMap.put("basketball", 200);
		
		System.out.println(mySecondMap.get("run"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
