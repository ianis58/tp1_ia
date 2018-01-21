public class EnvState {
    public enum State {OK, DANGER}

    public volatile EnvState.State state = EnvState.State.OK;

    public EnvState() {

    }
}
