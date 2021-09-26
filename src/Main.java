public class Main {
    public static void main(String[] args) {
        File file1 = new File("File1", "pdf");
        file1.singleClick();

        Folder root = new Folder("Root", "Folder");
        root.singleClick();
    }
}
