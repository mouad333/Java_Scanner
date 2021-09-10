import java.util.Locale;

public class Java_Scanner {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);
        input.useLocale(Locale.UK);
        float age=0.0f;
        boolean isvalid=false;
        while (!isvalid) {
            System.out.println("Insert amount:");
            try {
                age=input.nextFloat();
                isvalid=true;
                if(age==0.0f) {
                    System.out.println("it must be a greater float number");
                    input.nextLine();
                    isvalid=false;
                  
                  }
            }
            catch (java.util.InputMismatchException e) {
                System.out.println("it must be a a valid float number");
                input.nextLine();
                isvalid=false;
           
        }
      
              System.out.printf("the age is:%.2f",age);
      
    }
    input.close();
    }
}
