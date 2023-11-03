import java.util.Scanner;
/** 
 * ACS-1903 Assignment X Question Y
 * @author 
 */

public class ACS1903F2023MidTerm2ProgrammingQ2{
    public static void main(String[] args) {
        // vairables constants and objects
        int n = 0;      // from keyboard
        int factorial = 0;  // factorial computed 
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number.");
        n = scanner.nextInt();

        while(n != -1){
            factorial = 1;
            for(int i = n; i > 0; i--){
                factorial *= i;
            }// end for
            System.out.println(n + "! = " + factorial);

            System.out.println("enter a number.");
            n = scanner.nextInt();
        }// end while

        System.out.println("end of program");
    }// end main
}// end main
