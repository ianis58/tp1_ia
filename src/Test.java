public class Test {
    class Control {
        public volatile boolean flag = false;
    }
    final Control control = new Control();

    class T1 implements Runnable {
        @Override
        public void run() {
            while ( !control.flag ) {

            }
        }
    }

    class T2 implements Runnable {
        @Override
        public void run() {
            while ( !control.flag ) {

            }
        }
    }

    private void test() {
        T1 main = new T1();
        T2 help = new T2();

        new Thread(main).start();
        new Thread(help).start();
    }

    public static void main(String[] args) throws InterruptedException {
        try {
            Test test = new Test();
            test.test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
