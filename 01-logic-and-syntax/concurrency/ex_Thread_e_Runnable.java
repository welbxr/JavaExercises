import javax.management.QueryEval;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Main
{
    private static AtomicInteger number = new AtomicInteger(0);

    public static void main (String[] args)
    {

        Runnable inc = () ->
        {
            for (int i = 0; i < 1000_000; i++)
            {
                number.incrementAndGet();
            }
        };

        Runnable dec = () ->
        {
            for (int i = 0; i < 1000_000; i++)
            {
                 number.decrementAndGet();
            }
        };

        Runnable show = () ->
        {
            for (int i = 0; i < 1000_000; i++)
            {
                System.out.println(number);
            }
        };

        var execInc = new Thread(inc);
        execInc.start();
        execInc.setName("execInc");
        var execDec = new Thread(dec);
        execDec.start();
        execDec.setName("execDec");
        var execShow = new Thread(show);
        execShow.start();
        execShow.setName("execShow");
    }
}