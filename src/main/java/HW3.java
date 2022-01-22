import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {

        int len = 7;
        int initialValue = 998;
        int [] arrBalance = {2, 2, 2, 1, 2, 2, 10, 1};
        int [] arrRotate = {1, 2, 3, 4, 5, 6, 7};
        int index = 2;  // колличество элементов для сдвига

        changeValues();
        makeNewArray();
        multiplicateValues();
        makeDoubleArray();
        //getArray(len, initialValue);
        System.out.println("New array with len and initialValue:\n" + Arrays.toString(getArray(len, initialValue)));
        findMinMaxValues();
        System.out.println(checkBalance(arrBalance)? "Array could be balanced" : " Array couldnt be balances");
        rotateArray(arrRotate, index);


    }

    private static void rotateArray(int arrRotate[], int index) {
        int temp = 0;
        int size = arrRotate.length;
        int size2 = arrRotate.length;
        int ind = index;

        for (int i = 0; i < arrRotate.length / 2 ; i ++){   // зеркальный разворот массива,
            temp = arrRotate[i];                            // arrRotate.length/2 - что бы не
            arrRotate[i] = arrRotate[size-1];               // развернуло повторно
            arrRotate[size-1] = temp;
            size --;
        }
        // System.out.println(Arrays.toString(arrRotate));

        for ( int i = 0; i < (index - 1) ; i ++){           // разворот первых N элементов массива
            temp = arrRotate[i];
            arrRotate[i] = arrRotate[index-1];
            arrRotate[index-1] = temp;
            index --;
        }

        //System.out.println(Arrays.toString(arrRotate));
        for ( int i = ind; i < (size2 ); i ++){         // разворот оставшейся части массива
            temp = arrRotate[i];
            arrRotate[i] = arrRotate[size2-1];
            arrRotate[size2-1] = temp;
            size2 --;
        }
        System.out.println(Arrays.toString(arrRotate));


    }

    private static boolean checkBalance(int arrBalance[]) {
        int leftSide = 0;
        int rightSide = 0;
        for (int i = 0; i < arrBalance.length; i++){
            rightSide += arrBalance[i];
        }
        for (int i = 0; i < arrBalance.length; i++){
            if (rightSide == leftSide){
                break;
            } else {
                leftSide += arrBalance[i];
                rightSide -= arrBalance[i];
            }
        }
        return (leftSide == rightSide);
    }

    private static void findMinMaxValues() {
        int [] arr = {3, 5 ,13, 8 ,2 ,16, 48, 3, 78, 46, 8 ,10 ,206};
        int minValue = arr[0];
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] <= minValue ){
                minValue = arr[i];
            }
            if (arr[i] >= maxValue){
                maxValue = arr[i];
            }
        }
        System.out.println("Min value: " + minValue + " Max value:" + maxValue);
    }

    private static int [] getArray(int len, int initialValue) {
        int[] arr = new int [len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }

    private static void makeDoubleArray() {
        int size = 10;
        int arr [][] = new int [size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if (i == j || j + i == size - 1) {
                    arr[i][j]=1;
                }
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    private static void multiplicateValues() {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("\nOld array:\n" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println("New array:\n" + Arrays.toString(arr));
    }

    private static void makeNewArray() {
        int [] arr = new int [100];
        System.out.print("\nNew Array: ");
        for ( int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
    }

    private static void changeValues() {
        int [] arr = {1, 0, 0, 0, 1, 0, 1, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] == 1 ) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
