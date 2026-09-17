public class Storage {
    private int maxCapacity;
    private int currentWeight;
    private Resource[] resources;
    private int size;

    public Storage(int maxCapacity, int maxSlots) {
        this.maxCapacity = maxCapacity;
        this.resources = new Resource[maxSlots];
        this.currentWeight = 0;
        this.size = 0;
    }

    public boolean add(Resource resource) {

    }

    public Resource extract(String name, int weight) {

    }
}
