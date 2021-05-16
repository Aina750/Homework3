public class TMS_3_min {
    public static void main(String[] args) {
        int n = 75;
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = Math.random();
        }
        double max = array[0];
        double min = array[0];
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            if (array [i] < array[i]) min = array[i];
            if (array[i] > array[i]) max = array[i];

            avg += array[i] / array.length;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}

