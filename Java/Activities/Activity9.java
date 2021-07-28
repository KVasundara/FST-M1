import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Jin");
		myList.add("Jimin");
		myList.add("Jhope");
		myList.add(0,"V");
		myList.add(2, "JK");
		System.out.println("Print All the objects:");
		for(String s:myList) {
			System.out.println(s);
		}
		 System.out.println("3rd element in the list is: " + myList.get(2));
	        System.out.println("Is RM is in list: " + myList.contains("RM"));
	        System.out.println("Size of ArrayList: " + myList.size());
	        myList.remove(1);
	        System.out.println("New Size of ArrayList: " + myList.size());
		}

}
