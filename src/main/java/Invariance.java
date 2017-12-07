import java.util.ArrayList;
import java.util.List;

public class Invariance {

    public static void main(String[] args) {
        List<Dog> dogList= new ArrayList<>();
        //List<Animal> animalList = dogList;

        Covariance covariance = new Covariance();
        covariance.main();
    }
}
