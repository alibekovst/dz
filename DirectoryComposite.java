package filesystem;


import java.util.ArrayList;
import java.util.List;


public class DirectoryComposite extends FileSystemComponent {
    private final List<FileSystemComponent> children = new ArrayList<>();


    public DirectoryComposite(String name) {
        super(name);
    }


    public boolean contains(FileSystemComponent component) {
        return children.contains(component);
    }


    public void add(FileSystemComponent component) {
        if (component == null) return;
        if (contains(component)) {
            System.out.println("Папка '" + name + "': компонент уже добавлен: " + component.getName());
            return;
        }
        children.add(component);
    }


    public void remove(FileSystemComponent component) {
        if (component == null) return;
        if (!contains(component)) {
            System.out.println("Папка '" + name + "': компонента нет: " + (component != null ? component.getName() : "null"));
            return;
        }
        children.remove(component);
    }


    @Override
    public int getSize() {
        int sum = 0;
        for (FileSystemComponent c : children) {
            sum += c.getSize();
        }
        return sum;
    }


    @Override
    public void display(String indent) {
        System.out.println(indent + "+ Dir: " + name + " (" + getSize() + " KB)");
        String childIndent = indent + " ";
        for (FileSystemComponent c : children) {
            c.display(childIndent);
        }
    }
}