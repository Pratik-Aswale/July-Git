package com.HashsetDemo;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet hashSet=new HashSet<>();

        hashSet.add("Optimus");
        hashSet.add("Megatron");
        hashSet.add("Lockdown");
        hashSet.add("Shockwave");
        hashSet.add("Cybertron");

        TreeSet treeSet=new TreeSet<>(hashSet);
        System.out.println("after sorting :"+treeSet);

    }
}
