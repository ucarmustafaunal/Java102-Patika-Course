public class Officer extends Employee{
    private String department;
    private String workHours;

    public Officer(String name, String phoneNumber, String email, String department, String workHours) {
        super(name, phoneNumber, email);
        this.department = department;
        this.workHours = workHours;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getWorkHours() {
        return workHours;
    }

    public void setWorkHours(String workHours) {
        this.workHours = workHours;
    }

    @Override
    public void checkIn(){
        System.out.println(this.getName()+" is checked in at C Gate");
    }
}
