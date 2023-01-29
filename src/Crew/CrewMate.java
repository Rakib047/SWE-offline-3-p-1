package Crew;

public class CrewMate implements Spaceship {

    @Override
    public void studyInterstellerObjects() {
        System.out.println("Studying intersteller objects");
    }

    @Override
    public void doMaintenance() {
        System.out.println("Doing basic maintenance tasks");
    }
}
