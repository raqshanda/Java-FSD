public class OddEvenWithThread {
    public static void main(String a[]) {
        Thread t1 = new Thread(new OddEvenRunnable(0), "Even Thread");
        Thread t2 = new Thread(new OddEvenRunnable(1), "Odd Thread");

        t1.start();
        t2.start();
    }
}

class OddEvenRunnable implements Runnable {
    Integer evenflag;
    static Integer number = 1;
    static Object lock = new Object();
    int n=10;
    OddEvenRunnable(Integer evenFlag) {
        this.evenflag = evenFlag;
    }

    @Override
    public void run() {
        while (number < n) {
            synchronized (lock) {
                try {
                    while (number % 2 != evenflag) {
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + " " + number);
                number++;
                lock.notifyAll();
            }
        }
    }
}