import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyArrayList {
    private int size = 0;
    private int[] array = new int[10];

    public void add(int el) {
        array[size] = el;
        size++;

        if (size == array.length) {
            int[] newArray = new int[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }

    }

    public String toString() {
        return IntStream.range(0, size).mapToObj(x -> String.valueOf(array[x])).collect(Collectors.joining(", "));
    }

    public void remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
    }

    public int size() {
        return size;
    }

}
