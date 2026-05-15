package interview;

public class StringBuilderVsBufferMultiThread {
    static StringBuilder sb1 = new StringBuilder();
    static StringBuffer sb2 = new StringBuffer();

    public static void main(String[] args) throws InterruptedException {
        Runnable task1 = () -> {
            for (int i = 0; i < 1000; i++) {
                sb1.append("A");
                sb2.append("A");
            }
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task1);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("StringBuilder length: " + sb1.length());
        System.out.println("StringBuffer length: " + sb2.length());
    }
}
