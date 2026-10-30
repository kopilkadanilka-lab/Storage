public record Resource(String name, int weight) {
    public Resource {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Некорректное название");
        }

        if (weight <= 0) {
            throw new IllegalArgumentException("Вес должен быть положительным");
        }
    }
}