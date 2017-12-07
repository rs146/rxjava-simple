import org.junit.Test;
import rx.Observable;
import rx.Observer;
import rx.functions.Action1;
import rx.functions.Func1;

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
                .subscribe(new Observer<String>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(String s) {
                        System.out.print(s);
                    }
                });
    }
}
