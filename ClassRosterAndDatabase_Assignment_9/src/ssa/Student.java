package ssa;

import java.util.*;

public class Student {
			 static ArrayList<Student> classRoster = new ArrayList<>();
			 public String firstName;
			 public String lastName;
			 public String id; 
			 public String eyeColor; 
			 public int monthsEmployed;
			 
public Student(){
//	if(ClassRoster == null) {
//		classRoster = new ArrayList<Student>();
//		Init();
}

public Student(String id, String firstName, String lastName, String eyeColor, int monthsEmployed) {
	  this.id = id;
	  this.firstName = firstName;
	  this.lastName = lastName;
	  this.eyeColor = eyeColor;
	  this.monthsEmployed = monthsEmployed;
	
//	  public void printClassRoster() {
//			Collections.sort(classRoster);
//			this.printRosterHeader();
//			for(Student aStudent : classRoster) {
//				this.printStudentDetail(aStudent);
//			}
//		}
}


			 
public String getFirstName() {
	return firstName;
}



public void setFirstName(String firstName) {
	this.firstName = firstName;
}



public String getLastName() {
	return lastName;
}



public void setLastName(String lastName) {
	this.lastName = lastName;
}



public String getId() {
	return id;
}



public void setId(String id) {
	this.id = id;
}



public String getEyeColor() {
	return eyeColor;
}



public void setEyeColor(String eyeColor) {
	this.eyeColor = eyeColor;
}



public int getMonthsEmployed() {
	return monthsEmployed;
}



public void setMonthsEmployed(int monthsEmployed) {
	this.monthsEmployed = monthsEmployed;
}

public static Comparator<Student> FirstNameComparator
= new Comparator<Student>() {

public int compare(Student s1, Student s2) {

String firstName1 = s1.getFirstName();
String firstName2 = s2.getFirstName();

//ascending order
return firstName1.compareTo(firstName2);

//descending order
//return fruitName2.compareTo(fruitName1);
}

};


public void printClassRoster() {

	Student evan = new Student("008888", "Evan", "Tizard", "Brown", 12);
	Student michael = new Student("001122", "Michael", "Clair", "Other", 12);
	Student stephen = new Student("001212", "Stephen", "Rook", "Brown", 11);
	Student jonathan = new Student("474143", "Jonathan", "Stafford", "Brown", 13);
	Student kyle = new Student("005295", "Kyle", "Deen", "Blue", 2);
	Student kevin = new Student("004400", "Kevin", "Tran", "Other", 12);
	Student reuben = new Student("132617", "Reuben", "Turner", "Blue", 12);
	Student li = new Student("306700", "Li", "Lui", "Brown", 12);
	Student joshua = new Student("215296", "Joshua", "Franey", "Other", 27);
	Student gabriel = new Student("523420", "Gabriel", "Hamilton", "Black", 10);
	Student aisha = new Student("004014", "Aisha", "Covington", "Brown", 10);
	Student arun = new Student("006789", "Arun", "Soma", "Brown", 2);
	Student steve = new Student("009999", "Steve", "Ellwood", "Other", 2);
	Student shaquill = new Student("3943769", "Shaquill", "Timmons", "Brown", 11);
	Student karen = new Student("001449", "Karen", "Reiter", "Blue", 10);
	Student dax = new Student("267252", "Dax", "Richards", "Brown", 12);
	Student mike = new Student("229949", "Mike", "Sykes", "Brown", 13);
	Student daniel = new Student("772223", "Daniel", "Kiros", "Brown", 3);
	Student peter = new Student("004444", "Peter", "Choi", "Brown", 2);
	Student joe = new Student("005255", "Joe", "Hill", "Brown", 2);
	
	
	
	classRoster.add(evan);
	classRoster.add(michael);
	classRoster.add(stephen);
	classRoster.add(jonathan);
	classRoster.add(kyle);
	classRoster.add(kevin);
	classRoster.add(reuben);
	classRoster.add(li);
	classRoster.add(joshua);
	classRoster.add(gabriel);
	classRoster.add(aisha);
	classRoster.add(arun);
	classRoster.add(steve);
	classRoster.add(shaquill);
	classRoster.add(karen);
	classRoster.add(dax);
	classRoster.add(mike);
	classRoster.add(daniel);
	classRoster.add(peter);
	classRoster.add(joe);
	
	
	
	
	
	System.out.println("Student Class Roster");
	System.out.println(" ");
	System.out.println("Empl Id  " + "First name  " + "Last Name" + "   Eye color" + "   Months at SSA");
	System.out.println("=======  " + "==========  " + "=========   " + "=========   " + "=============     ");
	
	Collections.sort(classRoster,FirstNameComparator );
	for(Student student: classRoster)
		System.out.printf("%-10s %s %s %s %d %n",student.getId(), student.getFirstName(), student.getLastName(), student.getEyeColor(), student.getMonthsEmployed());
	 
	// Sorted
	
	//Collections.sort(classRoster,FirstNameComparator );
	
//	for(Student student: classRoster)
//	System.out.println(student.getFirstName());
//			
}
//	public Student() {
//		if(ClassRoster == null) {
//			classRoster = new ArrayList<Student>();
//			Init();
//		}
//	}
//HashMap<String, String> studentRoster = new HashMap<String, String>();
//studentRoster.put("00888", "Evan");
//studentRoster.put("001122", "Michael");
//studentRoster.put("001212", "Stephen");
//studentRoster.put("474143", "Jonathan");
//studentRoster.put("005295", "Kyle");
//studentRoster.put("004400", "Kevin");
//studentRoster.put("004400", "Kevin");
//studentRoster.put("132617", "Reuben");
//studentRoster.put("306700", "Li");
//studentRoster.put("132617", "Reuben");
//studentRoster.put("215296", "Joshua");
//studentRoster.put("523420", "Gabriel");
//studentRoster.put("004014", "Aisha");
//studentRoster.put("006789", "Arun");
//studentRoster.put("009999", "Steve");
//studentRoster.put("3943769", "Shaquill");
//studentRoster.put("001449", "Karen");
//studentRoster.put("267252", "Dax");
//studentRoster.put("229949", "Mike");
//studentRoster.put("004444", "Peter");
//studentRoster.put("005255", "Joe");
//
//String studentRosterList = studentRoster.get("008888");
//System.out.println(id + firstName + lastName);

}