import java.util.Objects;
import java.util.Random;

public class Cat  extends Animal{
//    private String name;
//    private final String type;
//    private int age;
    private int livesWasted;
    private int maxJump;
    private static final int MAX_LIVES = 9;



    public Cat(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

    }

    public Cat(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Cat() {
        type = "Дворняга";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                '}';
    }

    private void die() {
        livesWasted++;
        System.out.println("Cat died");
    }

    public void jump() {
        if (livesWasted == MAX_LIVES) {
            System.out.println("sorry, the cat is not more jumps");
            return;
        }

        Random random = new Random();
        int number = random.nextInt(0, 100);
        if (number < 1) {
            die();
        } else {
            System.out.println("Way, it`s fly good!");
        }
    }

    @Override
    void born() {
        System.out.println("The cat was born");
        System.out.println("Her name is" + getName());
    }

    @Override
    void getInstruktion() {
        System.out.println("She himseilf");
    }



    @Override
    public int hashCode() {
        int result = livesWasted;
        result = 31 * result + maxJump;
        return result;
    }
}












