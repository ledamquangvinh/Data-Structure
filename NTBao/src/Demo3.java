package NTBao.src;

public class Demo3 {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 2, 0, 7, 6, 15, 0, 12, 14, 0, 0};
        MoveAllZerosEnd(arr);
    }

    public static void MoveAllZerosEnd(Integer[] inputArr) {
        Integer endIndex = inputArr.length - 1;
        for(int i = 0; i < inputArr.length; i++) {
            if(inputArr[i] == 0) {
                while(inputArr[endIndex] == 0) {
                    endIndex --;
                }
                inputArr[i] = inputArr[endIndex];
                inputArr[endIndex] = 0;
                endIndex --;
            }

            if(i == endIndex) { break; }
        }

        for(int i = 0; i < inputArr.length; i++) {
            System.out.println(inputArr[i]);
        }
    }


//        Integer temp = a;
//        a = b;
//        b = temp;

}
