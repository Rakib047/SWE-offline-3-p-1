package Adapter;

import Crew.Spaceship;
import Imposter.Monster;

public class ImposterDevice implements Spaceship {
    private Monster device;
    public ImposterDevice(Monster device){
        this.device=device;
    }
    @Override
    public void studyInterstellerObjects() {
        //not doing any actual study
        System.out.println("Attempting to sabotage this voyage by poisoning the crewmates and damaging the spaceship");
    }

    @Override
    public void doMaintenance() {
        //sabotaging the voyage while doing maintenance work
        //not doing actual maintenance work
        device.damageSpaceship();
    }
}
