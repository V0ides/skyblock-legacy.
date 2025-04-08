package com.skyblock.skyblock.utilities;

public class Timer {
    private long startTime;
    private long endTime;

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        // ("Execution time: " + elapsedTime + " milliseconds.");
    }
    
    public String endTime() { return endTime(); }
}
