package ornekproje;

import java.util.List;

public class OrnekProje {

    public static void main(String[] args) {
        
        CarRental carRental = new CarRental();
        // ARAÇLARI OLUŞTUR
        Hatchback hatchback = new Hatchback("HATCHBACK", "MAVİ", 2021, 400,"Dizel");
        Hatchback hatchback_2 = new Hatchback("HATCHBACK", "SİYAH", 2019, 400, "Benzin");
        Sedan sedan = new Sedan("SEDAN", "BEYAZ", 2022, "Dizel");
        SUV suv = new SUV("SUV","KIRMIZI",2023,500,"Benzin");
    
        // Müşteri OLUŞTUR
        IndividualCustomer individualCustomer  = new IndividualCustomer();
        CorporateCustomer corporateCustomer = new CorporateCustomer();
        
        // Araçları müşterilere ekleme işlemi
        individualCustomer .getAvailableVehicles().add(hatchback_2);
        individualCustomer .getAvailableVehicles().add(hatchback);
        corporateCustomer.getAvailableVehicles().add(suv);
        corporateCustomer.getAvailableVehicles().add(hatchback);
        corporateCustomer.getAvailableVehicles().add(sedan);
        
        
        List<Vehicle> visibleVehiclesForIndividual = carRental.getVisibleVehicles(individualCustomer);
        System.out.println("Bireysel müşteri için görünen araçlar:");
        for (Vehicle vehicle : visibleVehiclesForIndividual) {
            System.out.println(vehicle.getType() + " - " + vehicle.getColor() + " - Günlük Kira Ücreti: " + vehicle.calculateDailyRent());
        }

        System.out.println("------------------------------");

        // Kurumsal müşteri için görünen araçları listele
        List<Vehicle> visibleVehiclesForCorporate = carRental.getVisibleVehicles(corporateCustomer);
        System.out.println("Kurumsal müşteri için görünen araçlar:");
        for (Vehicle vehicle : visibleVehiclesForCorporate) {
            System.out.println(vehicle.getType() + " - " 
                    + vehicle.getColor() + " - Günlük Kira Ücreti: " 
                    + vehicle.calculateDailyRent() + " - Aylık Kira Ücreti: " 
                    + vehicle.calculateMonthlyRent());
        }

        System.out.println("------------------------------");

        // Bireysel müşteri bir Hatchback araç kiralasın
        individualCustomer.rentVehicle(hatchback, 7);

        System.out.println("------------------------------");

        // Kurumsal müşteri bir SUV araç kiralasın
        corporateCustomer.rentVehicle(suv, 15);
    }
}
