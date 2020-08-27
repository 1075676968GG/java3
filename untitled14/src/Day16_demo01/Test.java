package Day16_demo01;

public class Test {
    public static void main(String[] args) {
        Shower shower=new Shower();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    shower.show1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    shower.show2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    shower.show3();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();





    }
}
