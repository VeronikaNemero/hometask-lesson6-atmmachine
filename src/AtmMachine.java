public class AtmMachine {

    int banknote20;

    int banknote50;

    int banknote100;
    int countBanknote20 = 1;
    int countBanknote50 = 1;
    int countBanknote100 = 1;
    int allCash = 0;


    int amount;

    public AtmMachine(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public int addCash() {

        countBanknote20 += countBanknote20;
        countBanknote50 += countBanknote50;
        countBanknote100 += countBanknote100;

        return allCash = (banknote20 * 20) + (banknote50 * 50) + (banknote100 * 100);
    }

    public boolean withdrawal(int sum) {
        System.out.println("Вы хотите снять " + sum);

        if((allCash > sum) && (sum >= 20)) {
            if((sum >= 100) || (sum % 100 == 0)) {
                int a = sum / 100;
                System.out.println(a + " ,банкнот по 100");
                sum -= a * 100;

                if((sum < 100) || (sum % 50 == 0)) {
                    int b = sum / 50;
                    System.out.println(b + " ,банкнот по 50");
                    sum -= b * 50;

                    if((sum < 50) || (sum % 20 == 0)) {
                        int c = sum / 20;
                        System.out.println(c + " ,банкнот по 20");
                        sum -= c * 20;
                        if (sum < 20) {
                            System.out.println("Сумма на счете равна " + sum + ". Дальнейшее снятие невозможно.");
                        }
                    }
                }
            } return true;
        } else {
            System.out.println("Недостаточно средств.");
            return false;
        }
    }
}
