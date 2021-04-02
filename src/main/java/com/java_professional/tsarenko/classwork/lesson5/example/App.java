package com.java_professional.tsarenko.classwork.lesson5.example;

import com.google.common.base.CaseFormat;
import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Maps;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        String input = "---Word";
        String inputTwo = "---Word2";
        String joiner = Joiner.on(",")
                .join(input, inputTwo);

        System.out.println(joiner);

        Map<String,String> map = Maps.newLinkedHashMap();
        map.put("Audi", "Neckarsulm");
        map.put("VW", "Wolfsburg");
        map.put("Merzedes", "Stuttgart");
        map.put("Porsche", "Stuttgart");
        map.put("Opel", "Rüsselsheim");
        map.put("Ford", "Köln");

        String joined = Joiner.on("][").withKeyValueSeparator("-").join(map);
        System.out.println(joined);


        Iterable<String> split = Splitter.on(',')
                .trimResults()
                .omitEmptyStrings()
                .split("the ,quick, ,brown, fox, jumps, over, the, lazy, little dog.");
        System.out.println(split);


        System.out.println(CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL, "test-data"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "test_data"));
        System.out.println(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, "test_data"));

        String result = CharMatcher.is('-').trimLeadingFrom(input);
        System.out.println(result);

    }
}
