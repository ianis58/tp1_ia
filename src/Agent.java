import java.util.ArrayList;
import java.util.Random;

public class Agent extends Thread {
    private EnvState envState;
    private ArrayList<But> buts;
    private But but;
    private boolean butChoisi;
    private boolean butAtteint;

    public Agent(EnvState envState, ArrayList<But> buts) {
        this.envState = envState;
        this.buts = buts;
        this.butChoisi = false;
        this.butAtteint = false;
    }

    @Override
    public void interrupt() {
        System.out.println("Agent shutting down...");
    }

    @Override
    public void run() {
        while (!butChoisi && !butAtteint) {
            boolean kill = false;
            kill = observe();
            if(!kill) {
                if (!butChoisi) {
                    but = choisirBut();
                }

                if (butChoisi && !butAtteint) {
                    //ici on réalise les actions
                    for (Action action : but.getActions()) {
                        action.exec();

                        if (but.getActions().indexOf(action) == but.getActions().size()) {
                            butAtteint = true;
                            but.setDone(true);
                            buts.set(but.getActions().indexOf(action), but);
                        }
                    }
                }
            }
            else{
                break;
            }
        }
    }

    private But choisirBut() {
        Random r = new Random(System.currentTimeMillis());
        int butId = r.nextInt(buts.size());
        But but = buts.get(butId);

        do{
            butId = r.nextInt(buts.size());
            but = buts.get(butId);
        } while(but.isDone());

        butChoisi = true;

        System.out.println("Choosen goal is: " + buts.get(butId).getName() + "...");
        
        return buts.get(butId);
    }

    private boolean observe() {
        EnvState.State tmpState = envState.state;
        System.out.println("Current state : " + tmpState + "...");
        if(tmpState == EnvState.State.DANGER){
            System.out.println("Je suis mort :'( car DANGER");
            return true;
        }
        else{
            return false;
        }
    }
}
