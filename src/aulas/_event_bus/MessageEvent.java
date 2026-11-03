package aulas._event_bus;

public class MessageEvent implements EventListener {
    private String message;

    public MessageEvent(String message) {
        this.message = message;
    }

    @Override
    public void onEvent(Object event) {
        System.out.println(message);
    }
}