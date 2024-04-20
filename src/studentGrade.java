import java.util.Scanner;
public class studentGrade
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Öğrenci sayısını girin: ");
        int studentCount = scanner.nextInt();

        for (int i = 1; i <= studentCount; i++)
        {
            System.out.println("Öğrenci " + i + " için bilgileri girin:");

            System.out.print("Adı: ");
            String firstName = scanner.next();

            System.out.print("Soyadı: ");
            String lastName = scanner.next();

            System.out.print("1. Sınav Notu: ");
            double exam1 = scanner.nextDouble();

            System.out.print("2. Sınav Notu: ");
            double exam2 = scanner.nextDouble();

            System.out.print("3. Sınav Notu: ");
            double exam3 = scanner.nextDouble();

            // Not ortalamasını hesapla
            double average = (exam1 + exam2 + exam3) / 3;

            System.out.println("Öğrenci: " + firstName + " " + lastName);
            System.out.println("Not Ortalaması: " + average);
            System.out.println(); // Boş satır ekleyerek öğrencileri ayır
        }
        scanner.close();
    }
}
