import java.util.Random;

public class Environnement extends Thread {
    private EnvState envState;
    private Agent agt;
    private boolean running;

    public Environnement(EnvState envState, Agent agt) {
        this.envState = envState;
        this.agt = agt;
        running = true;
    }

    @Override
    public void run() {
        while (running){
            changeState();
        }
    }

    private void changeState(){
        Random r = new Random(System.currentTimeMillis());
        if (r.nextBoolean()) {
            envState.state = EnvState.State.DANGER;
        }
        else {
            envState.state = EnvState.State.OK;
        }

        if(!agt.isAlive()){
            running = false;
        }
    }
}
