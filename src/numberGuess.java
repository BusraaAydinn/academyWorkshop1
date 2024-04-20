import java.util.Scanner;
import java.util.Random;
public class numberGuess
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = random.nextInt(10) + 1; // 1 ile 10 arasında rastgele bir sayı seç
        int guess = 0;
        int attempts = 0;

        System.out.println("1 ile 10 arasında bir sayıyı tahmin edin.");

        while (guess != targetNumber) {
            System.out.print("Tahmininizi girin: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("Daha yüksek bir sayı girin.");
            } else if (guess > targetNumber) {
                System.out.println("Daha düşük bir sayı girin.");
            } else {
                System.out.println("Tebrikler! Doğru tahmin ettiniz.");
                System.out.println("Tahmin sayınız: " + attempts);
            }
        }
        scanner.close();
    }
}