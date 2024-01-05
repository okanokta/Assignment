package ornekproje;

/**
 *
 * @author oktao
 */
public interface Rentalable {
    // SOLID'in Single Responsibility prensibi kullanıldı...
    
    double calculateDailyRent();  // Günlük kira ücreti hesaplamak için
    double calculateMonthlyRent();  // Aylık kira ücreti hesaplamak için
}
