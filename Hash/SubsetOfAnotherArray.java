/*
    Time Complexity: O(m+n);
    Auxiliary Space: O(m);
*/    

import java.util.*;
public class SubsetOfAnotherArray {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(isSubset(arr1, arr2));
    }
    public static boolean isSubset(int arr1[],int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i:arr1) set.add(i);
        for(int i:arr2) if(!set.contains(i)) return false;
        return true;
    }
}
