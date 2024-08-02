import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) {
        Swimmable[] swimmables = {
                new Tortuga(),
                new Tortuga(),
                new Shark(),
                new Duck()

        };
        Oceanarium aquarium = new Oceanarium(swimmables);
        aquarium.activate();

        Duck[] ducks = new Duck[5];
        Tortuga[] tortugas = new Tortuga[5];
        Shark[] sharks = new Shark[5];

        int ducksI = 0;
        int sharksI = 0;
        int tortugasI = 0;

        for (int i = 0; i < swimmables.length; i++) {
            if (swimmables[i] != null) {
                if (swimmables[i] instanceof Tortuga) {
                    tortugas[tortugasI++] = (Tortuga) swimmables[i];
                }
                else if (swimmables[i] instanceof Shark) {
                    sharks[sharksI++] = (Shark) swimmables[i];
                }
                else if (swimmables[i] instanceof Duck) {
                    ducks[ducksI] = (Duck) swimmables[i];
                }
            }
        }

        System.out.println(Arrays.toString(tortugas));
    }
}