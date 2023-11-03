import java.util.Scanner;
/** 
 * ACS-1903 Assignment X Question Y
 * @author 
*/

public class ACS1903F2023MidTerm2ProgrammingQ3{
    public static void main(String[] args) {
        // vairables constants and objects
        Scanner scanner = new Scanner(System.in);
        String passWord;
        boolean valid = true;
        int dashCount = 0;
        
        System.out.println("enter you password for validation.");
        passWord = scanner.next();
        
        for(int i = 0; i < passWord.length(); i++){
            char ch = passWord.charAt(i);
            if(!Character.isDigit(ch) && !Character.isLetter(ch)){
                if(ch == '-'){
                    dashCount++;
                }// end dash
                else{
                    valid = false;
                }// end not a dash
            }// end for
            //dashCount = passWord.indexOf('-');
        }//end for
        
        System.out.println((valid && (dashCount > 0)) ? "Valid" : "Invalid");

        System.out.println("end of program");
    }// end main
}// end main
