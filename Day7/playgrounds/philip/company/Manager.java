public class Manager extends Employee{

    private int numberOfReportees;

    public Manager(int id, String ename, String email, int vacationDays, int numberOfReportees) {
        super(id, ename, email, vacationDays);
        this.numberOfReportees = numberOfReportees;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Number of Reportees : "+ this.numberOfReportees);

    }
}