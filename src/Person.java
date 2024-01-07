public class Person {
    int age;
    String name;
    double weight;

    Person(int age, String name, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getInfo() {
        return String.format("Имя: %s, возраст: %d, вес: %.1f", name, age, weight);
    }
}

