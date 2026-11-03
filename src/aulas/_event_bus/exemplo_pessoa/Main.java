package aulas._event_bus.exemplo_pessoa;

public class Main {
    static DoorBell bell = new DoorBell();

    public static void main(String[] args) {
        Person p1 = new Person("Fabricio");
        Person p2 = new Person("Giovanna");
        Person p3 = new Person("Katia");
        Person p4 = new Person("Silvio");
        Cat c1 = new Cat("Amy");
        Cat c2 = new Cat("Tommy");

        bell.addEar(p1);
        bell.addEar(p2);
        bell.addEar(p3);
        bell.addEar(p4);
        bell.addEar(c1);
        bell.addEar(c2);

        bell.ring();
    }
}
