package ornekproje;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oktao
 */
public class CorporateCustomer implements Customer {

    private static final String CUSTOMER_TYPE = "Kurumsal";
    private List<Vehicle> availableVehicles;

    public CorporateCustomer() {
        availableVehicles = new ArrayList<>();
    }

    @Override
    public String getCustomerType() {
        return CUSTOMER_TYPE;
    }

    @Override
    public List<Vehicle> getAvailableVehicles() {
        // Kurumsal müşteri tüm araçları görebilir
        return availableVehicles;
    }

    @Override
    public boolean rentVehicle(Vehicle vehicle, int durationInDays) {
        // Kiralama işlemleri...
        System.out.println("Şirket müşterisi tarafından araç kiralandı.");
        return true;
    }

    @Override
    public boolean canSeeAllVehicles() {
        return true;
    }

}
