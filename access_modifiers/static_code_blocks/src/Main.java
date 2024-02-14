public class Main {
    public static void main(String[] args) {
        System.out.println("1st program started...");

        User u1 = new User("Mustafa Çetindağ");
        User u2 = new User("Mustafa Ünal Uçar");
        User u3 = new User("Patika Dev");

        System.out.println("Counter's last value : "+User.counter);

        System.out.println("Program finished.");
    }
}
