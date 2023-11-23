public class Main {
    public static void main(String[] args) {
        AtmMachine atmMachine = new AtmMachine(4, 2, 7);
        System.out.println(atmMachine.addCash());
        System.out.println(atmMachine.withdrawal(480));
    }
}