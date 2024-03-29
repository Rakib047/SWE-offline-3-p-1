package Group;

import Component.Component;

import java.util.ArrayList;
import java.util.List;

public class Passengers implements Component {
    private List<Component>individualPassengerList;
    public Passengers(){
        individualPassengerList=new ArrayList<>();
    }
    public void addPassenger(Component passenger){
        individualPassengerList.add(passenger);
    }
    public void remove(Component passenger){
        individualPassengerList.remove(passenger);
    }
    @Override
    public void doTask() {
        for(Component passenger:individualPassengerList){
            passenger.doTask();
        }
    }
}
