package ornekproje;

/**
 *
 * @author oktao
 */
// SOLID'in Liskov Substitution  prensibi kullanıldı...
public class Sedan extends Vehicle{
    public Sedan(String type, String color, int year, String fuelType){
        super(type, color, year, fuelType);
    }
    
    @Override
    public double calculateDailyRent() {
        return super.calculateDailyRent() + 300;
    }

    @Override
    public double calculateMonthlyRent() {
        return calculateDailyRent() * 30;
    }
}
