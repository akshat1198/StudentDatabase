package studentDatabase;
import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String grade="";
	private String studentID;
	private String courses="";
	private int tutionBalance;
	private int costOfCourse = 600;
	private static int id = 1000;
	
	Scanner in = new Scanner(System.in);
	//Constructor prompt user to enter student's name and year
	public Student() {
		
		
		System.out.print("Enter student's first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter "+this.firstName+"'s last name: ");
		this.lastName = in.nextLine();
		getGrade();
		setStudentID();
		
	}
	
	public void getGrade() {
		System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nWhat is "+this.firstName+" "+this.lastName+"'s grade level? ");
		this.gradeYear = in.nextInt();
		switch(gradeYear) {
		case 1:
			this.grade="Freshman";
			break;
		case 2:
			this.grade = "Sophomore";
			break;
		case 3:
			this.grade = "Junior";
			break;
		case 4:
			this.grade = "Senior";
			break;
		default:
			System.out.println("Invalid choice! Please try again");
			getGrade();
			break;			
		}
		System.out.println(this.firstName+" "+this.lastName+ " is in "+this.grade+" year");
		
	}
	//Generate an ID
	private void setStudentID() {
		id++;
		this.studentID = gradeYear + "" + id;	
	}
	//Enroll in courses
	public void enroll() {
		do{
			System.out.println("Enter course to enroll(Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses+=course+"\n";
				tutionBalance +=costOfCourse;
			}
			else {
				break;
			}
		}while(1!=0);
		System.out.println("\nENROLLED IN: \n"+courses);
		System.out.println("TUTION BALANCE: "+tutionBalance);
	}
	//View balance
	public void viewBalance() {
		System.out.println("Your balance is: $"+tutionBalance);
	}
	//Pay Tuition
	public void payTution() {
		System.out.print("Enter your payment: $");
		Scanner x = new Scanner(System.in);
		int payment = x.nextInt();
		tutionBalance-=payment;
		System.out.println("Thank you for your payment of $"+ payment);
		viewBalance();
	}
	//Show status
	public String toString() {
		return "\nName: "+firstName+" "+lastName
				+"\nGrade Level: "+grade
				+"\nStudentID: "+studentID
				+"\nCourses Enrolled:\n"+courses
				+"\nBalance: $"+tutionBalance;
	}
}
