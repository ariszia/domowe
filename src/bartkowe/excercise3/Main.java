package bartkowe.excercise3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	List<String> nameList = new ArrayList<String>();

	public static void main(String[] args) throws FileNotFoundException {

		Main a = new Main();
		a.readFromFile();
		System.out.println(a.nameList);
		a.countWomenNames();
	}

	public void readFromFile() throws FileNotFoundException {

		Scanner in = new Scanner(
				new FileReader("E:\\Users\\projekt_java\\Excercises\\bin\\bartkowe\\excercise3\\filename.txt"));

		while (in.hasNextLine())
			nameList.add(in.nextLine());

		in.close();
	}

	public void countWomenNames() {
		int numberOfNames = 0;

		for (String name : nameList) {
			if (name.endsWith("a")) {
				numberOfNames++;
			}

		}
		System.out.println(numberOfNames);

	}
}
