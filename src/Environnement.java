import java.sql.Time;
import java.util.Random;

public class Environnement extends Thread {

    public static enum State {OK, DANGER}

    public State state = State.OK;

    public Environnement() {

    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //changeState();
        }
    }

    private void changeState(){
        Random r = new Random(System.currentTimeMillis());

        synchronized (this.state) {
            if (r.nextBoolean()) {
                if (state == State.OK) {
                    state = State.DANGER;
                } else {
                    state = State.OK;
                }
            }
        }
    }
}
