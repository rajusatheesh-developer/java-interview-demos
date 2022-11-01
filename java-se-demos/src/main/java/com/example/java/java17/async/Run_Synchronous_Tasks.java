package com.example.java.java17.async;

import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class Run_Synchronous_Tasks {

    record Quotation(String server, int amount) {
    }

    public static void main(String[] args) {
        run();
    }

    private static void run() {

        Random random = new Random();

        Callable<Quotation> fetchQA = () -> {
            Thread.sleep(random.nextInt(80, 120));
            return new Quotation("Server-A", random.nextInt(30, 60));
        };

        Callable<Quotation> fetchQB = () -> {
            Thread.sleep(random.nextInt(80, 120));
            return new Quotation("Server-B", random.nextInt(40, 80));
        };

        Callable<Quotation> fetchQC = () -> {
            Thread.sleep(random.nextInt(80, 120));
            return new Quotation("Server-C", random.nextInt(50, 100));
        };

        Callable<Quotation> fetchQD = () -> {
            Thread.sleep(random.nextInt(80, 120));
            return new Quotation("Server-D", random.nextInt(20, 80));
        };

        List<Callable<Quotation>> list = List.of(fetchQA, fetchQB, fetchQC, fetchQD);
        Instant start = Instant.now();
        Quotation bestQuotation = list.stream().map(Run_Synchronous_Tasks::fetchQuotation)
                .min(Comparator.comparing(Quotation::amount))
                .orElseThrow();

        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println("Best Quotation [SYNC]=" + bestQuotation + " (" + duration.toMillis() + ") ms ");
    }

    public static Quotation fetchQuotation(Callable<Quotation> callable) {
        try {
            return callable.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
