package ornekproje;

import java.util.List;

/**
 *
 * @author oktao
 */
public interface Customer {

    String getCustomerType();  // Müşteri tipini döndüren metot

    List<Vehicle> getAvailableVehicles();  // Müşterinin görebileceği araçları getiren metot

    boolean rentVehicle(Vehicle vehicle, int durationInDays);  // Araç kiralama metodu

    boolean canSeeAllVehicles();
}
