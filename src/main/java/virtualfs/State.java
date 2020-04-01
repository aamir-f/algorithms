package virtualfs;

import virtualfs.Files.Directory;

public class State {

    final String SHELL_TOKEN = "$";


    Directory root;
    Directory wd;
    String contents;

    public State(Directory root, Directory wd, String contents) {
        this.root = root;
        this.contents = contents;
        this.wd = wd;
    }

    public void show() {
       System.out.println(contents);
       System.out.println(SHELL_TOKEN);
    }

    public State setMessage(String message) {
        return new State(root, wd, message);
    }
}


