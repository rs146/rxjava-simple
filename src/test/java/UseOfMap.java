import org.junit.Test;
import rx.Observable;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rahulsingh on 17/05/2017.
 */
public class UseOfMap {

    private List<String> names = Arrays.asList("Mike", "Ted", "John", "Bob", "Marley", "Trump", "Michael");

    /**
     * Map uses Func1 - one input one output. Pig in, sausage out.
     */
    @Test
    public void appendSurname() {
        Observable.from(names)
                .map(inputString -> inputString.concat(" Tamburrino"))
                .toList()
                .subscribe(resultList -> {
                    for (String newName : resultList) {
                        System.out.println(newName);
                    }
                });
    }
}
