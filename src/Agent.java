public class Agent extends Thread {

    private Environnement env;

    public Agent(Environnement env) {
        this.env = env;

    }

    @Override
    public void run() {
        while (true) {
            //observe();


        }
    }

    private void observe() {
        synchronized (this.env.state) {
            System.out.println(env.state);
        }
    }
/*
    private Action selectAction(But b){
        Action[] actions = b.getActions();



        return ;
    }
*/
}
