public class UseCase4RoomSearch {

    public static void main(String[] args) {

        // Inventory (read-only usage)
        RoomInventory inventory = new RoomInventory();

        // Room objects
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Search service
        RoomSearchService searchService = new RoomSearchService();

        // Perform search (NO modification)
        searchService.searchAvailableRooms(
                inventory,
                single,
                doubleRoom,
                suite
        );
    }
}
