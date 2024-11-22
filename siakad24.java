import java.util.Scanner;
public class siakad24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int JumlahMhs = sc.nextInt();
        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        int JumlahMatkul = sc.nextInt();

        int [][] nilai = new int[JumlahMhs][JumlahMatkul];

        //langkah 6
        // for (int i = 0; i < nilai.length; i++){
        //     System.out.println("Input nilai mahasiswa ke-" + (i +1));
        //     for (int j = 0; j < nilai[i].length; j++){
        //         System.out.print("Nilai mata kuliah " + (j+1) + ": ");
        //         nilai [i][j] = sc.nextInt();
        //     }
        // }

        //langkah 7
        for (int i = 0; i < nilai.length; i++){
            System.out.println("Input nilai mahasiswa ke-" + (i +1));
            double totalPerSiswa = 0;
            for (int j = 0; j < nilai[i].length; j++){
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai [i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPerSiswa/JumlahMatkul);
        }

        //langkah 8
        System.out.println("\n=============================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah: ");

        for (int j = 0; j < JumlahMatkul; j++){
            double totalPerMatkul = 0;
            for (int i = 0; i < JumlahMhs; i++){
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j+1) + ": " + totalPerMatkul/JumlahMhs);
        }
    }
}
