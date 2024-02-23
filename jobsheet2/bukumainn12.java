package jobsheet2;

public class bukumainn12 {
    public static void main(String[] args) {
        buku12 bk1 = new buku12();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;
        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        buku12 bk2 = new buku12("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
    }
}

class buku12 {
    String judul;
    String pengarang;
    int halaman;
    int stok;
    int harga;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Halaman: " + halaman);
        System.out.println("Stok: " + stok);
        System.out.println("Harga: " + harga);
    }

    void terjual(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
            System.out.println(jumlah + " buku terjual.");
        } else {
            System.out.println("Stok tidak mencukupi untuk penjualan.");
        }
    }

    void gantiHarga(int hrg) {
        harga = hrg;
        System.out.println("Harga buku diubah menjadi: " + hrg);
    }

    public buku12() {}

    public buku12(String jud, String pg, int hal, int stk, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        stok = stk;
        harga = har;
    }
}
