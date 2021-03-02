//package AbstractClasses;
//
//public class PayrollSystemTest {
//
//    public static void main(String[] args) {
//        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 31, 1, 1992, 1992);
//        HourlyEmployee hourlyEmployee = new HourlyEmployee("karen", "olu", "23456-7-8-22",22.5, (byte) 12, 11, 2, 2001);
//        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06, 13, 3, 1996);
//        BasePlusCommissionEmployee basePlusCommissionEmployee= new BasePlusCommissionEmployee("Segun", "Onagoruwa", "1002dfm5", 0.2, 1400.0, 1200, 20, 9, 1993);
//
//        System.out.println("Employees processed individually:");
//        System.out.printf("%n%s%n%s: $%,.2f%n%n",salariedEmployee, "earned", salariedEmployee.salary());
//        System.out.printf("%s%n%s: $%,.2f%n%n",hourlyEmployee, "earned", hourlyEmployee.salary());
//        System.out.printf("%s%n%s: $%,.2f%n%n",commissionEmployee, "earned", commissionEmployee.salary());
//        System.out.printf("%s%n%s: $%,.2f%n%n",basePlusCommissionEmployee,"earned", basePlusCommissionEmployee.salary());
//
//        Employee[] employees = new Employee[4];
//        employees[0] = salariedEmployee;
//        employees[1] = hourlyEmployee;
//        employees[2] = commissionEmployee;
//        employees[3] = basePlusCommissionEmployee;
//
//        for (Employee currentEmployee : employees){
//            System.out.println(currentEmployee);
//
//            if (currentEmployee.getMonth() == 2){
//
//            }
//
//            if (currentEmployee instanceof BasePlusCommissionEmployee){
//
//                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
//
//                employee.setBaseSalary(1.10 * employee.getBaseSalary());
//
//                System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
//                System.out.printf("earned $%,.2f%n%n",currentEmployee.salary());
//
//
//                for (int j = 0; j < employees.length; j++) {
//                    System.out.printf("Employee %d is a %s%n", j,
//                            employees[j].getClass().getName());
//                }
//            }
//        }
//    }
//}
