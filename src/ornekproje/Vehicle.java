package ornekproje;

/**
 *
 * @author oktao
 */
// SOLID'in Open/Closed prensibi kullanıldı...
public class Vehicle implements Rentalable{
    private String type;
    private String color;
    private int year;
    private String fuelType;
    
    public Vehicle(String type, String color, int year, String fuelType){
        this.type = type;
        this.color = color;
        this.year = year;
        this.fuelType = fuelType;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public double calculateDailyRent() {
        return 100.0;
    }

    @Override
    public double calculateMonthlyRent() {
        return calculateDailyRent() * 30;
    }
    
}
