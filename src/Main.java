public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage(100, 2);

        System.out.println("--- ТЕСТ 1: Добавление первого ресурса ---");
        storage.add(new Resource("Железо", 30));
        storage.printStorage();

        System.out.println("\n--- ТЕСТ 2: Стаканье одинакового ресурса ---");
        storage.add(new Resource("Железо", 40));
        storage.printStorage();

        System.out.println("\n--- ТЕСТ 3: Добавление второго типа ресурса ---");
        storage.add(new Resource("Дерево", 20));
        storage.printStorage();

        System.out.println("\n--- ТЕСТ 4: Превышение лимита по слотам ---");
        storage.add(new Resource("Уголь", 5));
        storage.printStorage();

        System.out.println("\n--- ТЕСТ 5: Превышение грузоподъемности ---");
        storage.add(new Resource("Железо", 20));
        storage.printStorage();
    }
}