import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       // System.out.println("hello world"); //line
        // System.out.println("hello");
        //System.out.println("Merhaba ben mustafa" +
                 //" bugun sizlerle" +
                //" java ogreniyoruz");
        //System.out.println(10 + "15");
        //System.out.println(10 + 15);
        //System.out.print("merhaba\n dunya\n");
        //System.out.println("\t merhaba \ndunya");

        // birinci ders buraya kadardı

        // ders iki
        //byte abc =  127 ;
        //System.out.println("bytedegeri : " + abc);
        //short shortdegiskeni = 1000;
        //System.out.println("shortdegiskeni : " + shortdegiskeni);
        //int     intdeger = 100000;
        //System.out.println("intdegeri : " + intdeger );
        //long longdegeri = 1000000000;
        //System.out.println("longdegeri : " + longdegeri);
        //2.
          //ders
          //bitti

        //float sayi1 = 34.5F;
        //float sayi2 = 35f;
        //float sayi3 = 36f;
        //System.out.println(sayi1);
        //double ondaliklisayi1 = 3.12345;
        //ondaliklisayi1 = 54.1;
        //System.out.println(ondaliklisayi1);

          //  char karekter = 117;
          //  char karekter2 = 'u';
        //System.out.println(karekter2);
        //System.out.println(karekter);
         //boolean mantik = true;
         //boolean mantik2 = false;
        //System.out.println(mantik);
        //System.out.println(mantik2);
        ////
        //String str = "hello world";   // ilk harf büyük yazılmalı
        //String metin = hello world; şeklinde yazamayız parantez içine yazılmalı
        //System.out.println(str);
        //String metin = "hello world!";
        //System.out.println("15" + 20);
        //System.out.println(15 + 20);
        //operatörler
       // int a =10;
       //  int b =5;
       // int toplam = a+b;
       // int cikarma = a-b;
       // int carpma =a*b;
       // int bölme = a/b;
       // int mod = a%b;
       // System.out.println("toplam :" + toplam);
       // System.out.println("çıkarma :" + cikarma);
       // System.out.println("çarpma :" + carpma);
       // System.out.println("bölme :" + bölme);
       // System.out.println("mod :" + mod);
       // toplam++;
       // System.out.println(toplam);
       // cikarma--;
       // System.out.println(cikarma);
       // int sonuc = a++ + b--;
       // System.out.println(sonuc);
       // System.out.println(a);
       // System.out.println(b);

       // int sayi1 = 10;
       // int sayi2 = 5;
       // boolean koşul = (sayi1==sayi2);
       // System.out.println(koşul);
       // boolean koşul1 = (sayi1>sayi2);
       // System.out.println(koşul1);
       // boolean koşul2 = (sayi1/sayi2) == 0;
       // System.out.println(koşul2);
       // boolean koşul3 = (sayi1>sayi2);
       // boolean koşul4 = (sayi2<sayi1);
       // boolean sonuç2 = koşul3&&koşul4;
       // System.out.println(sonuç2);
       // sonuç2 = koşul3||koşul4;
       // System.out.println(sonuç2);
       // String sonuç3 = (koşul3) ? "dogru" : "yanlış";
       // System.out.println(sonuç3);
       // sayi1 = sayi2;
       // System.out.println(sayi1);
       // sayi1 +=2;
       // System.out.println(sayi1);
       // Scanner input = new Scanner(System.in);
       // int a,b;

       /* System.out.println("a sayısını giriniz:");
        a= input.nextInt();
        System.out.println("b sayısını giriniz:");
        b= input.nextInt();
        System.out.println("a sayısı :" + a);
        System.out.println("b sayısı :" + b);*/

        /* double c;
        System.out.println("c sayısını giriniz"); // sayı 12,2 şeklinde yazılır virgül konur nokta değil!
        c= input.nextDouble();
        System.out.println("c sayısı :" + c);*/

       /* String str;
        str = input.nextLine();
        System.out.println(str);
        str=input.next();
        System.out.println(str);*/

        //not ortalaması hesaplayan program yazıyorum.

       /* int Quiz,ffinal,vize;
        double ortalama;
        Scanner input = new Scanner (System.in);

        System.out.println("Quiz notunu giriniz :");
        Quiz = input.nextInt();
        System.out.println("ffinal notunu giriniz :");
        ffinal = input.nextInt();
        System.out.println("vize notunu giriniz :");
        vize = input.nextInt();

        ortalama = (Quiz*0.2) + (vize*0.35) + (ffinal*0.45);
        System.out.println("not ortalamasi :" + ortalama);
        String sonuc = (ortalama>=50) ? "gectiniz" : "kaldiniz";
        System.out.println(sonuc);*/

        //algoritma ve programlama dersinde yaptığımız uygulama

        int tekToplam = 0;
        int ciftToplam = 0;

        for (int sayac = 1; sayac <= 90; sayac++) {
            if (sayac % 2 == 0) {
                ciftToplam += sayac;
            } else {
                tekToplam += sayac;
            }
        }

        System.out.println("Tek sayıların toplamı: " + tekToplam);
        System.out.println("Çift sayıların toplamı: " + ciftToplam);


    }
}