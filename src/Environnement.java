import java.util.Random;

public class Environnement extends Thread {
    private EnvState envState;

    public Environnement(EnvState envState) {
        this.envState = envState;
    }

    @Override
    public void run() {
        while (true){
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
    }
}
