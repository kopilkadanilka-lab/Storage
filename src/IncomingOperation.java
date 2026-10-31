public class IncomingOperation extends ResourceOperation {

    public IncomingOperation(Resource resource) {
        super(resource.name(), resource.weight());
    }

    @Override
    public boolean execute(Storage storage) {
        return storage.add(new Resource(name, weight));
    }
}
