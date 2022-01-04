public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int rub = 1700;

        if (rub >= 1000) {
            float sum = rub / 100 + balance + rub;
            System.out.println(sum);
        } else {
            float sum = rub + balance;
            System.out.println(sum);
        }

    }
}
