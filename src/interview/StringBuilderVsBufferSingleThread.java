package interview;

public class StringBuilderVsBufferSingleThread {
    public static void main(String[] args) {
        long start, end;

        StringBuilder sb = new StringBuilder();
        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("A");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (end - start) + " ms");

        StringBuffer sbuf = new StringBuffer();
        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            sbuf.append("A");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (end - start) + " ms");
    }
}
