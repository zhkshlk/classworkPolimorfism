public class Oceanarium {
    private Swimmable[] animals;

    public Oceanarium() {
    }

    public Oceanarium(Swimmable[] animals) {
        this.animals = animals;
    }

    public Swimmable[] getAnimals() {
        return animals;
    }

    public void setAnimals(Swimmable[] animals) {
        this.animals = animals;
    }
    public void activate () {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Shark) {
                ((Shark) animals[i]).hunt();
            }
            else if (animals[i] instanceof Tortuga) {
                ((Tortuga) animals[i]).layEggs();
            }
            animals[i].voice();
            animals[i].swim();
        }
    }

}
