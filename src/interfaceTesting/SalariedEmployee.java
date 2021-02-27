package interfaceTesting;

public class SalariedEmployee  extends Employee{
    private double weeklySalary;


    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);

        if (weeklySalary < 0){
            throw new IllegalArgumentException("Invalid weekly salary");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {

        if (weeklySalary < 0){
            throw new IllegalArgumentException("Weekly salary must be >= 0");
        }
        this.weeklySalary = weeklySalary;
    }

    public String toString() {
        return String.format(super.toString() + "%n%s %s's Weekly salary: %.2f", getFirstName(), getLastName(), getWeeklySalary());
    }

    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }
}
