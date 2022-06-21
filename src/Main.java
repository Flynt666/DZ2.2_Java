import com.sun.source.tree.IfTree;

public class Main {
    public static void main(String[] args) {
        int amount = 500; //сумма на счёте
        int add = 4300; //сумма пополнения

        if (add > 1000) {
            amount = amount + add + add / 100;

            System.out.println("Количество бонусов " + add / 100);
            System.out.println("Сумма на счёте = " + amount);

        } else {
            amount = amount + add;
            System.out.println("Сумма на счёте = " + amount);
            System.out.println("Бонусы не начислены");
        }


    }
}
