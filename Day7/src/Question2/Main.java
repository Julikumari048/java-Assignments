package Question2;

 class Member {
    String name;
   int age;
    String phoneNumber;
   String address;
    double salary;
   void printSalary(){
       System.out.println("Salary of the member "+salary);
   }

}

 class Employee extends Member{
     String specialisation;
      String  department;
 }

 class Manager extends Member{
     String specialisation;
     String  department;
 }

    public class Main{
        public static void main(String[] args) {
            Employee e = new Employee();
            Manager m = new Manager();
            m.name="Juli";
            m.age = 22;
            m.phoneNumber = "1234567890";
            m.address = "Godda";
            m.salary = 500000;
            m.specialisation = "Java";
            m.department = "Backend Developer";
            m.printSalary();

            System.out.println("Name is: " +m.name);
            System.out.println("Age is: " +m.age);
            System.out.println("Phone No. is: " +m.phoneNumber);
            System.out.println("Address is: " +m.address);
            //System.out.println("Manager Salary is: " +m.salary);
            System.out.println("Specialisation is: " +m.specialisation);
            System.out.println("Department is: " +m.department);


            System.out.println("======================");

            e.name="jojo";
            e.age = 21;
            e.phoneNumber = "1544567890";
            e.address = "Mahagama";
            e.salary = 4000000;
            e.specialisation = " Core Java";
            e.department = "Backend Developer";
            e.printSalary() ;

            System.out.println("Name is: " +e.name);
            System.out.println("Age is: " +e.age);
            System.out.println("Phone No. is: " +e.phoneNumber);
            System.out.println("Address is: " +e.address);
            System.out.println("Employee Salary is: " +e.salary);
            System.out.println("Specialisation is: " +e.specialisation);
            System.out.println("Department is: " +e.department);


        }
    }