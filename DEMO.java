import java.util.Arrays;

class DEMO
{
    static void print3largest(int arr[])
    {
        int i, first, second, third;

        if (arr.length < 3) {
            System.out.println("Invalid Input");
            return;
        }
        third = second = first = Integer.MIN_VALUE;

        for (i = 0; i < arr.length; i++) {

            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }

            else if (arr[i] > second) {
                third = second;
                second = arr[i];
            }

            else if (arr[i] > third) {
                third = arr[i];
            }
        }

        System.out.println("The 3 largest elements are: " + first + " " + second + " " + third);
    }

    static void find_2nd_largest (int arr[])
    {
        int i, first, second;

        if (arr.length < 2) {
            System.out.println("Invalid Input");
            return;
        }

        Arrays.sort(arr);

        for (i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[arr.length - 1]) {
                System.out.println("The second largest elements is: " + arr[i]);
                return;
            }
        }
        System.out.println("There is no second largest element");
    }




    public static void main(String[] args)
    {
        int arr[] = {25, 39,45, 17, 51, 7, 26,0, 1, 5, 0};
        int length = arr.length;
        print3largest(arr);
        find_2nd_largest(arr);
    }
}
