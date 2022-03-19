import java.util.Scanner;


public class hipotenus {
    public static void main(String[] args) {

        int a,b;
        double c;
        double u, alan;
        Scanner inp= new Scanner(System.in);

        System.out.print("Birinci Kenar :");
        a= inp.nextInt();
        System.out.print("İkinici Kenar :");
        b= inp.nextInt();

        c= Math.sqrt((a*a) + (b*b));
        System.out.println(c);

        u= (a+b+c)/2;
        System.out.println(u);

        alan=u*(u-a)*(u-b)*(u-c);
        System.out.println(alan);










    }
}
