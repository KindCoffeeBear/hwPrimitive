public class Main {
    public static void main(String[] args) {

        int price = 25_856; // стоимости билета
        int rate = 20; // количество рублей для одной бонусной мили

        int bonus = price / rate;

        System.out.println(bonus);
    }
}
