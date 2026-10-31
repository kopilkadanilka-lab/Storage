public class OutgoingOperation implements WarehouseOperation {
    private final String name;
    private final int weight;

    public OutgoingOperation(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public boolean execute(Storage storage) {
        return storage.extract(name, weight) != null;
    }
}
