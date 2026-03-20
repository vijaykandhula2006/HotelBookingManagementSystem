public class UseCase12DataPersistenceRecovery {

    public static void main(String[] args) {

        System.out.println("System Recovery");

        String filePath = "inventory.txt";

        RoomInventory inventory = new RoomInventory();
        FilePersistenceService persistenceService = new FilePersistenceService();

        // Load previous state
        persistenceService.loadInventory(inventory, filePath);

        // Show current inventory
        System.out.println("\nCurrent Inventory:");
        System.out.println("Single: " + inventory.getRoomAvailability().get("Single"));
        System.out.println("Double: " + inventory.getRoomAvailability().get("Double"));
        System.out.println("Suite: " + inventory.getRoomAvailability().get("Suite"));

        // Save state again
        persistenceService.saveInventory(inventory, filePath);
    }
}
