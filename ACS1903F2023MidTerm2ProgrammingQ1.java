import java.util.Scanner;
import javax.swing.JOptionPane;
/** 
 * ACS-1903 Assignment X Question Y
 * @author 
 */

public class ACS1903F2023MidTerm2ProgrammingQ1{
    public static void main(String[] args) {
        // vairables constants and objects
        //Scanner scanner = new Scanner(System.in);

        int n = 0;
        String strin;
        String status;

        do{
            strin = JOptionPane.showInputDialog("enter a 5 digit id number");
        }while(strin.length() != 5);
        
        // parse and get status
        n = Integer.parseInt(strin);
        
        switch(n % 10){ 
            case 0: 
            case 1: 
            case 2:
            status = "Group B";
            break;
            case 3:
            case 4:
            case 5: status = "Group F";
                break;
            case 6:
            case 7:
            case 8: status = "Active";
                break;
            default:    status = "Invalid ID number";
            
        }//end switch
        
        String strout = "ID " + n + " status: " + status;
        JOptionPane.showMessageDialog(null, strout);  

        
        System.out.println("end of program");
    }// end main
}// end main
