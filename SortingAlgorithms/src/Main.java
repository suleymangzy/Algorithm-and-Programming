
public class Main {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    /////////////////////////////////////////////////////////// Comb Sort ///////////
    public static int determineGap(int gap) {
        gap = (gap * 10) / 13;
        if (gap < 1) {
            return 1;
        }
        return gap;
    }

    public static int[] combSort(int[] array) {
        int gap = determineGap(array.length);
        while (gap > 1) {
            for (int i = 0; i < array.length - gap; i++) {
                if (array[i] > array[i + gap]) {
                    int tmp = array[i];
                    array[i] = array[i + gap];
                    array[i + gap] = tmp;
                }
            }
            gap = determineGap(gap);
        }
        return array;
    }
    //////////////////////////////////////////////////////////////////////////////////

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        return array;
    }

    public static void main(String[] args) {

        int[] array = {2, 5, 4, 1, 3};

        System.out.print("Selection Sort: ");
        int[] sorted1 = selectionSort(array.clone());
        printArray(sorted1);

        System.out.print("Bubble Sort: ");
        int[] sorted2 = bubbleSort(array.clone());
        printArray(sorted2);

        System.out.print("Comb Sort: ");
        int[] sorted3 = combSort(array.clone());
        printArray(sorted3);

        System.out.print("Insertion Sort: ");
        int[] sorted4 = insertionSort(array.clone());
        printArray(sorted4);
    }
}