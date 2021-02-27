package interfaceTesting;

public class Invoice  implements Payable{
    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {

        if (pricePerItem < 0){
            throw new IllegalArgumentException("Quantity must be >= 0");
        }

        if (pricePerItem < 0.0){
            throw new IllegalArgumentException("Quantity must be >= 0.0");
        }

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        if (quantity < 0){
            throw new IllegalArgumentException("quantity cannot be lowe than 0");
        }
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {

        if (pricePerItem < 0.0){
            throw new IllegalArgumentException("pricePerItem cannot be lower than 0");
        }
        this.pricePerItem = pricePerItem;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "partNumber='" + partNumber + '\'' +
                ", partDescription='" + partDescription + '\'' +
                ", quantity=" + quantity +
                ", pricePerItem=" + pricePerItem +
                '}';
    }

    @Override
    public double getPaymentAmount() {
        return getPricePerItem() * getQuantity();
    }
}
