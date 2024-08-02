public class Shark implements Swimmable{
    @Override
    public void swim() {
        System.out.println("плаваю под водой");
    }

    @Override
    public void voice() {
        System.out.println("челюсти");
    }

    void hunt () {
        System.out.println("HUNTING");
    }
}
