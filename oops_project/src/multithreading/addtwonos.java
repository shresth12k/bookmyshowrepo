package multithreading;

import java.util.concurrent.Callable;
//import java.util.stream.Gatherer;
//import java.util.stream.Gatherer;
//import java.util.stream.Gatherer;

public class addtwonos  implements Callable<Double> {
    @Override
    public Double call() throws Exception{
        return 5.1 + 10;
    }
}
