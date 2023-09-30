/*
 * Name: Le Dam Quang Vinh
 * Project: Rearrange an array such that arr[i] = i
 * Date: 28 Sep 2023
 * Copy Right: Three Musketeer
 */

public class Main {
    public static void main(String[] args) {
        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        fixArr(arr);
        printArr(arr);
    }

    public static int[] fixArr(int[] a) {
        for(int i = 0; i < a.length;i++) {
            if(a[i] != -1 && a[i] != i) {
                int x = a[i];
                while(a[x] != -1 && a[x] != x) {
                    int y = a[x];
                    a[x] = x;
                    x = y;
                }
                a[x] = x;
                if(a[i] != i) {
                    a[i] = -1;
                }
            }
        }
        return a;
    }
    public static int[] rearange(int[] a) {
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = 0; j < a.length;j++) {
                if(i == a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
    public static void printArr(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}