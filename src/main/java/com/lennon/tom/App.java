package com.lennon.tom;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        String sourceFile = args[0];
        String sourceColumn = args[1];
        String compareFile = args[2];
        String compareColumn = args[3];

        new ExcelMerger(sourceFile, sourceColumn, compareFile, compareColumn);

    }
}
