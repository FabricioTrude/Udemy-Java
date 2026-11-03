package aulas._event_bus.exemplo_pessoa;

class Person implements Ear {

    private final String name;

    public Person(String name) {

        this.name = name;
    }

    @Override
    public void hear(String sound) {
        System.out.println(name + " ouviu " + sound);
    }
}
