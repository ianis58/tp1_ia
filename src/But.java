import java.util.ArrayList;

public class But {

    private String name;
    private ArrayList<Action> actions;

    public But(String name, ArrayList<Action> actions) {
        this.name = name;
        this.actions = actions;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Action> getActions() {
        return actions;
    }

    public void setActions(ArrayList<Action> actions) {
        this.actions = actions;
    }
}
