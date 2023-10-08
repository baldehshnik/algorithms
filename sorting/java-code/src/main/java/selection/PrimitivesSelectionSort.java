package selection;

public class PrimitivesSelectionSort {

    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minValue = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minId = j;
                }
            }

            array[minId] = array[i];
            array[i] = minValue;
        }
    }

    public void sort(double[] array) {
        for (int i = 0; i < array.length; i++) {
            double minValue = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minId = j;
                }
            }

            array[minId] = array[i];
            array[i] = minValue;
        }
    }

    public int[] sorted(int[] array) {
        int[] newArray = new int[array.length];
        System.arraycopy(array, 0, newArray, 0, newArray.length);
        sort(newArray);

        return newArray;
    }

    public double[] sorted(double[] array) {
        double[] newArray = new double[array.length];
        System.arraycopy(array, 0, newArray, 0, newArray.length);
        sort(newArray);

        return newArray;
    }
}