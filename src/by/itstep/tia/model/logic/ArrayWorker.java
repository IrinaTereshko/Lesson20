package by.itstep.tia.model.logic;

public class ArrayWorker {

    // алгоритм Линейного поиска элемента
    // 1)check true/false - есть элемент в массиве или нет
    //2)first index/last index -->index or -1
    // 3)count n or 0

    // 1st method
//    public static boolean CheckValue(int[] array, int value) {
//
//        boolean result = false;
//
//        for (int item : array
//        ) {
//            if (item == value) {
//                result = true;
//                break;
//            }
//        }
//        return result;
//    }
// 2nd method
    public static boolean checkValue(int[] array, int value) {



        for (int item : array
        ) {
            if (item == value) {
                return true;
            }
        }
        return false;
    }

    public static int findLastIndexValue(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }

        }
        return -1;
    }


    public static int countValue(int[] array, int value) {
        int count = 0;
        for (int element : array
        ) {
            if (element == value) {
                count++;
            }

        }
        return count;
    }

    // Бинарный поиск
    // Используется только на упорядоченной последовательности!!!
    public static boolean binarySearch(int[] array, int value) {

        int rightBoard = array.length - 1;
        int leftBoard = 0;


        while (leftBoard <= rightBoard) {

            int mid = (leftBoard + rightBoard) / 2;

            if (value == array[mid]) {
                return true;
            } else {
                if (array[mid] < value) {
                    leftBoard = mid + 1;
                } else {rightBoard = mid -1;}
            }
        }

        return false;
    }
}

