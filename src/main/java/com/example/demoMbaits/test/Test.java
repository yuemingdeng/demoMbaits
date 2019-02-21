package com.example.demoMbaits.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        /*new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    for (int i = 1; i <= 100; i++) {
                        if (i % 10 == 0) {
                            int j = i / 0;
                        }
                        System.out.println("value : " + i);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }).start();*/

//        int[] is = new int[]{1, 2, 3};

        List<Integer> is = new ArrayList<Integer>(Arrays.asList(1,2,3) );
        System.out.println(is.toString());


    }
}

