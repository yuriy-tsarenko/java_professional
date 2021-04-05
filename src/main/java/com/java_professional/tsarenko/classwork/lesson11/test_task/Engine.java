package com.java_professional.tsarenko.classwork.lesson11.test_task;

import org.apache.log4j.Logger;

import java.util.Scanner;

//TODO: add javadoc
public final class Engine {

    private static final Logger log = Logger.getLogger(Engine.class);

    //TODO: add javadoc
    private final static String EXIT = "q";

    //TODO: add javadoc
    private Engine() {
    }

    //TODO: add javadoc
    public static void run() {
        String choice = "";
        while (!choice.equals(EXIT)) {
            System.out.println("enter your sequence: ");
            try {
                Scanner reader = new Scanner(System.in);
                String sequence = reader.next();
                System.out.println("result: " + SequenceResolver.resolve(sequence));
                System.out.print("enter \"q\" to exit or any other symbol to try again: ");
                choice = reader.next();
            } catch (UnsupportedArgumentException e) {
                log.error(e);
                System.err.println(e);;
            }
        }
    }
}
