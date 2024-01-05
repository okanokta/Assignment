package ornekproje;

/**
 *
 * @author oktao
 */
// SOLID'in Liskov Substitution  prensibi kullanıldı...
public class Hatchback extends Vehicle{
    private int cargoCapacity;  // bagaj Kapasitesi özel bir özellik 

    public Hatchback(String type, String color, int year, int cargoCapacity, String fuelType) {
        super(type, color, year, fuelType);
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
        // Hatchback aracın günlük kira ücretini hesapla
        return super.calculateDailyRent() + 100;
    }

    @Override
    public double calculateMonthlyRent() {
        // Günlük ücreti 30 günle çarparak aylık ücreti bulma
        return calculateDailyRent() * 30;
    }

}
