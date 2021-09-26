import java.util.ArrayList;

public class Folder implements Component{

    ArrayList<Component> componentsList = new ArrayList<>();

    String name, type;

    // The constructor
    public Folder(String name, String type){
        this.name = name;
        this.type = type;
    }

    public void add(Component component){
        componentsList.add(component);
    }

    public void remove(Component component){
        componentsList.remove(component);
    }

    @Override
    public void singleClick() {
        System.out.println("Name: " + name + ", Type: " + type);
    }

    @Override
    public void doubleClick() {

    }
}
