package virtualfs.Files;

import java.util.ArrayList;

public class Directory extends DirEntry {

    final String ROOT_PATH = "/";
    final String SEPARATOR = "/";



    String parentName = "";
    String name = "";
    ArrayList<DirEntry> contents = new ArrayList<DirEntry>();

    public Directory(String parentName, String name, ArrayList<DirEntry> contents) {
        super(parentName, name);
        this.parentName = name;
        this.name = name;
        this.contents = contents;
    }

    @Override
    Boolean isFile() {
        return false;
    }

    @Override
    Boolean isDirectory() {
        return true;
    }
}