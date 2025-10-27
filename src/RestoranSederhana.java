import java.util.Scanner;

public class RestoranSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Ayam", "Es Teh"};
        int[] harga = {10000, 12000, 3000};

        System.out.println("MENU RESTORAN");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
        }

        System.out.print("\nMasukkan nomor menu yang ingin dipesan: ");
        int pilihan = input.nextInt();

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = input.nextInt();

        int total = harga[pilihan - 1] * jumlah;
        System.out.println("");
        System.out.println("\n=== NOTA PEMESANAN ===");

        System.out.println("Menu   : " + menu[pilihan - 1]);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Harga  : Rp" + harga[pilihan - 1]);
        System.out.println("Total Bayar : Rp" + total);
        System.out.println("-- Matur Nuwun --");
    }
}