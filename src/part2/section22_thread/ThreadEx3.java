package part2.section22_thread;

public class ThreadEx3 {
    public static void main(String[] args) {
        WorkerThread workerThread = new WorkerThread();
        Thread thread = new Thread(workerThread);
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
