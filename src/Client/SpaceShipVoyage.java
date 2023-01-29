package Client;

import Adapter.ImposterAdapter;
import Crew.CrewMate;
import Crew.Spaceship;
import Imposter.Imposter;

public class SpaceShipVoyage {
    public static void main(String[] args) {
        Spaceship[] passengers=new Spaceship[5];

        passengers[0]=new CrewMate();
        passengers[1]=new CrewMate();
        passengers[2]=new ImposterAdapter(new Imposter());
        passengers[3]=new CrewMate();
        passengers[4]=new ImposterAdapter(new Imposter());

        for(Spaceship p:passengers){
            System.out.println("------------------------------");
            p.studyInterstellerObjects();
            p.doMaintenance();
        }
    }
}