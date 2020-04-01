package virtualfs.commands;

import virtualfs.State;

public abstract class Command {
    /*
    * state == previous state
    * return new state
    * */

    abstract public State apply(State state);

    public Command from(String inputCommand) {
        return new UnknownCommand();
    }
}
