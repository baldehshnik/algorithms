package bubble;

public class PrimitivesBubbleSort {

    public void sort(int[] array) {
        if (array == null) {
            return;
        }

        int length = array.length;
        boolean swapped;
        for (int i = 0; i < length; i++) {
            swapped = false;
            for (int j = 1; j < length - i; j++) {
                int temp = array[j - 1];
                if (temp > array[j]) {
                    array[j - 1] = array[j];
                    array[j] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    public void sort(double[] array) {
        if (array == null) {
            return;
        }

        int length = array.length;
        boolean swapped;
        for (int i = 0; i < length; i++) {
            swapped = false;
            for (int j = 1; j < length - i; j++) {
                double temp = array[j - 1];
                if (temp > array[j]) {
                    array[j - 1] = array[j];
                    array[j] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    public int[] sorted(int[] array) {
        if (array == null) {
            return null;
        }

        int[] arrayCopy = new int[array.length];
        System.arraycopy(array, 0, arrayCopy, 0, array.length);
        sort(arrayCopy);

        return arrayCopy;
    }

    public double[] sorted(double[] array) {
        if (array == null) {
            return null;
        }

        double[] arrayCopy = new double[array.length];
        System.arraycopy(array, 0, arrayCopy, 0, array.length);
        sort(arrayCopy);

        return arrayCopy;
    }
}