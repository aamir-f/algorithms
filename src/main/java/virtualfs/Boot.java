package virtualfs;

import virtualfs.Files.DirEntry;
import virtualfs.Files.Directory;
import virtualfs.commands.Command;

import java.util.Scanner;
import java.util.ArrayList;

public class Boot {
    public static void main(String [] args) {
        Directory emptyDir = new Directory("", "", new ArrayList<DirEntry>());
        State state = new State(emptyDir, emptyDir, "");

        while(true) {

            state.show();
            String inputCommand = new Scanner(System.in).nextLine();

           state =  new Command() {
                @Override
                public State apply(State state) {
                    return null;
                }
            }.from(inputCommand).apply(state);
        }
    }
}
