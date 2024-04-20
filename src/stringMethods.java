public class stringMethods
{
    public static void main(String[] args)
    {
        //charAt(int index): Belirtilen dizindeki karakteri döndürür.

        String str1 = "Hello";
        char ch = str1.charAt(2);
        System.out.println(ch); // 'L' karakterini alır

        //length(): String'in uzunluğunu döndürür.

        String str2 = "Hello";
        int length = str2.length();
        System.out.println(length); // 5 döndürür

        //toUpperCase(): String'in tamamını büyük harflere dönüştürür.

        String str3 = "hello";
        String upperCaseStr = str3.toUpperCase();
        System.out.println(upperCaseStr); // "HELLO" döndürür

        //toLowerCase(): String'in tamamını küçük harflere dönüştürür.

        String str4 = "HELLO";
        String lowerCaseStr = str4.toLowerCase();
        System.out.println(lowerCaseStr); // "hello" döndürür

        //substring(int beginIndex): Belirtilen başlangıç dizininden sona kadar olan alt dizesini döndürür.

        String str5 = "Hello World";
        String subStr = str5.substring(6);
        System.out.println(subStr); // "World" döndürür

        //substring(int beginIndex, int endIndex): Belirtilen başlangıç ve bitiş dizinleri arasındaki alt dizesini döndürür.

        String str6 = "Hello World";
        String subStr2 = str6.substring(0, 7);
        System.out.println(subStr2); // "Hello" döndürür

        //indexOf(String str): Belirtilen alt dizenin ilk bulunduğu dizini döndürür.

        String str7 = "Hello World";
        int index = str7.indexOf("o");
        System.out.println(index); // 4 döndürür (ilk "o" harfinin indeksi)

        //replace(char oldChar, char newChar): Belirtilen eski karakterleri yeni karakterlerle değiştirir.
        String str8= "Hello World";
        String newStr = str8.replace('o', '0'); // "Hell0 W0rld" döndürür
        System.out.println(newStr);

        //equals(Object obj): Bu metot, iki String'in eşit olup olmadığını kontrol eder. Büyük-küçük harfe duyarlıdır.

        String str9 = "hello";
        String str10 = "Hello";
        boolean isEqual = str9.equals(str10); // false döndürür
        System.out.println(isEqual);

        //equalsIgnoreCase(String anotherString): Bu metot, iki String'in eşit olup olmadığını kontrol eder. Büyük-küçük harfe duyarsızdır.

        String str11 = "hello";
        String str12 = "Hello";
        boolean isEqual2 = str11.equalsIgnoreCase(str12);
        System.out.println(isEqual2);// true döndürür

        //startsWith(String prefix): Bu metot, bir String'in belirtilen bir önek ile başlayıp başlamadığını kontrol eder.

        String str = "Hello World";
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println(startsWithHello); // true döndürür

        //endsWith(String suffix): Bu metot, bir String'in belirtilen bir sonek ile bitip bitmediğini kontrol eder.

        String str13 = "Hello World";
        boolean endsWithWorld = str.endsWith("World");
        System.out.println(endsWithWorld);// true döndürür

        //trim(): Bu metot, bir String'in başındaki ve sonundaki boşlukları kaldırır.

        String str14 = "   Hello   ";
        String trimmedStr = str14.trim();
        System.out.println(trimmedStr);// "Hello" döndürür

        //contains(CharSequence s): Bu metot, bir String'in belirli bir karakter dizisi içerip içermediğini kontrol eder.

        String str15 = "Hello World";
        boolean notcontainsHello = str15.contains("Hi");
        System.out.println(notcontainsHello); // false döndürür
    }
}
