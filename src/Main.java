public class Main {
    public static void main(String[] args) {


        PetHospital petHospital = new PetHospital();
        Cat cat = new Cat("White", "Pers", 16);
        Dog dog = new Dog("rax", "Labr", 10, 2);
        Pig pig = new Pig("Svin", "Xryak", 5);


        Car car1 = new Car(1, "BMW", "Sedan", 200);
        Car car2 = new Car(1, "BMW", "Sedan", 200);
        Car car3 = new Car(2, "BMW", "Sedan", 200);

//        System.out.println(car1.hashCode());
//        System.out.println(car1.hashCode());
//        System.out.println(car3.hashCode());
//
//        System.out.println(car1.equals(car2));
//        System.out.println(car1);


        Swimable a = new Dog();
        Swimable b = new Pig("Xryak", "Svin", 12);

        Pool pool= new Pool();
        pool.goSwimming(a);
        pool.goSwimming(b);



    }


}
