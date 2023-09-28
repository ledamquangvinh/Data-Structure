/*
 * Name: Le Dam Quang Vinh
 * Project: Rearrange an array in maximum minimum form using Two Pointer Technique
 * Date: 28 Sep 2023
 * Copy Right: Three Musketeer
 */

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] tempArr = new int[a.length];
        int i = 0;
        int j = a.length - 1;
        int tempIndex = 0;

        if(a.length % 2 != 0) {
            tempArr[tempArr.length - 1] = a[a.length / 2];
        }
        for(i = 0; i < a.length/2; i++) {
            tempArr[tempIndex] = a[j];
            tempArr[tempIndex+1] = a[i];
            j--;
            tempIndex+=2;
            if(tempIndex >= a.length) {
                break;
            }
        }

        for(int k : tempArr) {
            System.out.println(k);
        }
    }
}