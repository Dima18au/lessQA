package org.less6.less8;

import java.util.*;

public class colex {
    public static void main(String[] args) {
        int[]ar12 = new int[10];
        String [] strings = new String[10];
        for (String strins: strings) {
          //  System.out.println(strins.charAt(0)+ " ");
            System.out.println(strins + " ");
        }
        for (int i : ar12) {
//            System.out.print(i+ " ");
        }
        //Collections
        //List
        List<Integer>linkedlist = new LinkedList<>();

        linkedlist.add(12);
        linkedlist.add(11);
        linkedlist.add(15);
        linkedlist.remove(1);
        linkedlist.add(0,100);

        for (Integer integer: linkedlist) {
            System.out.println("Linked " + integer);
        }
        List<String>arraylist = new ArrayList<>();
        arraylist.add("one way");
        arraylist.add("two house");
        arraylist.add("milk");
        arraylist.remove("one way");
        for (String s: arraylist) {
            System.out.println("ArrayList " + s);
        }
        Set<String>set = new HashSet<>();//нет одиннаковых элементов
        //не упорядочивает элементы
        set.add("A");
        set.add("A");
        set.add("B");
        set.add("A");
        set.add("C");
        set.add("C");

        for (String s: set) {
            System.out.println("set = " + s);
        }
        Iterator<String>iterator = set.iterator();// 1 2 4 6 7 9
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println("Set iterator = " + next);
        }
        Set<student>students = new HashSet<>();
        students.add(new student("Mik", "123123"));
        students.add(new student("Mik", "123123"));
        students.add(new student("Mira", "143123"));
        for (student stud : students) {
            System.out.println("stud = " + stud);
        }
        
        
        System.out.println("A".hashCode());
        System.out.println("B".hashCode());
        Integer a = 13;
        System.out.println(a.hashCode());
        Integer b = 34;
        System.out.println(b.hashCode());
        }
    }

