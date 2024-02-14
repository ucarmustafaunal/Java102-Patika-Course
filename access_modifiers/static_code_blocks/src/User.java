public class User {
    public String name;
    public static int counter = 0;

    static {
        System.out.println("2nd program started...");
        int random = (int) (Math.random() * 10);
        System.out.println("3rd Random Number : "+random);
        counter = random;
        System.out.println("4th Default Counter val : "+counter);
    }


    public User(String name){
        this.name = name ;
        counter++;
        System.out.println("Counter new val : "+counter);
    }
}
