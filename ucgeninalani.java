import java.math.MathContext;
import java.util.Scanner;

public class ucgeninalani {
    public static void main(String[] args){

        //Kenarları verilen üçgenin alanını hesaplama

        int a, b, c;
        double u, alan;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Kenarı Giriniz :");
        a = input.nextInt();
        System.out.print("İkinci Kenarı Giriniz :");
        b = input.nextInt();
        System.out.print("Üçüncü Kenarı Giriniz :");
        c = input.nextInt();

        u = (a + b + c) / 2;

        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Alanı : " + alan);
    }
}
