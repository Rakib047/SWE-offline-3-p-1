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
        //no work actually doing
    }

    @Override
    public void doMaintenance() {
        //sabotaging the voyage while doing maintenance work
        device.damageSpaceship();
    }
}
