import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambdas {

    private void useLambdas() {
        Person person = new Person("Rahul", "Singh", "rahul.singh@ostmodern.co.uk");
        Person person1 = new Person("Jack", "Smith", "jack@smithworld.com");
        Person person2 = new Person("Bill", "Smith", "bill@smithworld.com");
        List<Person> persons = Arrays.asList(person, person1, person2);

        List<Person> smiths = persons.stream()
                .filter(aPerson -> aPerson.getLastName().equalsIgnoreCase("Smith"))
                .collect(Collectors.toList());

        for (Person aPerson : smiths) {
            System.out.println(aPerson);
        }
    }

    public static void main(String[] args) {
        Lambdas lambdas = new Lambdas();
        lambdas.useLambdas();
    }
}
