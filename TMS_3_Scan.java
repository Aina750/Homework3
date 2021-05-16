import java.util.Scanner;

public class TMS_3_Scan {
    public static void main(String[] args){
        int n=0,a=0;
        do{
            Scanner scn = new Scanner(System.in);
            System.out.println("Ошибка. Повторите!");
            if(scn.hasNextInt()) {
                n = scn.nextInt();
            }
            else System.out.println("Введите число больше n");

        }
        while (n>5);
        int[] Mas1 = new int[n];
        for(int i=0;i<Mas1.length;i++){
            Mas1[i]=(int)(Math.random()*(n+1));
            System.out.print(Mas1[i]+" ");
            if(Mas1[i]%2==0&Mas1[i]!=0)a++;
        }
        System.out.println("");
        if(a>0){
            int[] Mas2 = new int[a];
            for(int i=0,b=0;i<Mas1.length;i++){
                if (Mas1[i]%2==0&Mas1[i]!=0){
                    Mas2[b]=Mas1[i];
                    System.out.print(Mas2[b]+" ");
                }
            }
        }
    }
}
