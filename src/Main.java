
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner inp=new Scanner(System.in);

        System.out.print("Üssünün hesaplanmasını istediğiniz değeri giriniz: ");
        int n= inp.nextInt();
        System.out.print("Üst değerini giriniz: ");
        int k= inp.nextInt();

        int toplam=1;

        for(int i=1;i<=k;i++){
        toplam *=n;

        }
        System.out.println("Sonuç:"+toplam);


       /*
        int toplam=1;
        int i=1;
        while (i<=k){
            toplam=toplam*n;
            i++;
        }
        System.out.print("Cevap:"+toplam);

        */
    }
}