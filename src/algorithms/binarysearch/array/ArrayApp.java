package algorithms.binarysearch.array;

public class  ArrayApp {
    public static void main(String[] args) {
        long[] arr = new long[10];          // Создание массива
        int nElems = 0;                     // Количество элементов
        int j;                              // Счетчик цикла
        long searchKey;                     // Ключи искомого элемента
        //--------------------------------------------------------------------
        arr[0] = 7;                         // Вставка 10 элементов
        arr[1] = 9;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 2;
        arr[5] = 8;
        arr[6] = 1;
        arr[7] = 0;
        arr[8] = 6;
        arr[9] = 3;

        nElems = 10;                        // Массив содержит 10 элементов
        //--------------------------------------------------------------------
        for(j = 0; j < nElems; j++) {       // Вывод элементов
            System.out.print(arr[j] + " ");
        }
        //--------------------------------------------------------------------
        searchKey = 6;                      // Поиск элемента с ключом 6
        for(j = 0; j < nElems; j++) {       // Для каждого элемента
            if(arr[j] == searchKey) {       // Значение найдено?
                break;                      // Да - выход из цикла
            }
        }
        if(j == nElems) {                   // Достигнут последний элемент?
            System.out.println("Can't find " + searchKey);           // Да
        }
        else {
            System.out.println("Found " + searchKey);                // Нет
        }
        //--------------------------------------------------------------------
        searchKey = 5;                      // Удаление элемента с ключом 5
        for(j = 0; j < nElems; j++) {       // Поиск удаляемого элемента
            if(arr[j] == searchKey) {
                break;
            }
        }
        for(int k = j; k < nElems - 1; k++) {   // Сдвиг последующих элементов
            arr[k] = arr[k+1];
        }
        nElems--;                           // Уменьшение размеров
        //--------------------------------------------------------------------
        for(j = 0; j < nElems; j++) {       // Вывод элементов
            System.out.print(arr[j] + " ");
        }
    }
}
