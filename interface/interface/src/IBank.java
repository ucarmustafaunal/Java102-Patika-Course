public interface IBank {
    final String hostIPAddress = "127.0.0.1";
    boolean connect(String ipAddress);
    boolean withdraw(double amount, String cardNumber, String date, String cvc);


}
