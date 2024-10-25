import java.util.Scanner;

/**
 * NilaiSiswa
 */
public class NilaiSiswa_Naufal_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        int nilai_Ujian, total_Nilai=0, jml_siswa=0, atas_ratarata=0, bawah_ratarata=0, ratarata=0;
        double mayoritas;

        do {
            System.out.print("Masukkan nama siswa (ketik selesai untuk keluar) : ");
            nama = sc.nextLine();

            if (nama.equalsIgnoreCase("selesai")) {
                System.out.println("");
                System.out.println("-----Berikut rekapan nilai siswa-----");
                System.out.println("Jumlah siswa :  "+jml_siswa);
                System.out.println("Nilai Rata-rata siswa :  "+ratarata);
                System.out.println("Jumlas siswa diatas rata rata = "+atas_ratarata);
                System.out.println("Jumlas siswa diatas rata rata = "+bawah_ratarata);
                mayoritas = jml_siswa/0.5;
                if (atas_ratarata>mayoritas) {
                    System.out.println("Mayoritas Siswa di atas rata rata");
                }else{
                    System.out.println("Mayoritas Siswa di bawah rata rata");
                }
                break;
            }

            System.out.print("Masukkan nilai Ujian : ");
            nilai_Ujian = sc.nextInt();

            jml_siswa++;
            total_Nilai += nilai_Ujian;
            ratarata = total_Nilai/jml_siswa;

            System.out.println("Rata rata saat ini = "+ratarata);

            if(nilai_Ujian>=ratarata){
                atas_ratarata++;
            }else{
                bawah_ratarata++;
            }

            System.out.println("Jumlas siswa diatas rata rata = "+atas_ratarata);
            System.out.println("Jumlas siswa diatas rata rata = "+bawah_ratarata);

            System.out.println("");

            sc.nextLine();

        } while (true);
    }
}