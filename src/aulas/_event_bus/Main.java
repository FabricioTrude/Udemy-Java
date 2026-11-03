package aulas._event_bus;

public class Main {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();

        MessageEvent m1 = new MessageEvent("Olá!");
        eventBus.register(m1.getClass(),m1);
        MessageEvent m2 = new MessageEvent("Tudo bem?");
        eventBus.register(MessageEvent.class, m2);
        eventBus.post(new MessageEvent("Teste"));
        eventBus.post(new MessageEvent("Teste2"));
    }
}
