package Adapter;

import Crew.Spaceship;
import Imposter.ImposterDevice;

public class ImposterAdapter implements Spaceship {
    private ImposterDevice device;
    public ImposterAdapter(ImposterDevice device){
        this.device=device;
    }
    @Override
    public void studyInterstellerObjects() {
        System.out.println("Attempting to sabotage this voyage by poisoning the crewmates and damaging the spaceship");
    }

    @Override
    public void doMaintenance() {
        //sabotaging the voyage while doing maintenance work
        device.damageSpaceship();
    }
}
