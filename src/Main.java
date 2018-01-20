import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    private static Environnement.State state;

    public static void main(String[] args) {

        state = Environnement.State.DANGER;

        Action a1 = new Action("a1", 150);
        Action a2 = new Action("a2", 190);
        Action a3 = new Action("a3", 200);

        Action b1 = new Action("b1", 110);
        Action b2 = new Action("b2", 90);
        Action b3 = new Action("b3", 250);

        Action c1 = new Action("c1", 110);
        Action c2 = new Action("c2", 90);
        Action c3 = new Action("c3", 250);

        ArrayList<Action> actionsA = new ArrayList<>();
        actionsA.add(a1);
        actionsA.add(a2);
        actionsA.add(a3);

        ArrayList<Action> actionsB = new ArrayList<>();
        actionsB.add(b1);
        actionsB.add(b2);
        actionsB.add(b3);

        ArrayList<Action> actionsC = new ArrayList<>();
        actionsC.add(c1);
        actionsC.add(c2);
        actionsC.add(c3);

        But A = new But("A", actionsA);
        But B = new But("B", actionsB);
        But C = new But("C", actionsC);

        Environnement env = new Environnement();
        Agent agt = new Agent(env);

        env.start();
        agt.start();

    }
}
