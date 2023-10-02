/*
 * Name: Le Dam Quang Vinh
 * Project: Find second largest element in an array
 * Date: 28 Sep 2023
 * Copy Right: Three Musketeer
 */

public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int first = 0;
        int second = 0;

        if(arr.length < 2)
            System.out.println("invalid array");

        for(int i = 0; i < arr.length; i++) {
            if(first < arr[i]) {
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second && arr[i] != first){
                second = arr[i];
            }
        }

        System.out.println("second: " + second);
    }
}