public class Main {
    public static void main(String[] args) {
        int clientAccount = 100; //у клиента на счету
        int amount = 1100; //сумма пополнения

        int bonus;
        if (amount > 1000) {
            bonus = amount / 100;
            System.out.println("У клиента на счету стало: " + (clientAccount + bonus + amount));
        } else {
            bonus = 0;
            System.out.println("У клиента на счету стало: " + (clientAccount + bonus + amount));
        }
        System.out.println("Количество бонусных рублей: " + bonus);

    }
}
