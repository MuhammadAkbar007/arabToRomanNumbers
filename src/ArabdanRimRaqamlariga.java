import java.util.Scanner;

public class ArabdanRimRaqamlariga {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Arab raqamini kiriting: ");
            Scanner sc = new Scanner(System.in);
            int son = sc.nextInt();
            if (son <= 0 ) {
                System.out.println("Rim raqamlarida faqat musbat (0 ham yo'q) sonlar mavjud !");
            } else if (son >= 4000) {
                System.out.println("Rim raqamlarida 3999 dan keyingi sonlar yo'q !");
            } else {
                System.out.println(RomeNumbers(son));
            }
        }

    }

    public static String RomeNumbers(int son) {
        String[] birliklar = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] onliklar = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};//L->50; C->100
        String[] yuzliklar = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};//D->500; M->1000
        String[] mingliklar = {"", "M", "MM", "MMM"};// 4000 dan keyingi sonlarga () ishlat
            return mingliklar[son / 1000] + yuzliklar[son % 1000 / 100] + onliklar[son % 100 / 10] + birliklar[son % 10];
    }
}
