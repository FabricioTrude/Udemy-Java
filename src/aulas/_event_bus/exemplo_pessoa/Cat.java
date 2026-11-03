package aulas._event_bus.exemplo_pessoa;

class Cat implements Ear{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void hear(String sound) {
        System.out.println(name + " - Meow");
    }
}
