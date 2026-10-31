public class IncomingOperation implements WarehouseOperation {
    private final Resource resource;

    public IncomingOperation(Resource resource) {
        this.resource = resource;
    }
    @Override
    public boolean execute(Storage storage) {
        return storage.add(resource);
    }
}
