package bartkowe.excercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Excercise2 {

	String user;
	
	public static void main(String[] args) {
		String user = "";
		String decision = "";
		
		Scanner input2 = new Scanner(System.in);
		List<String> userlist = new ArrayList<String>();
		
		do {
			System.out.println("Username:    or quit?");
			userlist.add(input2.nextLine());
		} while (!userlist.get(userlist.size() -1).equals("quit"));
		
		int index = 0;
		do {
			System.out.println("Hi " + userlist.get(index));
			index++;
		} while (!userlist.get(index).equals("quit"));
	}

}
