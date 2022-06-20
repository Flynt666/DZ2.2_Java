import com.sun.source.tree.IfTree;

public class Main {
    public static void main(String[] args) {
        int s = 500; //сумма на счёте
        int p = 4300; //сумма пополнения

        if (p > 1000) {
            s = s + p + p / 100;

            System.out.println("Количество бонусов " + p / 100);
            System.out.println("Сумма на счёте = " + s);

        } else {
            s = s + p;
            System.out.println("Сумма на счёте = " + s);
            System.out.println("Бонусы не начислены");
        }


    }
}
