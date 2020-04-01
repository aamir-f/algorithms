package virtualfs.Files;

public abstract class DirEntry {
    String parentPath = "";
    String name = "";

    public DirEntry(String parentPath, String name) {
        this.parentPath = parentPath;
        this.name = name;
    }

     abstract Boolean isFile();
     abstract Boolean isDirectory();
}
