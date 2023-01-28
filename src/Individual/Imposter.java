package Individual;

import Component.Component;

public class Imposter implements Component {
    private String imposterName;

    public Imposter(String imposterName){
        this.imposterName=imposterName;
    }
    @Override
    public void doTask() {
        System.out.println(imposterName+": Attempting to sabotage this voyage by poisoning the\n" +
                "crewmates and damaging the spaceship");
    }
}
