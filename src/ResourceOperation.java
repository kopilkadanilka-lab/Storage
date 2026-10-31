abstract class ResourceOperation implements WarehouseOperation {
    protected final String name;
    protected final int weight;

    public ResourceOperation(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
}
