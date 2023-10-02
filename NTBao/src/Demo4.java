package NTBao.src;

public class Demo4 {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 2, 0, 7, 6, 15, 0, 12, 14, 0, 0};
        EvenBiggerThanOdd(arr);
    }

    public static void EvenBiggerThanOdd(Integer[] inputArr) {
        for(int i = 0; i < inputArr.length; i++) {
            for(int j = i; j < inputArr.length; j++) {
                if(inputArr[j] > inputArr[i]) {
                    Integer temp = inputArr[i];
                    inputArr[i] = inputArr[j];
                    inputArr[j] = temp;
                }
            }
        }

        Integer[] sortedArr = new Integer[inputArr.length];
        System.arraycopy(inputArr, 0, sortedArr, 0, inputArr.length);
        Integer sortedIndex = 0;
        Integer sortedEndIndex = inputArr.length - 1;

        for(int i = 0; i < inputArr.length; i++) {
            System.out.print("  " + inputArr[i]);
        }
        System.out.println("");

        for(int i = 0; i < inputArr.length; i++) {
            if(i % 2 == 0) {
                // even
                inputArr[i] = sortedArr[sortedIndex];
                sortedIndex ++;
            } else {
                // odd
                inputArr[i] = sortedArr[sortedEndIndex];
                sortedEndIndex --;
            }

            if(sortedIndex == sortedEndIndex) {
                break;
            }
        }

        for(int i = 0; i < inputArr.length; i++) {
            System.out.print("  " + inputArr[i]);
        }
        System.out.println("");
    }
}
