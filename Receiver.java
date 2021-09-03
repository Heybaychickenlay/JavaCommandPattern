/*
* Author: Josiah Guzman
* Just a simple command pattern that has a receiver and supports undoable actions.
* Date Made: 3/29/2021
*/
package CommandPattern;

public class Receiver {
    public void TurnOff(){
        System.out.println("Turned Off\n");
    }
    public void TurnOn(){
        System.out.println("Turned On\n");
    }
}
