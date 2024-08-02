public class Tortuga implements Swimmable{
    public Tortuga() {
    }

    @Override
    public void swim() {
        System.out.println("умею плавать");
    }

    @Override
    public void voice() {
        System.out.println("издаю тихий голос");
    }
    void layEggs () {
        System.out.println("Откладываю яйца по 3");
    }
}
