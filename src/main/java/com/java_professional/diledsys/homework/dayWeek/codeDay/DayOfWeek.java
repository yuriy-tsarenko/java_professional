package com.java_professional.diledsys.homework.dayWeek.codeDay;

import java.util.ArrayList;
import java.util.Collections;

public class DayOfWeek {
    private static int past = 0;
    private static String range = "";
    private static String sortString="";

    public static String converter(String str) {
        str = sortirovka(str);
        StringBuilder sb = new StringBuilder();
        for (String s : str.split("")) {
            if (Integer.parseInt(s)>7|| Integer.parseInt(s)<1){
                System.out.println(s+" вне заданного диапазона");
                try {
                    throw new Exception();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            int num = Integer.parseInt(s);
            if (num - past != 0) {
                if (num - past == 1 || past == 0) {
                    range = range + num;
                } else {
                    sb.append(range + "," + num);
                    range = "";
                    past = 0;
                }
            }
            past = num;
        }
        sb.append(range);

        String convertor = "";
        for (String s : sb.toString().split(",")){
            if (s.length() > 1) {
                int length = s.length();
                convertor += (s.substring(0, 1) + "-" + s.substring(length - 1));
            }else {convertor += s;}
            convertor += ",";}
        return convertor;
    }

    private static String sortirovka(String num) {

        ArrayList<Integer> list = new ArrayList<>();
        String[] strNum = num.split("");
        for (String s : strNum) {
            list.add(Integer.parseInt(s));
        }
        Collections.sort(list);
        list.forEach(l -> {
            sortString += l;
        });
        return sortString;
    }
}
