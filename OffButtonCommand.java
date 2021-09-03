/*
* Author: Josiah Guzman
* Just a simple command pattern that has a receiver and supports undoable actions.
* Date Made: 3/29/2021
*/
package CommandPattern;

public class OffButtonCommand implements ICommand {
    Receiver offButton;
    
    public OffButtonCommand(Receiver offButton){
        this.offButton = offButton;
    }
    
    @Override
    public void Execute(){
        offButton.TurnOff();
    }
    
    @Override
    public void Unexecute(){
        offButton.TurnOn();
    }
}
