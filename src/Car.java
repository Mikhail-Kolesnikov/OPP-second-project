import java.util.Objects;

public class Car {

    private int number;
    private String name;
    private String type;
    private int maxKmh;

    public Car(int number, String name, String type, int maxKmh) {
        this.number = number;
        this.name = name;
        this.type = type;
        this.maxKmh = maxKmh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (number != car.number) return false;
        if (maxKmh != car.maxKmh) return false;
        if (!Objects.equals(name, car.name)) return false;
        return Objects.equals(type, car.type);
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + maxKmh;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", maxKmh=" + maxKmh +
                '}';
    }
}
