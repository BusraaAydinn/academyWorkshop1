public class doWhileLoop
{
    public static void main(String[] args)
    {
        int counter = 5;

        // Do-While loop

        //Döngü koşulu döngü bloğunun en az bir kez çalışmasından sonra kontrol edilir, bu nedenle döngü bloğu en az bir kez çalıştırılır.

        do {
            System.out.println("Do-While döngüsü: Sayacın değeri: " + counter);
            counter++;
        } while (counter < 5);
        System.out.println("Do-While döngüsü sona erdi. Sayacın son değeri: " + counter);
    }

}
