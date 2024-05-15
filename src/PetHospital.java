public class PetHospital {

    public void helpForAnimal(Animal animal){
        System.out.println("Now will be read Insruction");
        animal.getInstruktion();
        System.out.println("Born" + animal.getClass());
        animal.born();
        animal.setAge(0);

    }
//    public void helpForDog(Dog dog){
//        System.out.println("Born dog");
//        dog.born();
//    }
//    public void helpForPig(Pig pig){
//        System.out.println("Pig born");
//        pig.born();
//    }
}
