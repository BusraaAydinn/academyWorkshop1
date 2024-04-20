public class perfectNumber
{
    public static void main(String[] args)
    {
        int number = 5; // Kontrol edilecek sayı

        if (isPerfectNumber(number)) {
            System.out.println(number + " mükemmel bir sayıdır.");
        } else {
            System.out.println(number + " mükemmel bir sayı değildir.");
        }
    }

    // Bir sayının mükemmel sayı olup olmadığını kontrol eden fonksiyon
    public static boolean isPerfectNumber(int num) {
        int sum = 0;

        // Sayının bölenlerini topla
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Toplamın sayıya eşit olup olmadığını kontrol et
        return sum == num;
    }
}
