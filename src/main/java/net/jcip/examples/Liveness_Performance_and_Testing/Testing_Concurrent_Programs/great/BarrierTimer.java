package net.jcip.examples.Liveness_Performance_and_Testing.Testing_Concurrent_Programs.great;

/**
 * BarrierTimer
 * <p/>
 * Barrier-based timer
 *
 * @author Brian Goetz and Tim Peierls
 */
public class BarrierTimer implements Runnable {
    private boolean started;
    private long startTime, endTime;

    public synchronized void run() {
        long t = System.nanoTime();
        if (!started) {
            started = true;
            startTime = t;
        } else
            endTime = t;
    }

    public synchronized void clear() {
        started = false;
    }

    public synchronized long getTime() {
        return endTime - startTime;
    }
}
