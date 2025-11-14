package com.HashsetDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class EmptyArrayList {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList<>();
        System.out.println(arrayList);

        Iterator itr= arrayList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
