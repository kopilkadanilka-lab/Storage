
public class Main {
    static void main(String[] args) {
        Storage storage = new Storage(100, 3);
        storage.printStorage();

        WarehouseOperation[] operations = {
                new IncomingOperation(new Resource("Железо", 50)),
                new IncomingOperation(new Resource("Дерево", 20)),
                new OutgoingOperation("Железо", 15),
                new IncomingOperation(new Resource("Уголь", 10)),
                new OutgoingOperation("Дерево", 5),
                new OutgoingOperation("Алмазы", 10),
                new IncomingOperation(new Resource("Медь", 5))
        };

        for (WarehouseOperation operation : operations) {
            boolean result = operation.execute(storage);
            System.out.println("Успешно? " + result);
        }
        storage.printStorage();
    }
}
