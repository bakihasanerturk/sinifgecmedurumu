import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int mat,fizik,turkce,kimya,muzik;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = input.nextInt();
        if (mat<0 || mat>100){
            mat = 0;
        }

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();

        if (fizik<0 || fizik>100){
            fizik = 0;
        }

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = input.nextInt();

        if (turkce<0 || turkce>100){
            turkce = 0;
        }

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = input.nextInt();

        if (kimya<0 || kimya>100){
            kimya = 0;
        }

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = input.nextInt();

        if (muzik<0 || muzik>100){
            muzik = 0;
        }

        average = (mat+fizik+turkce+kimya+muzik)/5;

        if (average>=55){
            System.out.println("Not Ortalamanız : " + average);
            System.out.println("Sınıfı Geçtiniz");
        }else {
            System.out.println("Not Ortalamanız : " + average);
            System.out.println("Sınıfta Kaldınız");
        }


    }
}
