import java.util.Scanner;

public class odev16 {
    public static void main(String[] args) {
        int yıl,a,b,c;

        Scanner input = new Scanner(System.in);

        System.out.print("Hangi yillarin Artik YIL oldugunu Ogrenin !!! \nYili Giriniz : ");
        yıl = input.nextInt();

        if (yıl>0){
            a=yıl%4;
            if (a==0){
               b=yıl%100;
               if (b==0){
                   c=yıl%400;
                   if (c==0){
                       System.out.println("Yil artik yildir (366 gun vardir)");
                   }else {
                       System.out.println("Yil artik yil degildir (365 gun vardir)");
                   }
               }else {
                   System.out.println("Yil artik yildir (366 gun vardir)");
               }
            }else{
                System.out.println("Yil artik yil degildir (365 gun vardir)");
            }
        }


    }
}
