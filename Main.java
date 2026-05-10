import java.util.Scanner;

public class Main {

    public static void tampilMenu(Menu[] menu) {

        System.out.println("===== MENU MAKANAN =====");

        if (menu[0].kategori.equals("Makanan")) {
            System.out.println(menu[0].nama + " - Rp " + menu[0].harga);
        }

        if (menu[1].kategori.equals("Makanan")) {
            System.out.println(menu[1].nama + " - Rp " + menu[1].harga);
        }

        if (menu[2].kategori.equals("Makanan")) {
            System.out.println(menu[2].nama + " - Rp " + menu[2].harga);
        }

        if (menu[3].kategori.equals("Makanan")) {
            System.out.println(menu[3].nama + " - Rp " + menu[3].harga);
        }

        System.out.println("\n===== MENU MINUMAN =====");

        if (menu[4].kategori.equals("Minuman")) {
            System.out.println(menu[4].nama + " - Rp " + menu[4].harga);
        }

        if (menu[5].kategori.equals("Minuman")) {
            System.out.println(menu[5].nama + " - Rp " + menu[5].harga);
        }

        if (menu[6].kategori.equals("Minuman")) {
            System.out.println(menu[6].nama + " - Rp " + menu[6].harga);
        }

        if (menu[7].kategori.equals("Minuman")) {
            System.out.println(menu[7].nama + " - Rp " + menu[7].harga);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Menu[] menu = {
                new Menu("Nasi Goreng", 25000, "Makanan"),
                new Menu("Mie Ayam", 20000, "Makanan"),
                new Menu("Ayam Geprek", 30000, "Makanan"),
                new Menu("Sate Ayam", 35000, "Makanan"),

                new Menu("Es Teh", 10000, "Minuman"),
                new Menu("Jus Jeruk", 15000, "Minuman"),
                new Menu("Kopi", 18000, "Minuman"),
                new Menu("Milkshake", 22000, "Minuman")
        };

        tampilMenu(menu);

        System.out.println("\nMaksimal pesan 4 menu");

        String[] pesanan = new String[4];
        int[] jumlah = new int[4];
        int[] subtotal = new int[4];

        System.out.print("\nPesanan 1 : ");
        pesanan[0] = input.nextLine();
        System.out.print("Jumlah : ");
        jumlah[0] = input.nextInt();
        input.nextLine();

        System.out.print("\nPesanan 2 : ");
        pesanan[1] = input.nextLine();
        System.out.print("Jumlah : ");
        jumlah[1] = input.nextInt();
        input.nextLine();

        System.out.print("\nPesanan 3 : ");
        pesanan[2] = input.nextLine();
        System.out.print("Jumlah : ");
        jumlah[2] = input.nextInt();
        input.nextLine();

        System.out.print("\nPesanan 4 : ");
        pesanan[3] = input.nextLine();
        System.out.print("Jumlah : ");
        jumlah[3] = input.nextInt();

        // HITUNG SUBTOTAL

        if (pesanan[0].equalsIgnoreCase("Nasi Goreng")) {
            subtotal[0] = 25000 * jumlah[0];
        } else if (pesanan[0].equalsIgnoreCase("Mie Ayam")) {
            subtotal[0] = 20000 * jumlah[0];
        } else if (pesanan[0].equalsIgnoreCase("Ayam Geprek")) {
            subtotal[0] = 30000 * jumlah[0];
        } else if (pesanan[0].equalsIgnoreCase("Sate Ayam")) {
            subtotal[0] = 35000 * jumlah[0];
        } else if (pesanan[0].equalsIgnoreCase("Es Teh")) {
            subtotal[0] = 10000 * jumlah[0];
        } else if (pesanan[0].equalsIgnoreCase("Jus Jeruk")) {
            subtotal[0] = 15000 * jumlah[0];
        } else if (pesanan[0].equalsIgnoreCase("Kopi")) {
            subtotal[0] = 18000 * jumlah[0];
        } else if (pesanan[0].equalsIgnoreCase("Milkshake")) {
            subtotal[0] = 22000 * jumlah[0];
        }

        // PESANAN 2

        if (pesanan[1].equalsIgnoreCase("Nasi Goreng")) {
            subtotal[1] = 25000 * jumlah[1];
        } else if (pesanan[1].equalsIgnoreCase("Mie Ayam")) {
            subtotal[1] = 20000 * jumlah[1];
        } else if (pesanan[1].equalsIgnoreCase("Ayam Geprek")) {
            subtotal[1] = 30000 * jumlah[1];
        } else if (pesanan[1].equalsIgnoreCase("Sate Ayam")) {
            subtotal[1] = 35000 * jumlah[1];
        } else if (pesanan[1].equalsIgnoreCase("Es Teh")) {
            subtotal[1] = 10000 * jumlah[1];
        } else if (pesanan[1].equalsIgnoreCase("Jus Jeruk")) {
            subtotal[1] = 15000 * jumlah[1];
        } else if (pesanan[1].equalsIgnoreCase("Kopi")) {
            subtotal[1] = 18000 * jumlah[1];
        } else if (pesanan[1].equalsIgnoreCase("Milkshake")) {
            subtotal[1] = 22000 * jumlah[1];
        }

        // PESANAN 3

        if (pesanan[2].equalsIgnoreCase("Nasi Goreng")) {
            subtotal[2] = 25000 * jumlah[2];
        } else if (pesanan[2].equalsIgnoreCase("Mie Ayam")) {
            subtotal[2] = 20000 * jumlah[2];
        } else if (pesanan[2].equalsIgnoreCase("Ayam Geprek")) {
            subtotal[2] = 30000 * jumlah[2];
        } else if (pesanan[2].equalsIgnoreCase("Sate Ayam")) {
            subtotal[2] = 35000 * jumlah[2];
        } else if (pesanan[2].equalsIgnoreCase("Es Teh")) {
            subtotal[2] = 10000 * jumlah[2];
        } else if (pesanan[2].equalsIgnoreCase("Jus Jeruk")) {
            subtotal[2] = 15000 * jumlah[2];
        } else if (pesanan[2].equalsIgnoreCase("Kopi")) {
            subtotal[2] = 18000 * jumlah[2];
        } else if (pesanan[2].equalsIgnoreCase("Milkshake")) {
            subtotal[2] = 22000 * jumlah[2];
        }

        // PESANAN 4

        if (pesanan[3].equalsIgnoreCase("Nasi Goreng")) {
            subtotal[3] = 25000 * jumlah[3];
        } else if (pesanan[3].equalsIgnoreCase("Mie Ayam")) {
            subtotal[3] = 20000 * jumlah[3];
        } else if (pesanan[3].equalsIgnoreCase("Ayam Geprek")) {
            subtotal[3] = 30000 * jumlah[3];
        } else if (pesanan[3].equalsIgnoreCase("Sate Ayam")) {
            subtotal[3] = 35000 * jumlah[3];
        } else if (pesanan[3].equalsIgnoreCase("Es Teh")) {
            subtotal[3] = 10000 * jumlah[3];
        } else if (pesanan[3].equalsIgnoreCase("Jus Jeruk")) {
            subtotal[3] = 15000 * jumlah[3];
        } else if (pesanan[3].equalsIgnoreCase("Kopi")) {
            subtotal[3] = 18000 * jumlah[3];
        } else if (pesanan[3].equalsIgnoreCase("Milkshake")) {
            subtotal[3] = 22000 * jumlah[3];
        }

        int total = subtotal[0] + subtotal[1] + subtotal[2] + subtotal[3];

        int diskon = 0;

        if (total > 100000) {
            diskon = total * 10 / 100;
        }

        int pajak = total * 10 / 100;
        int pelayanan = 20000;

        int totalAkhir = total + pajak + pelayanan - diskon;

        // BONUS BELI 1 GRATIS 1

        String bonus = "-";

        if (total > 50000) {
            bonus = "Es Teh Gratis 1";
        }

        // CETAK STRUK

        System.out.println("\n===== STRUK PEMBAYARAN =====");

        System.out.println(pesanan[0] + " x" + jumlah[0] + " = Rp " + subtotal[0]);
        System.out.println(pesanan[1] + " x" + jumlah[1] + " = Rp " + subtotal[1]);
        System.out.println(pesanan[2] + " x" + jumlah[2] + " = Rp " + subtotal[2]);
        System.out.println(pesanan[3] + " x" + jumlah[3] + " = Rp " + subtotal[3]);

        System.out.println("\nTotal = Rp " + total);
        System.out.println("Pajak 10% = Rp " + pajak);
        System.out.println("Biaya Pelayanan = Rp " + pelayanan);
        System.out.println("Diskon = Rp " + diskon);
        System.out.println("Bonus = " + bonus);

        System.out.println("\nTotal Bayar = Rp " + totalAkhir);

        System.out.println("\nTerima kasih sudah memesan.");
    }
}