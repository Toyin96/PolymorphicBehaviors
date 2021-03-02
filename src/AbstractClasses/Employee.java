package AbstractClasses;

import java.util.Date;

public abstract class Employee implements MyDate{

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private String birthDate;

    public Employee(String firstName, String lastName, String socialSecurityNumber, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        setDate(day, month, year);
        this.birthDate = getDate();
    }

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Employee(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }


    public abstract double salary();
}
