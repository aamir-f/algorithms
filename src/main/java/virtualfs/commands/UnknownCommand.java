package virtualfs.commands;

import virtualfs.State;

import java.net.CookieHandler;

public class UnknownCommand extends Command {

    @Override
    public State apply(State state) {
        return state.setMessage("Unknown command");
    }
}
