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

    public boolean add(Resource resource) { // метод добавления ресурсов в хранилище
        if (this.currentWeight + resource.weight() >= this.maxCapacity) {
            System.out.println("Столько места в хранилище у нас не найдется(");
            return false;
        }
        else {
            boolean found = false;
            for (int i = 0; i < this.size; i++) {
                if (resource.name().equals(this.resources[i].name())) {
                    this.resources[i].weight() = this.resources[i].weight() + resource.weight();
                    found = true;
                    break;
                }
            if (!found) {
                this.resources[this.size] = resource;
                this.size++;
            }
            
            }
        }

    }

    public Resource extract(String name, int weight) {

    }
}
