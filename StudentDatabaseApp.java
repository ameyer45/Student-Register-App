import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nHow many students? ");
        int n = in.nextInt();
        Student[] students = new Student[n-1];
        
        for(int i = 0; i<n; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            students[i].showInfo();
        }    
    }
}
