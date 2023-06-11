
// Интерфейс для иерархических классов
interface Location {
    String getName();
}

// Класс Страна
class Country implements Location {
    private String name;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Класс Штат
class State implements Location {
    private String name;
    private Country country;

    public State(String name, Country country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }
}

// Класс Город
class City implements Location {
    private String name;
    private State state;

    public City(String name, State state) {
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public State getState() {
        return state;
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляры классов
        Country germany = new Country("Германия");

        State bavaria = new State("Бавария", germany);
        State berlin = new State("Берлин", germany);

        City munich = new City("Мюнхен", bavaria);
        City hamburg = new City("Гамбург", berlin);

        // Выводим информацию о созданных экземплярах
        System.out.println("Страна: " + germany.getName());
        System.out.println("Штат: " + bavaria.getName() + ", Принадлежит к стране: " + bavaria.getCountry().getName());
        System.out.println("Город: " + munich.getName() + ", Принадлежит к штату: " + munich.getState().getName());
        System.out.println("Штат: " + berlin.getName() + ", Принадлежит к стране: " + berlin.getCountry().getName());
        System.out.println("Город: " + hamburg.getName() + ", Принадлежит к штату: " + hamburg.getState().getName());
    }
}
