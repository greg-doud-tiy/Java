package ssa;

import java.util.ArrayList;
import java.util.Collections;

public class ClassRoster {

	void classRosterReport() {
		
		//creates an array list
		ArrayList<String> students = new ArrayList<String>();
		ArrayList<String> studentsWorkPlace = new ArrayList<String>();
		
		
		//adds items into an array list
		students.add("Shaquil");
		students.add("Jonathan");
		students.add("Kevin");
		students.add("Stephen R.");
		students.add("Stephen E.");
		students.add("Li");
		students.add("Karen");
		students.add("Peter");
		students.add("Daniel");
		students.add("Kyle");
		students.add("Jarrett");
		students.add("Dax");
		students.add("Aisha");
		students.add("Greg");
		students.add("Amsal");
		students.add("Michael C.");
		students.add("Gabriel");
		students.add("Evan");
		students.add("Arunkumar");
		students.add("Joshua");
		students.add("Reuben");
		students.add("Michael S.");
		students.add("Joseph");

		// sorts Array list alphabetical order
		Collections.sort(students);
		System.out.println("Student Names in ascending order:");
		for (String name : students) {
			System.out.printf("Name is %s\n", name);
		}
		System.out.println();
		// sorts in reverse order
		Collections.sort(students, Collections.reverseOrder());
		System.out.println("Student Names in descending order:");
		for (String name : students) {
			System.out.printf("Name is %s\n", name);
		}
		//counts items in array list
		int itemCount = students.size();
		System.out.println();
		System.out.printf("Total Number of students is %d", itemCount);
	}
}
