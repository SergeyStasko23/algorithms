package algorithms.binarysearch.lowarray;

public class LowArrayApp {
    public static void main(String[] args) {
        LowArray arr = new LowArray(100);  // Создание объекта LowArray
        int nElems = 0;                         // Количество элементов в массиве
        int j;                                  // Переменная цикла
        arr.setElem(0,7);          // Вставка 10 элементов
        arr.setElem(1,9);
        arr.setElem(2,4);
        arr.setElem(3,5);
        arr.setElem(4,2);
        arr.setElem(5,8);
        arr.setElem(6,1);
        arr.setElem(7,0);
        arr.setElem(8,6);
        arr.setElem(9,3);
        nElems = 10;                            // Массив содержит 10 элементов

        for(j = 0; j < nElems; j++) {           // Вывод элементов
            System.out.print(arr.getElem(j) + " ");
        }
        System.out.println();

        int searchKey = 3;                      // Поиск элемента

        for(j = 0; j < nElems; j++) {           // Для каждого элемента
            if(arr.getElem(j) == searchKey) {   // Значение найдено?
                break;
            }
        }

        if(j == nElems) {                       // Нет
            System.out.println("Can't find " + searchKey);
        }
        else {                                  // Да
            System.out.println("Found " + searchKey);
        }

        // Удаление элемента с ключом 5
        for(j = 0; j < nElems; j++) {           // Поиск удаляемого элемента
            if(arr.getElem(j) == 5) {
                break;
            }
        }

        for(int k = j; k < nElems; k++) {       // Сдвиг последующих размеров
            arr.setElem(k, arr.getElem(k+1));
        }

        nElems--;                               // Уменьшение размера

        for(j = 0; j < nElems; j++) {           // Вывод содержимого
            System.out.print(arr.getElem(j) + " ");
        }
    }
}
