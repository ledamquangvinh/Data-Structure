/*
* Name: Le Dam Quang Vinh
* Project: Find the largest three distinct elements in an array
* Date: 28 Sep 2023
* Copy Right: Three Musketeer
*/

public class Main {
    public static int[] arr = {10, 4, 3, 50, 23, 90};
    public static void main(String[] args) {
        int[] arr = {10, 4, 3, 50, 23, 90};
        int first = 0;
        int second = 0;
        int third = 0;
        for (int j : arr) {
            System.out.println(j);
        }
        for(int i = 0; i < arr.length;i++){
            if(arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second && arr[i] != first) {
                third = second;
                second = arr[i];
            }
            else if(arr[i] > third && arr[i] != second) {
                third = arr[i];
            }
        }
        System.out.println("first: " + first + " second: " + second + " third: " + third);
    }

    public static int[] sortArr(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for(int j = 0; j < a.length - 1; j++) {
                if(a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}