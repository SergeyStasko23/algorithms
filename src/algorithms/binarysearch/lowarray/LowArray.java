package algorithms.binarysearch.lowarray;

public class LowArray {
    private long[] a;                           // Ссылка на массив а
    //-------------------------------------------------------------------
    public LowArray(int size) {                 // Конструтор
        a = new long[size];                     // Создание массива
    }
    //-------------------------------------------------------------------
    public void setElem(int index, long value) { // Запись элемента
        a[index] = value;
    }
    //-------------------------------------------------------------------
    public long getElem(int index) {            // Чтение элемента
        return a[index];
    }
}
