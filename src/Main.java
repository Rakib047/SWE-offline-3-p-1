import Group.Passengers;
import Individual.Crewmate;
import Individual.Imposter;

public class Main {
    public static void main(String[] args) {
        Passengers passengerGroup;

        passengerGroup=new Passengers();
        passengerGroup.addPassenger(new Crewmate("Sayed"));
        passengerGroup.addPassenger(new Imposter("Rakib"));
        passengerGroup.addPassenger(new Imposter("Sami"));
        passengerGroup.addPassenger(new Crewmate("Shawon"));
        passengerGroup.addPassenger(new Crewmate("Ahnaf"));
        passengerGroup.addPassenger(new Crewmate("Porag"));

        passengerGroup.doTask();
    }
}