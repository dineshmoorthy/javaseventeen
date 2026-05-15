package javaeight;

interface Vehicle {
    default void start() { System.out.println("Starting..."); }
    static void service() { System.out.println("Servicing..."); }
}
