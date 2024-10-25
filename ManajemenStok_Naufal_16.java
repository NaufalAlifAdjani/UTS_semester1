import java.util.Scanner;

public class ManajemenStok_Naufal_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama_barang;
        int jml_stok, harga_barang, total_NilaiStok, jml_permintaan;

        do {
            System.out.print("Masukkan nama barang (ketik selesai untuk keluar) : ");
            nama_barang = sc.nextLine();

            if (nama_barang.equalsIgnoreCase("selesai")) {
                System.out.println("");
                System.out.println("-----Program selesai-----");
                break;
            }

            System.out.print("Berapa jumlah stok yang ada? : ");
            jml_stok = sc.nextInt();
            System.out.print("Harga barang : ");
            harga_barang = sc.nextInt();

            total_NilaiStok=jml_stok*harga_barang;

            System.out.println("Total nilai stok barang = Rp "+total_NilaiStok);
            System.out.println("");
            
            System.out.print("Masukkan jumlah permintaan barang : ");
            jml_permintaan= sc.nextInt();

            if (jml_permintaan<=jml_stok) {
                jml_stok -= jml_permintaan;
                System.out.println("Permintaan dapat dipenuhi");
                System.out.println("Stok saat ini : "+jml_stok);
            }else{
                System.out.println("Stok tidak terpenuhi");
                System.out.println("Stok saat ini : "+jml_stok);
            }
            System.out.println("");
            sc.nextLine();
        } while (true);
    }
}
