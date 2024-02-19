public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Mustafa Ünal Uçar","01231231123","muu@muu.com");

        Academician a1 = new Academician("Ünal Uçar","03213213322", "uu@uu.com", "Computer Science", "DM");

        Officer o1 = new Officer("Ali Veli","02323232323","av@av.com","Information Technologies", "08.00 - 17.00");

        e1.checkIn();
        e1.checkIn("10.00");
        e1.checkIn("10.00","18.00");
        a1.checkIn();
        o1.checkIn();
        System.out.println("---------------------------");
        //polymorphism
        Employee e2 = new Academician("Ünal e2","03213213322", "uu@uu.com", "Computer Science", "DM");
        e2.checkIn();

        Employee[] checkedUser = {e1,a1,o1,e2};
        Employee.checkList(checkedUser);
    }
}
