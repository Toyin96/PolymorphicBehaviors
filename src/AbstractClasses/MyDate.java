package AbstractClasses;

interface MyDate {

    int day = 1;
    int month = 4;
    int year = 2000;


    int getDay();

    int getMonth();

    int getYear();

    void setDate(int day, int month, int year);

    String getDate();
}
