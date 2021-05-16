public class TMS_3_TwoMass {
    public static void main(String[] args) {
        double sumMassive1 = 0, sumMassive2 = 0;
        int[] Massive1 = new int[5];
        for (int i = 0; i < Massive1.length; i++) {
            Massive1[i] = (int) (Math.random() * 6);
            System.out.println(Massive1[i] + "");
            sumMassive1 += (double) Massive1[i] / Massive1.length;
            System.out.println(" ");

        }
        int[] Massive2 = new int[5];
        for (int i = 0; i < Massive2.length; i++) {
            Massive2[i] = (int) (Math.random() * 6);
            System.out.println(Massive2[i] + "");
            sumMassive2 += (double) Massive2[i] / Massive2.length;
            System.out.println(" ");
        }

        if (sumMassive1 == sumMassive2) System.out.println("Средние арифметич. равны");
        else {
            if (sumMassive1 > sumMassive2)
                System.out.println("Среднее арифметич. значение первого больше и равно ");
            else System.out.println("Среднее арифметич. значение второго больше и равно ");
        }

    }
}
