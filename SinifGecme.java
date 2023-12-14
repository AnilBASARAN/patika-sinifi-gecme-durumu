import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {
        int mat,fiz,turk,muz,kim;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz  :   ");
        mat = input.nextInt();

        System.out.print("Kimya notunuzu giriniz  :   ");
        kim = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz  :   ");
        turk = input.nextInt();

        System.out.print("Müzik notunuzu giriniz  :   ");
        muz = input.nextInt();

        System.out.print("Fizik notunuzu giriniz  :   ");
        fiz = input.nextInt();

        double average = (muz+fiz+kim+turk+mat)/ 5d;
        if(average< 50){
            System.out.println("Sınıfta kaldınız, Seneye yine bekleriz.");
        }else{
            System.out.println("Geçtiniz.Tebrikler!");
        }
        System.out.println("Not Ortalamanız : " +average);


    }
}
