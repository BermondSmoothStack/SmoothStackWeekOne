package apr.ss.assign.firstweek.dayfour.deadlock;

public class DeadlockClass {

    private final Object resourceA = new Object();
    private final Object resourceB = new Object();

    public DeadlockClass() {

        new ThreadA() {
            @Override
            public void run() {
                super.run();
                synchronized (resourceA) {
                    System.out.println("Locking resource A from ThreadA");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resourceB) {
                        System.out.println("Locking resource B from ThreadA");
                    }
                }
            }
        }.start();

        new ThreadB() {
            @Override
            public void run() {
                super.run();
                synchronized (resourceB) {
                    System.out.println("Locking resource B from ThreadB");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resourceA) {
                        System.out.println("Locking resource A from ThreadB");
                    }
                }
            }
        }.start();

    }
}
