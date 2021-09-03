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
