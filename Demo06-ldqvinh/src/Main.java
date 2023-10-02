/*
 * Name: Le Dam Quang Vinh
 * Project: Reversal algorithm for Array rotation
 * Date: 28 Sep 2023
 * Copy Right: Three Musketeer
 */

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        reverseByD(arr, 5);

        printArr(arr);
    }

    public static int[] reverseByD(int[] a, int d) {
        if(d < 0 || d > a.length){
            System.out.println("Invalid");
            return a;
        }

        for (int i = 0; i < d;i++) {
            for(int j = 0; j < a.length - 1;j++) {
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }
        return a;
    }
    public static void printArr(int[] a) {
        for(int i : a) {
            System.out.println(i);
        }
    }
}