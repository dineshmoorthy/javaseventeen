package interview;
import java.util.*;

class Animalu {
    @Override
    public String toString() {
        return "Animalu";
    }
}

class WildAnimalu extends Animalu {
    @Override
    public String toString() {
        return "WildAnimalu";
    }
}

class Lion extends WildAnimalu {
    @Override
    public String toString() {
        return "Lion";
    }
}

public class WildcardDemo {
    public static void main(String[] args) {
        // ------------------------------
        // ? extends WildAnimalu (Producer)
        // ------------------------------
        List<Lion> lions = List.of(new Lion(), new Lion());
        Collection<? extends WildAnimalu> AnimalusExtends = lions;

        // ✅ You can read elements as WildAnimalu
        WildAnimalu wa = AnimalusExtends.iterator().next();
        System.out.println("Read from ? extends: " + wa);

        // ❌ You cannot add anything (compiler doesn't know the exact subtype)
        // AnimalusExtends.add(new WildAnimalu()); // ERROR
        // AnimalusExtends.add(new Lion());       // ERROR

        // ------------------------------
        // ? super WildAnimalu (Consumer)
        // ------------------------------
        List<Animalu> AnimaluList = new ArrayList<>();
        List<? super WildAnimalu> AnimalusSuper = AnimaluList;

        // ✅ You can add WildAnimalu or its subclasses
        AnimalusSuper.add(new WildAnimalu());
        AnimalusSuper.add(new Lion());

        // ❌ You cannot read as WildAnimalu (only safe type is Object)
        Object obj = AnimalusSuper.get(0);
        System.out.println("Read from ? super: " + obj);

        // If you really need WildAnimalu, you must cast:
        WildAnimalu casted = (WildAnimalu) AnimalusSuper.get(0);
        System.out.println("Casted read from ? super: " + casted);
    }
}
