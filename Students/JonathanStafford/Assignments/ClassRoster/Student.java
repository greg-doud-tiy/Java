package ssa;

import java.util.*;

public class Student  {

	public String id;
	public String firstName;
	public String lastName;
	public int monthsEmployed;
	public String eyeColor;
	
public static Comparator<Student> FirstNameComparator
    = new Comparator<Student>() {

@Override
public int compare(Student std1, Student std2) {

String firstName1 = std1.firstName;
String firstName2 = std2.firstName;

//ascending order
return firstName1.compareTo(firstName2);


}
};

void printclassRoster() {

		Student jonathan = new Student();
		jonathan.eyeColor = "brown";
		jonathan.firstName = "Jonathan";
		jonathan.lastName = "Stafford";
		jonathan.monthsEmployed = 13;
		jonathan.id = "474143";

		Student kyle = new Student();
		kyle.eyeColor = "blue";
		kyle.firstName = "Kyle";
		kyle.lastName = "Deen";
		kyle.monthsEmployed = 2;
		kyle.id = "005295";

		Student kevin = new Student();
		kevin.eyeColor = "other";
		kevin.firstName = "Kevin";
		kevin.lastName = "Tran";
		kevin.monthsEmployed = 12;
		kevin.id = "004400";

		Student rueben = new Student();
		rueben.eyeColor = "blue";
		rueben.firstName = "Rueben";
		rueben.lastName = "Tuner";
		rueben.monthsEmployed = 12;
		rueben.id = "132617";

		Student li = new Student();
		li.eyeColor = "brown";
		li.firstName = "Li";
		li.lastName = "Lui";
		li.monthsEmployed = 12;
		li.id = "306700";

		Student joshua = new Student();
		joshua.eyeColor = "other";
		joshua.firstName = "Joshua";
		joshua.lastName = "Franey";
		joshua.monthsEmployed = 27;
		joshua.id = "215296";

		Student gabriel = new Student();
		gabriel.eyeColor = "other";
		gabriel.firstName = "Gabriel";
		gabriel.lastName = "Hamilton";
		gabriel.monthsEmployed = 10;
		gabriel.id = "523420";

		Student aisha = new Student();
		aisha.eyeColor = "brown";
		aisha.firstName = "Aisha";
		aisha.lastName = "Covington";
		aisha.monthsEmployed = 10;
		aisha.id = "004014";

		Student arun = new Student();
		arun.eyeColor = "brown";
		arun.firstName = "Arun";
		arun.lastName = "Soma";
		arun.monthsEmployed = 2;
		arun.id = "006789";

		Student steve = new Student();
		steve.eyeColor = "other";
		steve.firstName = "Steve";
		steve.lastName = "Green";
		steve.monthsEmployed = 2;
		steve.id = "009999";

		Student shaquil = new Student();
		shaquil.eyeColor = "brown";
		shaquil.firstName = "Shaquil";
		shaquil.lastName = "Timmons";
		shaquil.monthsEmployed = 11;
		shaquil.id = "393769";

		Student karen = new Student();
		karen.eyeColor = "blue";
		karen.firstName = "Karen";
		karen.lastName = "Reiter";
		karen.monthsEmployed = 10;
		karen.id = "001449";

		Student dax = new Student();
		dax.eyeColor = "brown";
		dax.firstName = "Dax";
		dax.lastName = "Richards";
		dax.monthsEmployed = 12;
		dax.id = "267252";

		Student mike = new Student();
		mike.eyeColor = "brown";
		mike.firstName = "Mike";
		mike.lastName = "Sykes";
		mike.monthsEmployed = 13;
		mike.id = "229949";

		Student daniel = new Student();
		daniel.eyeColor = "brown";
		daniel.firstName = "Daniel";
		daniel.lastName = "Kiros";
		daniel.monthsEmployed = 3;
		daniel.id = "772223";

		Student peter = new Student();
		peter.eyeColor = "brown";
		peter.firstName = "Peter";
		peter.lastName = "Choi";
		peter.monthsEmployed = 2;
		peter.id = "004444";

		Student joe = new Student();
		joe.eyeColor = "brown";
		joe.firstName = "Joe";
		joe.lastName = "Hill";
		joe.monthsEmployed = 13;
		joe.id = "005255";

		Student michael = new Student();
		michael.eyeColor = "other";
		michael.firstName = "Michael";
		michael.lastName = "Clair";
		michael.monthsEmployed = 12;
		michael.id = "001122";

		Student stephen = new Student();
		stephen.eyeColor = "brown";
		stephen.firstName = "Stephen";
		stephen.lastName = "Rook";
		stephen.monthsEmployed = 11;
		stephen.id = "001212";

		Student evan = new Student();
		evan.eyeColor = "brown";
		evan.firstName = "Evan";
		evan.lastName = "Tizard";
		evan.monthsEmployed = 12;
		evan.id = "008888";

		ArrayList<Student> students = new ArrayList<Student>();

		// adds items into an array list
		students.add(aisha);
		students.add(arun);
		students.add(jonathan);
		students.add(kevin);
		students.add(steve);
		students.add(stephen);
		students.add(li);
		students.add(karen);
		students.add(peter);
		students.add(daniel);
		students.add(kyle);
		students.add(dax);
		students.add(michael);
		students.add(gabriel);
		students.add(evan);
		students.add(joshua);
		students.add(rueben);
		students.add(mike);
		students.add(joe);
		students.add(shaquil);

		// sorts Array list alphabetical order

		System.out.println("Empl Id   First name         Last name          Eye color   Months at SSA");
		System.out.println("=======   ================   ================   =========   =============");
		
		Collections.sort(students, FirstNameComparator);
		for (Student studentData : students) {

			System.out.printf("%s     ", studentData.id);
			System.out.printf("%-8s          ", studentData.firstName);
			System.out.printf("%-9s           ", studentData.lastName);
			System.out.printf("%-5s      ", studentData.eyeColor);
			System.out.printf("%2s\n", studentData.monthsEmployed);
		}

		HashMap<String, Student> theStudents = new HashMap<String, Student>();
		theStudents.put(jonathan.id, jonathan);
		theStudents.put(kevin.id, kevin);
		theStudents.put(steve.id, steve);
		theStudents.put(stephen.id, stephen);
		theStudents.put(li.id, li);
		theStudents.put(karen.id, karen);
		theStudents.put(peter.id, peter);
		theStudents.put(daniel.id, daniel);
		theStudents.put(kyle.id, kyle);
		theStudents.put(dax.id, dax);
		theStudents.put(aisha.id, aisha);
		theStudents.put(michael.id, michael);
		theStudents.put(gabriel.id, gabriel);
		theStudents.put(evan.id, evan);
		theStudents.put(arun.id, arun);
		theStudents.put(joshua.id, joshua);
		theStudents.put(rueben.id, rueben);
		theStudents.put(mike.id, mike);
		theStudents.put(joe.id, joe);
		theStudents.put(shaquil.id, shaquil);
		
		System.out.println();
		System.out.println("Empl Id   First name         Last name          Eye color   Months at SSA");
		System.out.println("=======   ================   ================   =========   =============");
		
		Student studentInfo1 = theStudents.get(jonathan.id);
		System.out.printf("%s     ", studentInfo1.id);
		System.out.printf("%-8s          ", studentInfo1.firstName);
		System.out.printf("%-9s           ", studentInfo1.lastName);
		System.out.printf("%-5s      ", studentInfo1.eyeColor);
		System.out.printf("%2s\n", studentInfo1.monthsEmployed);

		Student studentInfo2 = theStudents.get(shaquil.id);
		System.out.printf("%s     ", studentInfo2.id);
		System.out.printf("%-8s          ", studentInfo2.firstName);
		System.out.printf("%-9s           ", studentInfo2.lastName);
		System.out.printf("%-5s      ", studentInfo2.eyeColor);
		System.out.printf("%2s\n", studentInfo2.monthsEmployed);
		
		Student studentInfo3 = theStudents.get(gabriel.id);
		System.out.printf("%s     ", studentInfo3.id);
		System.out.printf("%-8s          ", studentInfo3.firstName);
		System.out.printf("%-9s           ", studentInfo3.lastName);
		System.out.printf("%-5s      ", studentInfo3.eyeColor);
		System.out.printf("%2s\n", studentInfo3.monthsEmployed);
	}
}
