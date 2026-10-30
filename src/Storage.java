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
        if (resource.weight() <= 0) {
            System.out.println("Ну и что ты добавляешь?");
            return false;
        }
        if (this.currentWeight + resource.weight() > this.maxCapacity) {
            System.out.println("Столько места в хранилище у нас не найдется(");
            return false;
        }
        else {
            for (int i = 0; i < this.size; i++) {
                if (resource.name().equals(this.resources[i].name())) {
                    int totalWeight = this.resources[i].weight() + resource.weight();
                    this.resources[i] = new Resource(resource.name(), totalWeight);

                    this.currentWeight += resource.weight();
                    return true;
                }
            }
            if (this.size >= this.resources.length) {
                System.out.println("Все ячейки склада заняты");
                return false;
            }
            this.resources[this.size] = resource;
            this.currentWeight += resource.weight();
            this.size++;
            return true;
        }
    }


    public Resource extract(String name, int weight) {
        // проверка на идиота
        if (weight <= 0) {
            System.out.println("Че ты собираешься забирать?");
            return null;
        }
        else {
            // проходимся по всем ресурсам на складе
            for (int i = 0; i < size; i++) {
                // ищем совпадение по именам
                if (this.resources[i].name().equals(name)) {
                    // проверяем есть ли столько ресурса на складе
                    if (this.resources[i].weight() < weight) {
                        System.out.println("У нас столько нет.\n Есть только: " + this.resources[i].weight());
                        return null;
                    }

                    else {
                        if (weight < resources[i].weight()) {
                            int remainder = resources[i].weight() - weight;
                            resources[i] = new Resource(name, remainder);
                        }
                        else if (weight == resources[i].weight()) {
                            for (int j = i; j < size - 1; j++) {
                                resources[j] = resources[j + 1];
                            }
                            resources[--size] = null;
                        }
                        this.currentWeight -= weight;
                        return new Resource(name, weight);
                    }
                }
            }
        }
        System.out.println("Такого ресурса на складе нет");
        return null;
    }

    public void printStorage() {
        System.out.println("=====СКЛАД=====");
        System.out.println("Занято веса: " + this.currentWeight + " из " + this.maxCapacity);
        System.out.println("Занято слотов: " + this.size + " из " + this.resources.length);
        for (int i = 0; i < this.size; i++) {
            System.out.println("- " + this.resources[i].name() + ": " + this.resources[i].weight());
        }
        System.out.println("==============================");
    }
}
