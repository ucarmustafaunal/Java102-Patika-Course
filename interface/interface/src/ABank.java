public class ABank implements IBank {
    private String bankName;
    private String terminalID;
    private String password;

    public ABank(String bankName, String terminalID, String password){
        this.bankName = bankName;
        this.terminalID = terminalID;
        this.password = password;
    }

    public String getBankName(){
        return bankName;
    }

    public void setBankName(String bankName){
        this.bankName=bankName;
    }

    public String getTerminalID(){
        return terminalID;
    }

    public void setTerminalID(String terminalID){
        this.terminalID = terminalID;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress){
        System.out.println("User IP : "+ipAddress);
        System.out.println("Server IP : "+this.hostIPAddress);
        System.out.println("Connected to "+this.bankName);
        return true;
    }

    public boolean withdraw(double amount, String cardNumber, String expDate, String cvc){
        System.out.println("Withdraw Transaction success");
        return true;
    }
}