public class Pig extends Animal implements Swimable{




    @Override
    void born() {



        System.out.println("The pig is happy");

    }

    @Override
    public String toString() {
        return "Pig{" +
                "age=" + age +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


    private String name;
//    private String type;
//    private int age;

    @Override
    void getInstruktion() {
        System.out.println("1.Сначала уложите на бок");
        System.out.println("2");
        System.out.println("3");
    }

    public Pig(String name,String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println("Еле плывет");
    }
}
