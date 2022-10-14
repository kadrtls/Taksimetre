import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km;
        double total=0,startPrice=13.50,per100m=0.35;
        Scanner scanner=new Scanner(System.in);
        System.out.println("yolculık kaç km sürdü ");
        km= scanner.nextDouble();

        total=km*100*per100m;
        total +=startPrice;
        System.out.println("borcunuz" + total);
    }
}