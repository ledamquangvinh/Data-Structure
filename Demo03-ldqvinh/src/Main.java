/*
 * Name: Le Dam Quang Vinh
 * Project: Move all zeroes to end of array
 * Date: 28 Sep 2023
 * Copy Right: Three Musketeer
 */

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 0, 4, 3, 0, 5, 0};
        int count = 0;
        for(int j : a) {
            if(j != 0) {
                a[count++] = j;
            }
        }
        while(count < a.length) {
            a[count++] = 0;
        }

        for(int i : a) {
            System.out.println(i);
        }
    }
}