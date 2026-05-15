package javaseventeen;

sealed interface Saape permits Carcle, Ractangle {}

record Carcle(double radius) implements Saape {}
record Ractangle(double width, double height) implements Saape {}

public class RecordExample {
    public static void main(String[] args) {
        Saape shape = new Carcle(5);

        String result = switch (shape) {
            case Carcle c -> "Area: " + (Math.PI * c.radius() * c.radius());
            case Ractangle r -> "Area: " + (r.width() * r.height());
        };

        System.out.println(result);
    }

}
