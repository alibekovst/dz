package filesystem;


public class FileLeaf extends FileSystemComponent {
    private final int size;


    public FileLeaf(String name, int size) {
        super(name);
        this.size = Math.max(0, size);
    }


    @Override
    public int getSize() {
        return size;
    }


    @Override
    public void display(String indent) {
        System.out.println(indent + "- File: " + name + " (" + size + " KB)");
    }
}