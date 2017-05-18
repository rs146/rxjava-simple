import org.junit.Test;
import rx.Observable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * See RxJava {@see http://reactivex.io/documentation/operators/defaultifempty.html}
 */
public class SwitchIfEmpty {

    private List<String> fullList = Arrays.asList("Rex", "Bob", "John");

    @Test
    public void whenEmptyObservable() {
        switchIfEmpty(Collections.emptyList());
    }

    @Test
    public void whenObservableWithItems() {
        switchIfEmpty(fullList);
    }

    private void switchIfEmpty(List<String> list) {
        Observable.from(list)
                .switchIfEmpty(Observable.just("Oh dear"))
                .subscribe(System.out::println);
    }

}
