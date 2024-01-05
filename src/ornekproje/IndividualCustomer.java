package ornekproje;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oktao
 */
// SOLID'in Single Responsibility prensibi kullanıldı...
public class IndividualCustomer implements Customer{

    private static final String CUSTOMER_TYPE = "Bireysel";
    private List<Vehicle> availableVehicles;

    public IndividualCustomer() {
        availableVehicles = new ArrayList<>();
    }

    @Override
    public String getCustomerType() {
        return CUSTOMER_TYPE;
    }

    @Override
    public List<Vehicle> getAvailableVehicles() {
        // Bireysel müşteri sadece Hatchback araçları görebilir
        List<Vehicle> hatchbackVehicles = new ArrayList<>();
        for (Vehicle vehicle : availableVehicles) {
            if (vehicle instanceof Hatchback) {
                hatchbackVehicles.add(vehicle);
            }
        }
        return hatchbackVehicles;
    }

    @Override
    public boolean rentVehicle(Vehicle vehicle, int durationInDays) {
        // Bireysel müşteri, sadece Hatchback araçları kiralayabilir
        if (vehicle instanceof Hatchback) {
            // Kiralama işlemleri...
            vehicle.calculateDailyRent();
            System.out.println("Bireysel müşteri tarafından Hatchback araç kiralandı.");
            return true;
        } else {
            System.out.println("Bireysel müşteriler sadece Hatchback araçları kiralayabilir.");
            return false;
        }
    }

    @Override
    public boolean canSeeAllVehicles() {
        return false;
    }
    
}
