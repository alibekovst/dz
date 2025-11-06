package filesystem;


public class DemoComposite {
    public static void main(String[] args) {
        DirectoryComposite root = new DirectoryComposite("root");
        DirectoryComposite images = new DirectoryComposite("images");
        DirectoryComposite docs = new DirectoryComposite("docs");


        FileLeaf logoPng = new FileLeaf("logo.png", 512);
        FileLeaf bannerJpg = new FileLeaf("banner.jpg", 2048);
        FileLeaf readme = new FileLeaf("README.md", 8);
        FileLeaf report = new FileLeaf("report.pdf", 1024);


        images.add(logoPng);
        images.add(bannerJpg);
        docs.add(readme);
        docs.add(report);


        root.add(images);
        root.add(docs);


        docs.add(report);


        root.display("");
        System.out.println("ИТОГО размер root: " + root.getSize() + " KB");
    }
}