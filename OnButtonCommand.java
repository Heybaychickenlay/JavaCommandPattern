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
