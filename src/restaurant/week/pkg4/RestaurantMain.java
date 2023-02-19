/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurant.week.pkg4;

/**
 *
 * @author victu
 */
import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();

        menu.tambahMenuMakanan("Kebab", 20_000, 10);
        menu.tambahMenuMakanan("Burger", 30_000, 10);
        menu.tambahMenuMakanan("Hotdog", 18_000, 0);
        menu.tambahMenuMakanan("French Fries", 10_000, 10);
        menu.tambahMenuMakanan("Fried Chicken", 12_000, 10);
        menu.tambahMenuMakanan("Salad", 15_000, 10);
        menu.tambahMenuMakanan("Chicken Nugget", 20_000, 10);
        menu.tambahMenuMakanan("Rice Small", 5_000, 10);
        menu.tambahMenuMakanan("Rice Medium", 6_000, 10);
        menu.tambahMenuMakanan("Rice Large", 7_000, 10);
        

        Scanner scan = new Scanner(System.in);

        int pilihan, id_pesanan, jumlah_pesanan, jumlah_tambah;

        do {
            System.out.println("\n\n=== Selamat Datang di Sandchik Restaurant ===\n");
            menu.tampilMenuMakanan();

            System.out.println("\n1. Pesan Makanan");
            System.out.println("2. Tambah Stock");
            System.out.println("0. Keluar");
            System.out.print("\nMasukkan pilihan Anda: ");
            pilihan = scan.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan ID pesanan: ");
                    id_pesanan = scan.nextInt();

                    System.out.print("Masukkan jumlah pesanan: ");
                    jumlah_pesanan = scan.nextInt();

                    if (menu.isOutOfStock(id_pesanan)) {
                        System.out.println("Maaf, makanan tersebut sedang tidak tersedia");
                    } else {
                        menu.pesanMakanan(id_pesanan, jumlah_pesanan);
                    }

                    break;

                case 2:
                    System.out.print("\nMasukkan ID makanan yang ingin ditambahkan stock-nya: ");
                    id_pesanan = scan.nextInt();

                    System.out.print("Masukkan jumlah stock yang ingin ditambahkan: ");
                    jumlah_tambah = scan.nextInt();

                    menu.tambahStok(id_pesanan, jumlah_tambah);

                    break;

                case 0:
                    System.out.println("\n\n=== Terima Kasih Telah Berkunjung ===");
                    break;

                default:
                    System.out.println("\nMaaf, pilihan tidak tersedia");
            }
        } while (pilihan != 0);

        scan.close();
    }
}









