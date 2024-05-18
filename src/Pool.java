public class Pool {
    public void goSwimming(Swimable swimable){
        System.out.println("Мы берем объект и кидаем в бассеин");
        swimable.swim();
        System.out.println("Все хорошо, плывет");
    }
}
