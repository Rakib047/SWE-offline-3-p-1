package Individual;

import Component.Component;

public class Crewmate implements Component {

    private String crewName;

    public Crewmate(String crewName){
        this.crewName=crewName;
    }
    @Override
    public void doTask() {
        System.out.println("Studying intersteller objects and doing basic maintenance works");
    }
}
