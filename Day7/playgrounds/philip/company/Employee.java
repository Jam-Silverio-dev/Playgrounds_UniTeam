public class Employee {
    private int id;
    private String ename;
    private String email;
    private int vacationDays;

//    This is the constructor, highlight objects, right click then generate constructors
//    this is when you store the private objects into local variable
    public Employee(int id, String ename, String email, int vacationDays) {
        this.id = id;
        this.ename = ename;
        this.email = email;
        this.vacationDays = vacationDays;
    }

    public void printDetails() {
        System.out.println("ID : "+ id);
        System.out.println("Name : "+ ename);
        System.out.println("Email : "+ email);
        System.out.println("Vacation Days : "+ vacationDays);

    }
/*
       OR YOU CAN DO THIS


    This is the constructor, highlight objects, right click then generate constructors
    this is when you store the private objects into local variable
    public Employee(int id, String ename, String email, int vacationDays) {
        this.id = id;
        this.ename = ename;
        this.email = email;
        this.vacationDays = vacationDays;
    }



    public void printDetails() {
        System.out.println("ID : "+ this.id);
        System.out.println("Name : "+ this.ename);
        System.out.println("Email : "+ this.email);
        System.out.println("Vacation Days : "+ this.vacationDays);

    }
*/
}
