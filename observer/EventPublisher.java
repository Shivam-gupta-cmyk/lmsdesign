package systemdesign.lld.librarymanagementsystem.observer;

public class EventPublisher {
    private final List<Consumer<Event>> subscribers = new CopyOnWriteArrayList<>();

    public void subscribe(Consumer<Event> s) {
        subscribers.add(s);
    }

    public void publish(Event e) {
        subscribers.forEach(s -> s.accept(e));
    }
}
