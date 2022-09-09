package Question1;

import java.util.*;

public class Course {
    int courseId;
    String courseName;
    int courseFee;

    public void displayCourseDetails(){
        System.out.println("course Id is:" +courseId);
        System.out.println("course Name is:" +courseName);
        System.out.println(" course Fee is:" +courseFee);
    }
    public static void authenticate(String username, String password){


        if(username.equals ("Admin")  && password.equals("1234")){
            Course c = new Course();
            c.courseId = 11;
            c.courseName = "B-tech";
            c.courseFee = 500000;
            c.displayCourseDetails();

        }
        else{
            System.out.println("Invalid Username or password");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user Name");
        String user  = sc.nextLine();
        System.out.println("Enter Password");
        String pass = sc.nextLine();

        authenticate(user,pass);
//        System.out.println("Enter user name and password");
//        authenticate(sc.nextLine(), sc.nextLine());
    }

}
