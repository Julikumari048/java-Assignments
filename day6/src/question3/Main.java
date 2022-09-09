package question3;
public class Main {
    public int[] findAndReturnPrimeNumbers(int[] inputArray) {
        int[] array = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            int count = 0;
            for (int j = 2; j < inputArray[i]; j++) {
                if (inputArray[i] % j == 0) {
                    count++;
                }
            }
             if(count == 0){
                 array[i] = inputArray[i];
             }
        }
        return array;
   }
     public static void main(String[] args) {
         int[] array = {10,12,5,50,11,14,15};
         Main m = new Main();
         int[] ans = m.findAndReturnPrimeNumbers(array);
         int count = 0;
         for(int i = 0; i < ans.length; i++){
         if(ans[i] > 0) {
             count++;
             System.out.println("Prime number is: "+ans[i]);
         }
         }
         if(count == 0){
             System.out.println("Prime number not found in the supplied Array");
         }
    }
}
