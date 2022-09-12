package Question1;


//Example uses of super
    class Animal{
        String color="Brown";
    }
    class Dog extends Animal{
        String color="black";
        void printColor(){
            System.out.println("Printing Child class color: "+color);
            // only color will print black (print child class color)
            System.out.println("Printing Parent class color: "+super.color);
           //super.color = Brown because super refer parent class
        }
    }
    class Main{
        public static void main(String args[]) {
            Dog d1 = new Dog();
            d1.printColor();
        }
        }

