public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator();
        NumberGenerator numberGenerator2 = new NumberGenerator();
        NumberGenerator numberGenerator3 = new NumberGenerator();

        Thread thread1 = new Thread(numberGenerator1);
        Thread thread2 = new Thread(numberGenerator2);
        Thread thread3 = new Thread(numberGenerator3);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.setPriority(Thread.MAX_PRIORITY);
        thread3.start();
    }
}
