//package AbstractClasses;
//
//public class SalariedEmployee extends Employee{
//
//    private double weeklySalary;
//
//
//    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
//        super(firstName, lastName, socialSecurityNumber);
//
//        if(weeklySalary <= 0.0){
//            throw new IllegalArgumentException("The weeklySalary should be above $0.0");
//        }
//        this.weeklySalary = weeklySalary;
//    }
//
//    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, int day, int month, int year, double weeklySalary) {
//        super(firstName, lastName, socialSecurityNumber, day, month, year);
//        if(weeklySalary <= 0.0){
//            throw new IllegalArgumentException("The weeklySalary should be above $0.0");
//        }
//        this.weeklySalary = weeklySalary;
//    }
//
//    public double getWeeklySalary() {
//        return weeklySalary;
//    }
//
//    public void setWeeklySalary(int weeklySalary) {
//        this.weeklySalary = weeklySalary;
//    }
//
//    @Override
//    public double salary() {
//        return getWeeklySalary();
//    }
//
//    @Override
//    public String toString() {
//        return "SalariedEmployee{" +
//                "weeklySalary=" + weeklySalary +
//                '}';
//    }
//}
