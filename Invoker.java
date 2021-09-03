/*
* Author: Josiah Guzman
* Just a simple command pattern that has a receiver and supports undoable actions.
* Date Made: 3/29/2021
*/
package CommandPattern;

public class Invoker {
    OnButtonCommand onButton;
    OffButtonCommand offButton;
    public Invoker(OnButtonCommand onButton, OffButtonCommand offButton){
        this.onButton = onButton;
        this.offButton = offButton;
    }
    
    public void pressedOnButton(){
        onButton.Execute();
    }
    
    public void pressedOffButton(){
        offButton.Execute();
    }
}
