public class Course {
    String name;
    String code;
    String notes;
    int note;

    public Course(String name, String code, int note) {
        this.name = name;
        this.code = code;
        this.note = note;
    }

    public static void courseList() {
        String[] courseList = {"fizik", "kimya", "matematik"};
        for (String courseName : courseList) {
            System.out.println(courseName);
        }
    }

    public static void main(String[] args) {
        Course c1 = new Course("Mat-101" , "MAT" , 0);
        Course.courseList();
    }
}