package org.example;

import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }



        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        MergeSortedArrays.Merge(nums1, 3, nums2, 3);
        System.out.println(java.util.Arrays.toString(nums1));



        int [] nums3 = {1,2,3,0,4,0};
        int k = RemoveElement.removeElement(nums3, 3);
        System.out.println("num3: " + java.util.Arrays.toString(nums3));
        System.out.println("k: " + k);

        int [] nums4 = {1, 1, 2, 3, 4, 4};
        int k1 = RemoveDuplicatesFromSortedArray.removeDuplicates(nums4);
        System.out.println("num4: " + java.util.Arrays.toString(nums4));
        System.out.println("k1: " + k1);





    }
}