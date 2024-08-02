public class Duck implements Swimmable{
    @Override
    public void swim() {
        System.out.println("купаюсь над водой");
    }

    @Override
    public void voice() {
        System.out.println("карк-карк");
    }
}
