//Fungsi untuk Exercise 2
import java.util.Scanner;//define library scan pada program
public class UserInput
{
    public static void kalkulasi()
    {
    Scanner sc = new Scanner(System.in); //untuk mengambil input dari user
    System.out.println("Masukkan angka yang diinginkan:");
    int d = sc.nextInt();//sebagai fungsi input 1
    int p = sc.nextInt();//sebagai fungsi input 2
    System.out.println("Hasil dari operasi penjumlahan antara" + d + "dan" + p + "adalah" + (d+p));
    System.out.println("Hasil dari operasi pengurangan antara" + d + "dan" + p + "adalah" + (d-p));
    System.out.println("Hasil dari operasi perkalian antara" + d + "dan" + p + "adalah" + (d*p));
    System.out.println("Hasil dari operasi pembagian antara" + d + "dan" + p + "adalah" + (d/p));
    }
}
