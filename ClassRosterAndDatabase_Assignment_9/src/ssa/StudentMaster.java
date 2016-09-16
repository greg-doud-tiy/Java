package ssa;
import java.util.*;
public class StudentMaster implements Comparable<StudentMaster> {
	static ArrayList<StudentMaster> classRoster = null;
	
	public String id;
	public String firstName;
	public String lastName;
	public String eyeColor;
	public int monthsEmployed;

	public void printClassRoster() {
		printStudentsByFirstName();
		printMeAndIdsNearMe();
	}
	void printStudentsByFirstName() {
		// print roster in FirstName sequence
		Collections.sort(classRoster);
		this.printRosterHeader("by first name");
		for(StudentMaster aStudent : classRoster) {
			this.printStudentDetail(aStudent);
		}
	}
	void printMeAndIdsNearMe() {
		HashMap<String, StudentMaster> classDb = new HashMap<String, StudentMaster>();
		for(StudentMaster student : classRoster) {
			classDb.put(student.id, student);
		}
		Set ids = classDb.keySet();
		ArrayList<String> sortedIds = new ArrayList<String>(ids);
		sortedIds.sort(null);
		String targetId = "306700"; // 267252, 306700, 343769
		String prevId = null;
		String myId = null;
		String nextId = null;
		for(int idx = 0; idx < sortedIds.size(); idx++) {
			if(sortedIds.get(idx) == targetId) {
				myId = sortedIds.get(idx);
				prevId = sortedIds.get(idx-1);
				nextId = sortedIds.get(idx+1);
				break;
			}
		}
		System.out.println("************************");
		this.printRosterHeader("by Id");
		this.printStudentDetail(classDb.get(myId));
		this.printStudentDetail(classDb.get(prevId));
		this.printStudentDetail(classDb.get(nextId));
	}
	@Override
	public int compareTo(StudentMaster student) {
		return this.firstName.compareTo(student.firstName);
	}
	void printStudentDetail(StudentMaster student) {
		System.out.printf("%-6s    %-16s   %-16s   %-9s   %8d\n",
				student.id, student.firstName, student.lastName, student.eyeColor, student.monthsEmployed);
	}
	void printRosterHeader(String title) {
		String header = "Student class roster %s\n" 
			+ "Empl Id   First name         Last name          Eye color   Months at SSA\n"
			+ "=======   ================   ================   =========   =============\n";
		System.out.printf(header, title);
	}
	void Init() {
		String[][] students = {
			{"474143", "Jonathan", "Stafford", "Brown", "13" },	
			{"005295", "Kyle", "Deen", "Blue", "2" },	
			{"132617", "Reuben", "Turner", "Blue", "12" },	
			{"306700", "Li", "Lui", "Brown", "12" },
			{"215296", "Joshua", "Franey", "Other", "27" },
			{"523420", "Gabriel", "Hamilton", "Other", "10" },
			{"004014", "Aisha", "Covington", "Brown", "10" },
			{"006789", "Arun", "Soma", "Brown", "2" },
			{"009999", "Steve", "Ellwood", "Other", "2" },
			{"343769", "Shaquil", "Timmons", "Brown", "11" },
			{"001449", "Karen", "Reiter", "Blue", "10" },
			{"267252", "Dax", "Richards", "Brown", "12" },
			{"229949", "Michael", "Sykes", "Brown", "13" },
			{"772223", "Daniel", "Kiros", "Brown", "3" },
			{"001122", "Michael", "C", "Other", "12" },
			{"001212", "Stephen", "Rook", "Brown", "11" },
			{"004444", "Peter", "Choi", "Brown", "2" },
			{"008888", "Evan", "Tizard", "Brown", "12" }
		};
		for(String[] aStudent : students) {
			StudentMaster student = new StudentMaster();
			student.id = aStudent[0];
			student.firstName = aStudent[1];
			student.lastName = aStudent[2];
			student.eyeColor = aStudent[3];
			student.monthsEmployed = Integer.parseInt(aStudent[4]);
			classRoster.add(student);
		}
		
	}
	public StudentMaster() {
		if(classRoster == null) {
			classRoster = new ArrayList<StudentMaster>();
			Init();
		}
	}
}
