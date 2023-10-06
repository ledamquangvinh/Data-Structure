package Array;

public class Demo1 {
public static void ThreeBiggestNum(Integer[] inputArr) {
    Integer biggest = 0;
    Integer second = 0;
    Integer third = 0;

    third = inputArr[0];

    for(int i = 0; i < inputArr.length; i++) {
        if(inputArr[i] > third) {
            if(inputArr[i] > second) {
                if(inputArr[i] < biggest) {
                    third = second;
                    second = inputArr[i];
                } else {
                    third = second;
                    second = biggest;
                    biggest = inputArr[i];
                }
            } else {
                third = inputArr[i];
            }
        }
    }

    System.out.println(" biggest " + biggest + " second " + second + " third " + third);
}


    public static void main(String[] args) {
        Integer[] arr = {1, 3, 2, 7, 6, 15, 12, 14, 13};

        ThreeBiggestNum(arr);
    }
}
