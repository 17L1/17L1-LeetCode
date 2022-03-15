package AutumnTest.baidu;

/**
 * @author: 17L1
 * @date: 2021年08月11日 7:36 下午
 * @method：
 */
public class Main {
    public static int[] sortArray(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int index = partrition(array, low, high);
            quickSort(array, low, index - 1);
            quickSort(array, index + 1, high);
        }
    }

    private static int partrition(int[] array, int low, int high) {

        int pivot = array[low];
        int start = low;
        while ( low < high) {
            while ( low < high && array[high] >= pivot) {
                high--;
            }
            while ( low < high && array[low] <= pivot) {
                low++;
            }
            if (low >= high) {
                break;
            }
            swap(array, low, high);
        }
        swap(array, start, low);
        return low;
    }

    private static void swap(int[] array, int low, int high) {
        int temp = array[low];
        array[low] = array[high];
        array[high] = temp;
    }

    public static void main(String[] args) {
        int[] array = {3,33,1,1,44,2,2};
        array = sortArray(array);
        for (int v : array){
            System.out.println(v);
        }
    }
}
