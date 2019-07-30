package studentDatabase;
import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		//Ask how many new students to enter
		
		System.out.print("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numStudents = in.nextInt();
		Student[] students = new Student[numStudents];
		
		//Create n number of new students
		
		for (int n = 0;n<numStudents;n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTution();
			
		}
		
		for (int s = 0;s<numStudents;s++) {
			System.out.println(students[s].toString());
		}

	}

}
