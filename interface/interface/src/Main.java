import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter withdraw amount : ");
        double amount = inp.nextDouble();
        System.out.println("Enter card number : ");
        String cardNumber = inp.nextLine();
        System.out.println("Enter expiration date : ");
        String expDate = inp.nextLine();
        System.out.println("Enter CVC : ");
        String cvc = inp.nextLine();

        System.out.println("1: A Bank");
        System.out.println("2: B Bank");
        System.out.println("3: C Bank");
        System.out.println("Select a bank to continue...");
        int bankSelection = inp.nextInt();

        switch (bankSelection){
            case 1 :
                ABank aPos = new ABank("A Bank", "123123123123", "123123");
                aPos.connect("127.1.1.1");
                aPos.withdraw(amount, cardNumber, expDate, cvc);
                break;
            case 2:
                BBank bPos = new BBank("B Bank", "321321321", "321321");
                bPos.connect("127.2.2.2");
                bPos.withdraw(amount, cardNumber, expDate, cvc);
                break;
            default:
                System.out.println("Invalid input. Please select again...");
        }
    }
}
