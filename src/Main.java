import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        EnvState envState = new EnvState();

        Action a1 = new Action("a1", 1500);
        Action a2 = new Action("a2", 1900);
        Action a3 = new Action("a3", 2000);

        Action b1 = new Action("b1", 1100);
        Action b2 = new Action("b2", 900);
        Action b3 = new Action("b3", 2500);

        Action c1 = new Action("c1", 1100);
        Action c2 = new Action("c2", 900);
        Action c3 = new Action("c3", 2500);

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

        ArrayList<But> buts = new ArrayList<>();
        buts.add(A);
        buts.add(B);
        buts.add(C);

        Agent agt = new Agent(envState, buts);
        Environnement env = new Environnement(envState, agt);

        env.start();
        agt.start();

    }
}
