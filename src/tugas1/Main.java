package tugas1;
import java.util.Scanner;

/**
 *
 * @Aziz Fatih Fauzi
 */
public class Main {
    public static void main(String[] args) {
        float suhu;
        int pilih;
        boolean cek = true;
        Scanner input = new Scanner(System.in);
        
        System.out.println("+===========================+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+===========================+");
        do{
            System.out.println("Input Data");
            System.out.println("----------");
            System.out.print("Suhu dalam Celcius    : ");
            suhu = input.nextFloat();
            
            do{
                System.out.println("\nOpsi");
                System.out.println("----");
                System.out.println("1. Lihat Data Konversi");
                System.out.println("2. Edit Data Konversi");
                System.out.println("3. Exit");
           
                System.out.print("Pilih : ");
                pilih = input.nextInt();

                if(pilih == 1){
                    Konversi kvs = new Konversi(suhu);
                    kvs.konversi();
                }else if(pilih == 2){
                    break;
                }else if(pilih == 3){
                    cek = false;
                    break;
                }else{
                    System.out.println("Opsi salah, silahkan coba lagi");
                }
            }while(cek);
            
        }while(cek);
        
    }
}
