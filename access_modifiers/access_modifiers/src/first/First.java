package first;

public class First {
    public String str;
    //private String str;

    public First(String str){
        this.str = str;
    }

    protected void showStr(){
        System.out.println(this.str);
    }
}