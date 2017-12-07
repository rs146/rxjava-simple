import org.junit.Test;
import rx.Observable;

public class StringAsObservable {

    @Test
    public void createStringObservable() {
        String helloWorld = "Hello world";

        Observable.just(helloWorld)
                .subscribe(string -> System.out.println(string));
    }
}
