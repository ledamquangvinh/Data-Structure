/*
 * Name: Le Dam Quang Vinh
 * Project: Segregate even and odd numbers using Lomuto’s Partition Scheme
 * Date: 28 Sep 2023
 * Copy Right: Three Musketeer
 */

public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 4, 6, 1, 3, 8, 5};
        LomutoEvenOdd(arr);
        printArr(arr);

    }

    public static int[] segregateEvenAndOdd(int[] a) {
        int j = a.length - 1;
        int[] temp = new int[a.length];
        int index = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0) {
                temp[index++] = a[i];
            }
            else {
                temp[j] = a[i];
                j--;
            }
        }
        return temp;
    }

    public static int[] LomutoEvenOdd(int[] a){
        int i = -1, j = 0;

        while (j < a.length) {
            if(a[j] % 2 == 0) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            j++;
        }
        return a;
    }

    public static void printArr(int[] a) {
        for (int i: a) {
            System.out.println(i);
        }
    }
}