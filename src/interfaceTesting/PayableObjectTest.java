package interfaceTesting;

public class PayableObjectTest {

    public static void main(String[] args) {


        Payable[] payableObject = new Payable[4];

        payableObject[0] = new Invoice("262", "seat", 12, 1500);
        payableObject[1] = new Invoice("731", "tire", 5, 3760);
        payableObject[2] = new SalariedEmployee("John", "James", "283-344-927", 3500);
        payableObject[3] = new SalariedEmployee("Paul", "Konnes", "253-294-377", 2500);

        System.out.println("Invoices and Employees processed polymorphically:");

        for (Payable payable : payableObject) {
            System.out.println(payable);
        }



    }

}
