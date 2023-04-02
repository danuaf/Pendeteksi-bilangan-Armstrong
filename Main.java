import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static Armstrong arms = new Armstrong();

    public static void main(String[] args) {
        header();
        menu(input.nextInt());
    }

    // Non-Return || Void type function tanpa parameter
    static void header(){
        System.out.println("\nPendeteksi Bilangan Armstrong" +
                "\n==============================================" +
                "\nKelompok 35" +
                "\nAnggota:" +
                "\n- Danu Aditya Firnanda - 21120122120015" +
                "\n- Arhauvantio - 211201221" +
                "\n- R.B. Ramzi Akbar A. P. D. - 211201221\n");

        System.out.println("Menu:" +
                "\n1. Apa itu bilangan Armstrong" +
                "\n2. Cek bilangan Armstrong");
        System.out.print("Pilihan: ");
    }

    // Non-Return || Void type Function dengan parameter
    static void menu(int pilihan){
        switch (pilihan){
            case 1:
                System.out.println(arms.definisi());
                break;
            case 2:
                System.out.println("\nCek bilangan Armstrong" +
                        "\n==============================================");
                System.out.print("Masukan bilangan: ");
                int bilangan = input.nextInt();

                if (arms.hitung(bilangan) ==  bilangan){
                    System.out.println(bilangan + " Adalah bilangan Armstrong");
                }else {
                    System.out.println(bilangan + " Bukan bilangan Armstrong");
                }
                break;
            default:
                break;
        }
    }
}

