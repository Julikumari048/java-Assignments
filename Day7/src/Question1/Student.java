package Question1;


//Example of this keyword
public class Student {
        int rollNo;
        String name;
        float fee;
        Student(int r,String n,float f) {
            this.rollNo = r;
            this.name = n;
            this.fee = f;
        }
        // use this in current class constructor
            void display(){
                System.out.println("Roll No.is: "+rollNo);
                System.out.println("Name is: "+name);
                System.out.println("Fee is: "+fee);
                System.out.println("===================");
            }
        }


    class  ThisCheck{
        public static void main(String args[]){
            Student s1=new Student(56,"abc",5000f);
            Student s2=new Student(112,"efg",6000f);
            s1.display();
            s2.display();
        }
}

