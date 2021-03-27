package com.java_professional.varycheva.homework.hw5.task1;

/*
В каждом предложении текста поменять местами первое слово с последним, не изменяя длины предложения.
 */
public class Main {

    public static StringBuffer createNewSentence(String[] text) {
        StringBuffer result = new StringBuffer();
        int size = text.length - 1;
        for (String word : text) {
            result.append(word);
            if (!word.equals(text[size])) {
                result.append(" ");
            } else {
                result.append(".");
            }
        }
        return result;
    }

    public static StringBuffer replaceWords(String[] text) {
        StringBuffer result = new StringBuffer();
        for (String sentence : text) {
            String[] words = sentence.trim().split("\\s");
            int size = words.length - 1;
            String temp = words[0];
            words[0] = words[size];
            words[size] = temp;
            result.append(createNewSentence(words)).append(" ");
        }
        return result;
    }

    public static void main(String[] args) {
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting, " +
                "remaining essentially unchanged. " +
                "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, " +
                "and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        String[] sentences = text.split("\\.");
        System.out.println(replaceWords(sentences));
    }
}
