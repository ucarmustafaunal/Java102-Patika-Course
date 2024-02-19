public class ABank {
    private String bankName;
    private String terminal_Id;
    private String password;

    public ABank(String bankName, String terminal_Id, String password){
        this.bankName = bankName;
        this.terminal_Id = terminal_Id;
        this.password = password;
    }

    public String getBankName(){
        return bankName;
    }

    public void setBankName(String bankName){
        this.bankName=bankName;
    }

    public String getTerminal_Id(){
        return terminal_Id;
    }

    public void setTerminal_Id(String terminal_Id){
        this.terminal_Id = terminal_Id;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}