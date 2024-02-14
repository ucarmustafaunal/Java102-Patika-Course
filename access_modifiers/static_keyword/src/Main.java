public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT-101", 70);
        Course fizik = new Course("Fizik", "FZK-101", 20);
        Course kimya = new Course("Kimya", "KMY-101", 100);

        Course[] dersler = {mat,fizik,kimya};

        Calculate.calcAverage(dersler);
    }
}
