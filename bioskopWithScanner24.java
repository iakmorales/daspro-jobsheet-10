import java.util.Scanner;
public class bioskopWithScanner24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int baris, kolom,pilihmenu;
        String nama,next;

        String [][] penonton = new String [4][2];
       
        while (true){
            System.out.println("--------------------------");
            System.out.println("------- PILIH MENU -------");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Daftar Penonton");
            System.out.println("3. Exit");
            System.out.println("--------------------------");
            System.out.print("Masukkan Angka (1,2,3): ");
            pilihmenu = sc.nextInt();
            sc.nextLine();

            if (pilihmenu == 1){
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();
        
                    penonton[baris-1][kolom-1] = nama;
        
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
        
                    if (next.equalsIgnoreCase("n")){
                        break;
                    }
                }
            } else if (pilihmenu == 2){
                System.out.println("---------------------");
                System.out.println("--- Data Penonton ---");
                for (int b = 0; b < penonton.length; b++){
                for (int k = 0; k < penonton[b].length; k++){
                System.out.println("Baris ke-" + (b+1) + ", Kolom ke-" + (k+1) + ": " + penonton[b][k]);
                }
              }
            } else if (pilihmenu == 3){
                System.out.println("Program Selesai!");
                break;
            } else {
                System.out.println("Masukkan angka yang valid!");
            }
        }
    }
}
