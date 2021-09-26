import java.util.ArrayList;

public class Folder implements Component{

    ArrayList<Component> components = new ArrayList<>();

    String name, type;

    // The constructor
    public Folder(String name, String type){
        this.name = name;
        this.type = type;
    }

    @Override
    public void singleClick() {

    }

    @Override
    public void doubleClick() {

    }
}
