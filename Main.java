/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern;

/**
 *
 * @author Josiah Guzman
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int userSelection = 0;
        
        // We are using a television as an example receiver
        Receiver television = new Receiver();
        
        // Creating the on and off button to press for the program
        OnButtonCommand onButton = new OnButtonCommand(television);
        OffButtonCommand offButton = new OffButtonCommand(television);
        
        while(userSelection != 3){
            System.out.println("Enter the corresponding number for the option you wish to select");
            System.out.println("1: Press the 'Turn On' button");
            System.out.println("2: Press the 'Turn Off' button");
            System.out.println("3: Exit the program");
            userSelection = scan.nextInt();
            System.out.println();
            
            switch(userSelection){
                case 1: onButton.Execute();
                        // offButton.Unexecute(); //  Also works to turn on (Undoable)
                        break;
                case 2: offButton.Execute();
                        // onButton.Unexecute(); // Also works to turn off (Undoable)
                        break;
                case 3: System.out.println("Thank you for using Josiah's command pattern.");
                        break;
                default: System.out.println("Error! No corresponding number found.\n");
                         break;
            }
        }
    }
}