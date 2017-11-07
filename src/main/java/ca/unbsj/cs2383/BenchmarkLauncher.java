package ca.unbsj.cs2383;
 
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;
 
/**
 * @author Luca Merello
 */
public final class BenchmarkLauncher
{
    /**
     * Private constructor.
     */
    private BenchmarkLauncher() {}
 
    /**
     * Main method to start micro-benchmark tests.
     *
     * @param _args
     * @throws RunnerException
     */
    public static void main(final String[] _args)
        throws RunnerException
    {
        Options opt = new OptionsBuilder().warmupTime(TimeValue.seconds(1))
                         .warmupIterations(5)
                         .measurementTime(TimeValue.seconds(5))
                         .measurementIterations(5).build();
 
        new Runner(opt).run();
    }
}