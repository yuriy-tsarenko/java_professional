package com.java_professional.tsarenko.collection_custom;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Data<String> dataList = new DataList<>();
        List<String> stringList = new ArrayList<>();
//        workDataList(dataList);
//        workArrayList(stringList);
    }

    public static void printTimeStamp() {
        System.out.println("---------TIMESTAMP----------");
        System.out.println(new SimpleDateFormat("HH:mm:ss:ms").format(new Date()));
        System.out.println("----------------------------");
    }

    public static void workDataList(Data<String> strings) {
        printTimeStamp();
        for (int i = 0; i < 50000000; i++) {
            strings.add("Text " + i);
            if (i == 50000000 - 1) {
                System.out.println("Task performed!");
            }
        }
        System.out.println("Total size: " + strings.size());
        printTimeStamp();
    }

    public static void workArrayList(List<String> stringList) {
        printTimeStamp();
        for (int i = 0; i < 50000000; i++) {
            stringList.add("Text " + i);
            if (i == 50000000 - 1) {
                System.out.println("Task performed!");
            }
        }
        System.out.println("Total size: " + stringList.size());
        printTimeStamp();
    }
}
