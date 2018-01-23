import java.util.ArrayList;

public class But {

    private String name;
    private ArrayList<Action> actions;
    private boolean done;

    public But(String name, ArrayList<Action> actions) {
        this.name = name;
        this.actions = actions;
        this.done = false;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
        System.out.println("But " + name + " is done!");
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
