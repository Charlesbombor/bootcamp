package com.vtxlab.bootcamp;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        // java.lang
        String s = "hello";
        StringBuilder sb = new StringBuilder();
        System.out.println(Math.max(1,3));

        int[] arr = new int[10];
        arr[0] = 3;
        arr[2] = 2;

        System.out.println(Arrays.toString(arr));
    }
}
