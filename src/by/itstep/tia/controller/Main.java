package by.itstep.tia.controller;

import by.itstep.tia.model.logic.ArrayWorker;

// сравниваем производительность линейного и бинарного поиска
public class Main {
    public static void main(String[] args) {

        int size = 1_000_000;
        int[] array = new int[size];

        for (int i = 0; i < size ; i++) {
            array[i] = i;
        }
        ArrayWorker.checkValue(array, 2_000_000);
        ArrayWorker.binarySearch(array, 2_000_000);

        //!!! доделать вывод счетчиков!!! посмотри код препода
    }
}
