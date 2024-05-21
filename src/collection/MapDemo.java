package collection;
import java.util.HashMap;
public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> students = new HashMap<Integer,String>();
		// <keyvaluedatatype,valuedatatype>
		//any combination of data type is possible
		
		students.put(7, "Arshdeep kaur");
		students.put(2, "Arshdeep singh");
		students.put(3, "Arshdeep sodhi");
		students.put(1, "Arshdeep patel");
		students.put(8, "Arshdeep kumar");
		
		System.out.println(students.toString());
		
		students.put(2,"Akhil jose");
		System.out.println(students.toString());
		
//		students.containsKey(students)
//		students.containsValue(students)
		
		
		
		HashMap<String,String> groceryList = new HashMap<String,String>();
		
		groceryList.put("brar","paneer");
		groceryList.put("sealtest","milk");
		groceryList.put("indiagate","basmati");
		groceryList.put("britania","biscuit");
		
		System.out.println(groceryList.toString());
		
		//without the key we cannot get value
		System.out.println(groceryList.get("sealtest"));
		System.out.println(groceryList.get("brar"));
		
	}

}
