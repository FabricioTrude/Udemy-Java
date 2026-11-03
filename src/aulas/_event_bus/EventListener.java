package aulas._event_bus;

interface EventListener<T> {
    void onEvent(T event);
}
