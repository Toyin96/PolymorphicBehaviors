//package AbstractClasses;
//
//public class CommissionEmployee extends Employee{
//
//    private double commissionRate;
//    private double grossSales;
//
//
//    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales) {
//        super(firstName, lastName, socialSecurityNumber);
//
//        if (grossSales <= 0.0 || commissionRate <= 0.0){
//            throw new IllegalArgumentException("Invalid gross Sales/commission rate entered");
//        }
//        this.grossSales = grossSales;
//        this.commissionRate = commissionRate;
//    }
//
//    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales, int day, int month, int year) {
//        super(firstName, lastName, socialSecurityNumber, day, month, year);
//        this.commissionRate = commissionRate;
//        this.grossSales = grossSales;
//    }
//
//    public CommissionEmployee(){}
//
//    public double getCommissionRate() {
//        return commissionRate;
//    }
//
//    public void setCommissionRate(double commissionRate) {
//        this.commissionRate = commissionRate;
//    }
//
//    public double getGrossSales() {
//        return grossSales;
//    }
//
//    public void setGrossSales(double grossSales) {
//        this.grossSales = grossSales;
//    }
//
//    @Override
//    public double salary() {
//        return commissionRate * grossSales;
//    }
//
//    @Override
//    public String toString() {
//        return "CommissionEmployee{" +
//                "commissionRate=" + commissionRate +
//                ", grossSales=" + grossSales +
//                '}';
//    }
//}
