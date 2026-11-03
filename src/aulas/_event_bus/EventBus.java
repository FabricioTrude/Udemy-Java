package aulas._event_bus;

import java.util.*;

class EventBus {
    static final Map<Class<?>,List<EventListener<?>>> listeners = new HashMap<>();

    public void register(Class<?> type, EventListener<?> listener){
        listeners.computeIfAbsent(type, k -> new ArrayList<>()).add(listener);
    }

    @SuppressWarnings("unchecked")
    public <T> void post(T event){
        List<EventListener<?>> list = listeners.get(event.getClass());
        if(list == null) return;
        for(EventListener<?> listener : list){
            ((EventListener<T>)listener).onEvent(event);
        }
    }

    public void remove(EventListener<?> listener){
        List<?> list = listeners.get(listener.getClass());
        list.remove(listener);
    }
}
