package NTBao.src;

public class Demo2 {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 2, 7, 6, 15, 12, 14, 13};

        SecondLargest(arr);
    }

    public static void SecondLargest(Integer[] inputArr) {
        Integer second = 0;
        Integer biggest = 0;

        for(int i  = 0; i < inputArr.length; i++) {
            if(inputArr[i] > second) {
                if(inputArr[i] < biggest) {
                    second = inputArr[i];
                } else {
                    second = biggest;
                    biggest = inputArr[i];
                }
            }
        }

        System.out.println("second " + second);
    }
}
