package NTBao.src;

public class Demo5 {
    public static void main(String[] args) {
        Integer[] arr = {2, 3, 4, 5, 6, 7, 9};
        RearrangeTwoPointers(arr);
    }

    public static void RearrangeTwoPointers(Integer[] inputArr) {
        Integer index = 0;
        Integer endIndex = inputArr.length - 1;
        Integer[] resultArr = new Integer[inputArr.length];

        for (int i = 0; i < inputArr.length; i++) {
            if(i % 2 == 0) {
                // even
                resultArr[i] = inputArr[index];
                index++;
            } else {
                // odd
                resultArr[i] = inputArr[endIndex];
                endIndex--;
            }
        }

        for(int i = 0; i < inputArr.length; i++) {
            System.out.print("  " + resultArr[i]);
        }
    }
}
