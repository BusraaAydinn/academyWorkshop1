import java.util.Scanner;
public class totalAmount
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet ürün almak istiyorsunuz?: ");

        double productQuantity = scanner.nextDouble();

        //int productQuantity = scanner.nextInt();

        // kullanıcıdan bilgi girişini sağlayan bir diğer yöntem.

        double totalAmount= 0;

        for (int i = 1; i <= productQuantity; i++)
        {
            System.out.print(i + ". ürünün fiyatı: ");
            double price = scanner.nextDouble();
            totalAmount += price;
        }

        System.out.println("Toplam alışveriş tutarı: " + totalAmount + " TL");

        scanner.close();
    }
}
