package diledsys.homework.myArrayList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        MyLinkedList<String> myList = new MyLinkedList<>();
        myList.addFirst("Si");
        myList.addFirst("Hr");
        myList.addFirst("Fe");
        myList.addFirst("Mg");
        myList.addFirst("Cu");
        myList.addFirst("Cu");
        myList.addFirst("Cu2");
        myList.addFirst("Cu");
        myList.addFirst("Cu3");
        myList.addFirst("err");
        System.out.println(myList.get(5));
        System.out.println();
        System.out.println(myList.remove("Cu"));
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        MyList<String> myLists = new MyArrayList();
        myLists.add("Si");
        myLists.add("Hr");
        myLists.add("Fe");
        myLists.add("Mg");
        myLists.add("Cu");
        myLists.add("Cu");
        myLists.add("Cu2");
        myLists.add("Cu");
        myLists.add("Cu3");
        myLists.add("err");
        System.out.println(Arrays.toString(myLists.toArray()));
        System.out.println(myLists.size());
        System.out.println(myLists.remove("Cu3"));
        System.out.println(myLists.size());
        System.out.println("mylists.lastIndexOf(\"Cu\")= " + myLists.lastIndexOf("Cu"));
        System.out.println("indexOf(\"Mg\") = " + myLists.indexOf("Mg"));
        System.out.println(myLists.size());
    }
}
