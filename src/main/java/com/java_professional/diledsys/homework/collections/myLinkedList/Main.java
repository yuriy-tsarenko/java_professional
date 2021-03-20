package com.java_professional.diledsys.homework.collections.myLinkedList;

public class Main {

    public static void main(String[] args) {

        MyLinkedList<String> myList = new MyLinkedList<>();
        //linkedList.add("2");
        //MyList<String> myList = new  MyArrayList();
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


        //System.out.println(myList.get(5));
        System.out.println();
//        System.out.println(myList.removeLast());
        for (int i = 0; i <myList.size() ; i++) {
            System.out.println(myList.get(i));
        }
//        for (int i = 0; i <myList.size() ; i++) {
//            System.out.println(myList.get(i));
//        }
//        System.out.println(myList.removeFirst());


//            for (String str:myList)
//                System.out.println("->"+str);
//        System.out.println(Arrays.toString(myList.toArray()));
//
//        System.out.println(myList.size());
//
//        System.out.println(myList.remove("Cu3"));
//
//        System.out.println(myList.size());
//
//        System.out.println("mylist.lastIndexOf(\"Cu\")= " + myList.lastIndexOf("Cu"));
//
//        System.out.println("indexOf(\"Mg\") = " + myList.indexOf("Mg"));
//
//        System.out.println(myList.size());

    }

}
