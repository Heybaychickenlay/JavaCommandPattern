/*
* Author: Josiah Guzman
* Just a simple command pattern that has a receiver and supports undoable actions.
* Date Made: 3/29/2021
*/
package CommandPattern;

public interface ICommand {
    public void Execute();
    public void Unexecute();
}
