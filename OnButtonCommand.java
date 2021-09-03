/*
* Author: Josiah Guzman
* Just a simple command pattern that has a receiver and supports undoable actions.
* Date Made: 3/29/2021
*/
package CommandPattern;

public class OnButtonCommand implements ICommand {
    Receiver onButton;
    
    public OnButtonCommand(Receiver onButton){
        this.onButton = onButton;
    }
    
    @Override
    public void Execute(){
        onButton.TurnOn();
    }
    
    @Override
    public void Unexecute(){
        onButton.TurnOff();
    }
}
