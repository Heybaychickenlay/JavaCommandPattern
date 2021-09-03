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
