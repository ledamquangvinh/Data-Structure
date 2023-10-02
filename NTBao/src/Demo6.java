package NTBao.src;

public class Demo6 {
    public static void main(String[] args) {
        Integer[] arr = {5, 10, -5, 15};
        KthSumContiguousSubarray(arr, 2);
    }

    public static void KthSumContiguousSubarray(Integer[] inputArr, Integer kPos) {
        Integer[] result = new Integer[(inputArr.length * (inputArr.length + 1)) / 2];
        Integer  resultIndex = 0;
        Integer maxIndex = inputArr.length - 1;

        for(int i = 0; i < inputArr.length; i++) {
            for(int j = 0; j <= maxIndex; j++) {
                Integer sum = 0;
                for(int z = 0; z <= j; z++) {
                    sum = sum + inputArr[i + z];
                }

                result[resultIndex] = sum;
                resultIndex++;
            }
            maxIndex--;
        }

        System.out.println(result[kPos - 1]);
    }
}
