package ornekproje;

/**
 *
 * @author oktao
 */
// SOLID'in Liskov Substitution  prensibi kullanıldı...
public class SUV extends Vehicle{
    private int cargoCapacity;
    
    public SUV(String type, String color, int year, int cargoCapacity, String fuelType){
        super(type,color,year,fuelType);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public double calculateDailyRent() {
        return super.calculateDailyRent() + 200;
    }

    @Override
    public double calculateMonthlyRent() {
        return super.calculateDailyRent() * 30;
    }
    
}
