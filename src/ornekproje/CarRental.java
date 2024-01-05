package ornekproje;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author oktao
 */
// SOLID'in Dependency Inversion prensibi kullanıldı...
public class CarRental {
    public List<Vehicle> getVisibleVehicles(Customer customer) {
        // Kullanıcı tipine göre araçları filtrele...
        List<Vehicle> visibleVehicles = new ArrayList<>();

        // Kullanıcı tipine ve yetkisine göre araçları filtrele
        if (customer.canSeeAllVehicles()) {
            // Müşteri tüm araçları görebilir
            visibleVehicles.addAll(customer.getAvailableVehicles());
        } else {
            // Bireysel müşteri sadece Hatchback araçları görebilir
            visibleVehicles.addAll(customer.getAvailableVehicles().stream()
                    .filter(vehicle -> vehicle instanceof Hatchback)
                    .collect(Collectors.toList()));
        }

        return visibleVehicles;
    }
}
