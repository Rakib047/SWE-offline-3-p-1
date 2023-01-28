import Group.Passengers;
import Individual.Crewmates;
import Individual.Imposter;

public class Main {
    public static void main(String[] args) {
        Passengers passengerGroup;

        passengerGroup=new Passengers();
        passengerGroup.addPassenger(new Crewmates("Sayed"));
        passengerGroup.addPassenger(new Imposter("Rakib"));
        passengerGroup.addPassenger(new Imposter("Sami"));
        passengerGroup.addPassenger(new Crewmates("Shawon"));
        passengerGroup.addPassenger(new Crewmates("Ahnaf"));
        passengerGroup.addPassenger(new Crewmates("Porag"));
    }
}