public class Dog extends Animal {
//
    private int numberOfKnownCommands;

    public Dog(String name, String type, int age, int numberOfKnownCommands) {
        setName(name);
        this.type= type;
        setAge(age);
        this.numberOfKnownCommands = numberOfKnownCommands;
    }

    public Dog() {
    }

    public int getNumberOfKnownCommands() {
        return numberOfKnownCommands;
    }

    public void setNumberOfKnownCommands(int numberOfKnownCommands) {
        this.numberOfKnownCommands = numberOfKnownCommands;
    }

    @Override
    void born() {
        System.out.println("I was born, i am a dog");
        System.out.println("");

    }

    @Override
    void getInstruktion() {
        System.out.println("Talk slow");
    }
}
