public class OutgoingOperation extends ResourceOperation {

    public OutgoingOperation(String name, int weight) {
        super(name, weight);
    }

    @Override
    public boolean execute(Storage storage) {
        return storage.extract(name, weight) != null;
    }
}
