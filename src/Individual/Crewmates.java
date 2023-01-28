package Individual;

import Component.Component;

public class Crewmates implements Component {

    private String crewName;

    public void CrewMate(String crewName){
        this.crewName=crewName;
    }
    @Override
    public void doTask() {
        System.out.println("Studying intersteller objects and doing basic maintenance works");
    }
}
