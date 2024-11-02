package com.java.CollectionExam;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExam {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(0, "문자열0");
        hm.put(1, "문자열1");
        hm.put(2, "문자열2");
        hm.put(3, "문자열3");

        System.out.println(hm.toString());

        String str = hm.get(2);
        System.out.println(str);

        hm.remove(2);
        System.out.println(hm.toString());

        hm.clear();
        System.out.println(hm.toString());
//[0,1,2,3]
        hm.put(0, "문자열0");
        hm.put(1, "문자열1");
        hm.put(2, "문자열2");
        hm.put(3, "문자열3");
        System.out.println(hm.toString());

        Iterator<Integer> itr = hm.keySet().iterator();
        // Iterator 클래스 : 반복자 , 반복적으로 자료를 검색하는데 유용함
        while (itr.hasNext()) {
            String string = hm.get(itr.next());
            System.out.println(string);
        }
    }
}
