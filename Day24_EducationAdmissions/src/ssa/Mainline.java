package ssa;

import java.util.Properties;

public class Mainline {
	
	public static Db db = null;

	void Run() {
		try {
			Properties prop = new Properties();
			prop.load(new java.io.FileInputStream("db.properties"));
			String pDb = prop.getProperty("db");
			String pUsr = prop.getProperty("usr");
			String pPwd = prop.getProperty("pwd");
			String pUrl = prop.getProperty("url");
			String dbUrl = String.format(pUrl, pDb);
	
			db = new Db(dbUrl, pUsr, pPwd);
			// store all those who want to be students
			Students students = new Students();
			students.add(new Student("Adam","Zapel",1200,3.0,"Finance"));
			students.add(new Student("Graham","Krakir",500,2.5,"General Studies"));
			students.add(new Student("Ella","Vader",800,3.0,"Accounting"));
			students.add(new Student("Stanley","Kupp",1350,3.3,"Engineering"));
			students.add(new Student("Lou","Zar",950,3.0,"Education"));
			// enroll all of them
			for(Student student : students) {
				// enroll
				boolean success = student.enroll();
				if(!success) {
					throw new Exception("Student insert failed!");
				}
				success = student.assignMajor();
				success = student.scheduleClasses();
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			db.close();
		}
	}

	public static void main(String[] args) {
		(new Mainline()).Run();
	}
}
