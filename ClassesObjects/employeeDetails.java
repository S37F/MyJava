package ClassesObjects;
import java.util.*;
class Employee {
    int empid ;
    String empname ;
    String empdesignation ;
    double empsalary ;

    void getemployee(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Id :");
        empid = sc.nextInt();

        System.out.println("Enter name :");
        empname = sc.next();

        System.out.println("Enter designation :");
        empdesignation = sc.next();

        System.out.println("Enter the salary :");
        empsalary = sc.nextDouble();
    }

    void displaydetails(){
        System.out.println("Employee ID :"+empid);
        System.out.println("Employee name :"+empname);
        System.out.println("Employee designation :"+empdesignation);
        System.out.println("Employee salary :"+empsalary);
    }

    void displayGrade(){
        if (empsalary >= 5000) {
            System.out.println("Grade :'A'");
        } else if (empsalary >= 3000) {
            System.out.println("Grade :'B'");
        }
        else {
            System.out.println("Grade :'C'");
        }
    }
}
public class employeeDetails {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getemployee();
        System.out.println("Employee Details :");
        employee.displaydetails();
        System.out.println("Employee Grade :");
        employee.displayGrade();
    }
}
