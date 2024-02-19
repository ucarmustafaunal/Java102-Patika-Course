public class Employee {
    private String name;
    private String phoneNumber;
    private String email;

    public Employee(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void checkIn(){
        System.out.println(this.name+" is checked in");
    }

    public void checkIn(String enterTime){
        System.out.println(this.name+" is checked in at "+enterTime);
    }

    public void checkIn(String enterTime, String exitTime){
        System.out.println(this.name+" is checked in at "+enterTime+" and checked out at "+exitTime);
    }

    public void checkOut(){
        System.out.println(this.name+" is checked out");
    }

    public void launchCheck(){
        System.out.println(this.name+" is checked in at Cafeteria");
    }

    public static void checkList(Employee[] checkedUsers){
        for(Employee e : checkedUsers){
            e.checkIn();
        }
    }
}