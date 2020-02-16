import java.util.Scanner;

public class Student{
    private String fname;
    private String lname;
    private String gradeYear;
    private String studentId;
    private String courses = "";
    private int balance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    Student(){
        Scanner in = new Scanner(System.in);
        
        System.out.print("\nWhat is the student's first name? ");
        this.fname = in.nextLine();

        System.out.print("What is the student's last name? ");
        this.lname = in.nextLine();

        System.out.println("\n\t1 - Freshman\n\t2 - Sophmore\n\t3 - Junior\n\t4 - Senior");
        System.out.print("\nWhat is "+ fname+"'s class level? ");
        this.gradeYear=in.nextLine();
        setId();       
    }
    
    public void setId(){
        this.studentId = gradeYear + Integer.toString(id);
        id++;
    }

    public void enroll(){
        Scanner in = new Scanner(System.in);
        do{
        System.out.print("Enter course to enroll (Q to quit): ");
        String course = in.nextLine();
        if(!course.equals("Q")){
            courses = courses + "\n " + course;
            balance += costOfCourse;
        }else{break;}
    } while (1!=0);
        
        System.out.println("\nEnrolled in :" + courses);
        System.out.println("Tuition Balance: "+ balance);
    }

    public void viewBalance(){
        System.out.println("\nBalance: " + balance);
    }

    public void payTuition(){
        viewBalance();
        System.out.println("How much would you like the payment to be?");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        balance-=payment;
        System.out.println("\nThanks for making a payment of $"+payment+"!\n");
        
    }

    public void showInfo(){
        System.out.println("Name: " +fname +" "+lname+
        "\nStudent Id: " + studentId +
        "\nGrade Level: "+ gradeYear +
        "\nCourses Enrolled: " + courses +
        "\nBalance: $" + balance);
    }

}
