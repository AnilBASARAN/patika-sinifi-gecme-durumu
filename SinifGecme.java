import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {
        int mat,fiz,turk,muz,kim;
        Scanner input = new Scanner(System.in);

        // 0 ve 100 arasındaki değerlerin kaç tane olduğunu anlamak için her doğru değerde dersSayısı
        // degiskenini 1 arttırıyoruz. olmadığında o değeri 0 ile değiştiriyoruz ki toplama bir etkisi olmasın.

        // böylece diğelim 1 tane ders notu doğru girilmiş(fizik= 50) ama 5 not var , o zaman ortalama 50 olması
        // gerekirken 5 e bölündüğü için 10 olacak, biz bunu istemiyoruz.

        int dersSayisi = 0;
        System.out.print("Matematik notunuzu giriniz  :   ");
        mat = input.nextInt();
        if((mat>=0) && (mat<=100)){
            dersSayisi++;
        }else {
            mat = 0;
        }

        System.out.print("Kimya notunuzu giriniz  :   ");
        kim = input.nextInt();
        if((kim>=0) && (kim<=100)){
            dersSayisi++;
        }else {
            kim = 0;
        }

        System.out.print("Türkçe notunuzu giriniz  :   ");

        turk = input.nextInt();
        if((turk>=0) && (turk<=100)){
            dersSayisi ++;
        }else{
            turk = 0;
        }

        System.out.print("Müzik notunuzu giriniz  :   ");
        muz = input.nextInt();
        if(muz>=0 && muz<=100){
            dersSayisi++;
        }else {
            muz = 0;
        }

        System.out.print("Fizik notunuzu giriniz  :   ");
        fiz = input.nextInt();
        if(fiz>=0 && fiz<=100){
            dersSayisi++;
        }else{
            fiz = 0;
        }


        // dersSayısı sıfıra eşit olursa sayı bölü sıfır belirsizlik olacağından alttaki kodu önlem olarak yazdık.

        if(dersSayisi == 0){
            System.out.println("Hiçbir girilen ders notu değeri 0 ile 100 arasında değildir.");
            System.out.println("Program sonlandırıldı");
            return;
        }

        double average = (double) (muz+fiz+kim+turk+mat)/ dersSayisi;
        if(average< 50){
            System.out.println("Sınıfta kaldınız, Seneye yine bekleriz.");
        }else{
            System.out.println("Geçtiniz.Tebrikler!");
        }
        System.out.println("Not Ortalamanız : " +average);
        System.out.println("Uygun değer girilen ders sayısı : " + dersSayisi );


    }
}
