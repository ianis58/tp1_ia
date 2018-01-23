public class Action {

    private String name;
    private int delay;

    public Action(String name, int delay) {
        this.delay = delay;
        this.name = name;
    }

    public void exec(){
        System.out.println("Executing action " + name + ": sleep(" + delay + ")...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }
}
