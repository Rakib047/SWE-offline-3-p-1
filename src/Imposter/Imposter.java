package Imposter;

public class Imposter implements Monster {
    @Override
    public void damageSpaceship() {
        //the actual work of imposter
        System.out.println("Damaging the spaceship in while doing maintenance work");
    }
}
