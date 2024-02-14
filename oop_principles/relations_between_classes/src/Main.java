public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Mustafa", "Çetindağ", "1234", "AA", 80);
        Student st2 = new Student("Mustafa Ünal", "Uçar", "4321", "BB", 80);
        Student st3 = new Student("Patika", "Dev", "2413", "CC", 80);

        Instructor teacher = new Instructor("Ünal","Uçar", "CS");
        Instructor t2 = new Instructor("a","b","c");

        Course mat = new Course("Matematik", "MAT101", teacher);
        Student[] stu = {st1, st2, st3};

        // Course has a Instructor so we call that a Composition or Aggreation
        System.out.println(mat.getInstructor().getName());
        // =
        System.out.println(teacher.getName());
        //System.out.println("Avg is : "+mat.calcAverage(stu));
        System.out.println(t2.getDepartment());
    }
}
