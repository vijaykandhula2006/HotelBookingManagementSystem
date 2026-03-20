public class UseCase10BookingCancellation {

    public static void main(String[] args) {

        System.out.println("Booking Cancellation");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Cancellation service
        CancellationService cancellationService = new CancellationService();

        // Simulate confirmed booking
        String reservationId = "Single-1";
        String roomType = "Single";

        cancellationService.registerBooking(reservationId, roomType);

        // Cancel booking
        cancellationService.cancelBooking(reservationId, inventory);

        // Show rollback history
        cancellationService.showRollbackHistory();

        // Show updated inventory
        System.out.println("\nUpdated Single Room Availability: " +
                inventory.getRoomAvailability().get("Single"));
    }
}