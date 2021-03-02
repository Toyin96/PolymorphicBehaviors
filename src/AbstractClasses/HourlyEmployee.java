//package AbstractClasses;
//
//public class HourlyEmployee  extends Employee{
//
//    private double hourlyWage;
//    private byte hoursWorked;
//
//    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hourlyWage, byte hoursWorked) {
//        super(firstName, lastName, socialSecurityNumber);
//        this.hourlyWage = hourlyWage;
//        this.hoursWorked = hoursWorked;
//    }
//
//    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hourlyWage, byte hoursWorked, int day, int month, int year) {
//        super(firstName, lastName, socialSecurityNumber, day, month, year);
//        this.hourlyWage = hourlyWage;
//        this.hoursWorked = hoursWorked;
//    }
//
//    public double getHourlyWage() {
//        return hourlyWage;
//    }
//
//    public void setHourlyWage(double hourlyWage) {
//        this.hourlyWage = hourlyWage;
//    }
//
//    public byte getHoursWorked() {
//        return hoursWorked;
//    }
//
//    public void setHoursWorked(byte hoursWorked) {
//        this.hoursWorked = hoursWorked;
//    }
//
//    @Override
//    public double salary() {
//
//        if (hoursWorked <= 40){
//            return hourlyWage * hoursWorked;
//        }
//        else {
//            return (40 * hourlyWage + ( hoursWorked - 40 ) * hourlyWage * 1.5);
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "HourlyEmployee{" +
//                "hourlyWage=" + hourlyWage +
//                ", hoursWorked=" + hoursWorked +
//                '}';
//    }
//}
