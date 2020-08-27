package Day16_demo01;

public class Shower {
    int count = 1;
    Object obj = new Object();
    public void show1() throws InterruptedException {
        while (true) {
            synchronized (obj) {
                while (count != 1) {
                    obj.wait();
                }
                Thread.sleep(10);
                System.out.print("犯");
                System.out.print("我");
                System.out.print("中");
                System.out.print("华");
                System.out.print("者");
                System.out.println();
                count = 2; //count=1 Object.class.notify();
                obj.notifyAll();
            }
        }
    }

    public void show2() throws InterruptedException {
        while (true) {
            synchronized (obj) {
                while (count != 2) {
                    obj.wait();
                }
                Thread.sleep(10);
                System.out.print("虽");
                System.out.print("远");
                System.out.print("必");
                System.out.print("诛");
                System.out.println();
                count = 3; //count=1 Object.class.notify();
                obj.notifyAll();
            }
        }
    }

    public void show3() throws InterruptedException {
        while (true) {
            synchronized (obj) {
                while (count != 3) {
                    obj.wait();
                }
                Thread.sleep(10);
                System.out.print("我");
                System.out.print("是");
                System.out.print("中");
                System.out.print("国");
                System.out.print("人");
                System.out.println();
                count = 1; //count=1 Object.class.notify();
                obj.notifyAll();
            }
        }
    }


}
