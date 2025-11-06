package filesystem;


public abstract class FileSystemComponent {
    protected final String name;


    protected FileSystemComponent(String name) {
        this.name = name;
    }


    public String getName() { return name; }


    public abstract int getSize();


    public abstract void display(String indent);
}