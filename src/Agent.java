public class Agent extends Thread {
    private EnvState envState;

    public Agent(EnvState envState) {
        this.envState = envState;
    }

    @Override
    public void run() {
        while (true) {
            observe();


        }
    }

    private void observe() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(envState.state);
    }
/*
    private Action selectAction(But b){
        Action[] actions = b.getActions();



        return ;
    }
*/
}
