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
                    while (true){
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        if (baris < 1 || baris > 4) {
                            System.out.println("Baris Tidak valid, Masukkan Baris Antara 1-4");
                           continue;
                        } 
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        if (kolom < 1 || kolom > 2){
                            System.out.println("Kolom Tidak valid, Masukkan kolom Antara 1-2");
                            continue;
                        }
    
                        if (penonton[baris-1][kolom-1] != null) {
                            System.out.println("Kursi pada baris " + baris + " dan kolom " + kolom + " sudah terisi! Silahkan pilih kursi lain.");
                        } else {
                            penonton[baris-1][kolom-1] = nama;
                            break;
                        }
                    }   
                    sc.nextLine();
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
                if (penonton[b][k] != null) {
                    System.out.println("Baris ke-" + (b+1) + ", Kolom ke-" + (k+1) + ": " + penonton[b][k]);
                } else {
                    System.out.println("Baris ke-" + (b + 1) + ", Kolom ke-" + (k + 1) + ": ***");
                }
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
