package Question4;

public class CommandLineArg {

    public static void main(String[] args) {
        int size = args.length;
        int fact = 1;
        if(size == 1) {
            for(int i = 1; i <= Integer.valueOf(args[0]); i++) {
                fact *= i;
            }
            System.out.println(fact);
        }
        else if(size == 2) {
            int absoluteDiff = Math.abs(Integer.valueOf(args[0]) - Integer.valueOf(args[1]));
            for(int i = 1; i <= absoluteDiff; i++) {
                fact *= i;
            }
            System.out.println(fact);
        }
        else if(size > 2) {
            System.out.println("Error");
        }
    }

}