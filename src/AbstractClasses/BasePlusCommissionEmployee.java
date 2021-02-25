package AbstractClasses;

public class BasePlusCommissionEmployee extends CommissionEmployee{

    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, commissionRate, grossSales);

        if (baseSalary <= 0){
            throw new IllegalArgumentException("Base salary cannot be less than or equal to zero");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return ((getCommissionRate() * getGrossSales()) + baseSalary);
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(){
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                "baseSalary=" + baseSalary +
                '}';
    }
}
