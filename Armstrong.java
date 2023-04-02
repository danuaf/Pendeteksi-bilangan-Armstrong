public class Armstrong{
    //Return || Non-Void type function tanpa parameter
    public String definisi(){
        return "\nApa itu bilangan Armstrong?" +
                "\n==============================================" +
                "\nBilangan Armstrong adalah bilangan yang jika tiap angkanya" +
                "\ndipangkatkan dengan jumlah angka pada bilangan tersebut lalu hasil" +
                "\npemangkatan pada setiap angka dijumlahkan maka sama dengan bilangan tersebut" +
                "\nContoh: 153" +
                "\nBanyaknya angka = 3" +
                "\n1^3 = 1" +
                "\n5^3 = 125" +
                "\n3^3 = 27" +
                "\ntotal = 153" +
                "\nJadi Bilangan tersebut adalah bilangan Armstrong karna" +
                "\n153 == 1^3 + 5^3 + 3^3 = 153\n";
    }

    //Return || Non-Void type function dengan parameter
    public int hitung(int bilangan) {
        int total = 0,
                jumlahAngka = String.valueOf(bilangan).length(),
                digit;

        for (int i = 0; i < jumlahAngka; i++) {
            digit = bilangan % 10;
            total += Math.pow(digit, jumlahAngka);
            bilangan /= 10;
        }

        return total;
    }
}
