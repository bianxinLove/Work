package Thread03;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 100 * ( 1 + 100 ) / 2;
    }
}
