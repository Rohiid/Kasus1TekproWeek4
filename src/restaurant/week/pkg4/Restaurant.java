/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant.week.pkg4;

/**
 *
 * @author victu
 */
public class Restaurant {
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private int[] jumlahPesanan;
    private static byte id = 0;

    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
        jumlahPesanan = new int[10];
    }

   public void tambahMenuMakanan(String nama, double harga, int stok) {
    if (id < 10) {
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
        this.jumlahPesanan[id] = 0;
        nextId();
    } else {
        System.out.println("Maaf, data makanan sudah penuh.");
    }
}


    public void tampilMenuMakanan() {
    for (int i = 0; i < nama_makanan.length; i++) {
        if (!isOutOfStock(i)) {
            //System.out.println(nama_makanan[i] + "[" + stok[i] + "]" + "     " + "\tRp. " + harga_makanan[i] + "\tPesanan: " + jumlahPesanan[i]);
            System.out.printf("%d. %-14s[%-2d]\tRp. %,-10.2f\tPesanan: %d\n", i+1, nama_makanan[i], stok[i], harga_makanan[i], jumlahPesanan[i]);
        }
    }
}

    public boolean isOutOfStock(int id) {
        return stok[id] == 0;
    }

    public void pesanMakanan(int id, int jumlah) {
        if (stok[id] < jumlah) {
            System.out.println("Maaf, stok " + nama_makanan[id] + " tidak cukup.");
            return;
        }
        stok[id] -= jumlah;
        jumlahPesanan[id] += jumlah;
        System.out.println("Berhasil memesan " + jumlah + " " + nama_makanan[id] + ".");
    }

    public int getJumlahPesanan(int id) {
        return jumlahPesanan[id];
    }

    private void nextId() {
        id++;
    }

    public void kurangiStok(int id, int jumlah) {
        stok[id] -= jumlah;
    }
    
    public void tambahStok(int id, int jumlah) {
    stok[id] += jumlah;
    }

}






    

