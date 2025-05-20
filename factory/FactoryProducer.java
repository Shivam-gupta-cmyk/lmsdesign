package systemdesign.lld.librarymanagementsystem.factory;

public class FactoryProducer {
    public static EntityFactory getFactory(String type) {
        return "BOOK".equals(type) ? new BookFactory() : new PatronFactory();
    }
}
