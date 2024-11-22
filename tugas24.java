import java.util.Scanner;
public class tugas24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int [][] pertanyaan = new int [10][6];
 
        System.out.println("---------------------------------");
        System.out.println("--- Survei Kepuasan Pelanggan ---");
        System.out.println("---------------------------------");
        System.out.println("1 Sangat Tidak Puas ");
        System.out.println("2 Tidak Puas ");
        System.out.println("3 Netral ");
        System.out.println("4 Puas ");
        System.out.println("5 Sangat Puas");
        System.out.println("---------------------------------");

        //hasil survey (a)
        for(int b = 0; b < pertanyaan.length; b++){
            System.out.println("Responden ke-" + (b + 1));
            for (int k =0; k < pertanyaan[b].length; k++){
                System.out.print("Pertanyaan ke-" + (k+1) + ": ");
                pertanyaan[b][k] = sc.nextInt();
            }
        }

        //rata-rata tiap responden (b)
        double [] rataRataResponden = new double [pertanyaan.length];
        System.out.println("\n----- Rata-Rata Tiap Responden -----");
        for (int b = 0; b < pertanyaan.length; b++){
            double totalnilairesponden = 0;
            for (int k = 0; k < pertanyaan[b].length; k++){
                totalnilairesponden += pertanyaan[b][k];
            }
            rataRataResponden[b] = totalnilairesponden/6;
            System.out.println("Rata-rata responden ke-" + (b+1) + ": " + rataRataResponden[b]);
        }

        //rata rata tiap pertanyaan (c)
        System.out.println("\n----- Rata-Rata Tiap Pertanyaan -----");
        for (int k = 0; k < pertanyaan[0].length; k++) {
            double totalNilaiPertanyaan = 0;
            for (int b = 0; b < pertanyaan.length; b++) {
                totalNilaiPertanyaan += pertanyaan[b][k];
            }
            double rataRataPertanyaan = totalNilaiPertanyaan / pertanyaan.length; 
            System.out.println("Rata-rata pertanyaan ke-" + (k + 1) + ": " + rataRataPertanyaan);
        }

        //rata rata keseluruhan (d)
        System.out.println("\n----- Rata-Rata Keseluruhan -----");
        double totalKeseluruhan = 0;
        for (int b = 0; b < pertanyaan.length; b++) {
            for (int k = 0; k < pertanyaan[b].length; k++) {
                totalKeseluruhan += pertanyaan[b][k];
            }
        }
        double rataRataKeseluruhan = totalKeseluruhan / (pertanyaan.length * pertanyaan[0].length);
        System.out.println("Rata-rata keseluruhan: " + rataRataKeseluruhan);
       
    }
}
