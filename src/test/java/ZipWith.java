import org.junit.Test;
import rx.Observable;

import java.util.Arrays;
import java.util.List;

public class ZipWith {

    private List<String> firstNames = Arrays.asList("Bob", "Rex", "John", "Mark");
    private List<String> surnames = Arrays.asList("Smith", "Coby", "Teddy", "Jones");

    @Test
    public void zipWith() {
        Observable<String> firstNameObservable = Observable.from(firstNames);
        Observable<String> surnameObservable = Observable.from(surnames);

        Observable.zip(firstNameObservable, surnameObservable, (firstName, surname) -> firstName + " " + surname)
                .subscribe(System.out::println);
    }
}
