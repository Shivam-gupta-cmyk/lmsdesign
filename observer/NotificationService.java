package systemdesign.lld.librarymanagementsystem.observer;

public class NotificationService {
    public NotificationService(EventPublisher pub) {
        pub.subscribe(this::onEvent);
    }

    private void onEvent(Event e) {
        log.info("Event occurred: {}", e.getType());
    }
}
