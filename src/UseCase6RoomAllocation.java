public class UseCase6RoomAllocation {

    public static void main(String[] args) {

        System.out.println("Room Allocation Processing");

        // Queue
        BookingRequestQueue queue = new BookingRequestQueue();

        queue.addRequest(new Reservation("Abhi", "Single"));
        queue.addRequest(new Reservation("Subha", "Single"));
        queue.addRequest(new Reservation("Vanmathi", "Suite"));

        // Inventory
        RoomInventory inventory = new RoomInventory();

        // Allocation service
        RoomAllocationService allocationService = new RoomAllocationService();

        // Process queue (FIFO)
        while (queue.hasPendingRequests()) {

            Reservation r = queue.getNextRequest();

            allocationService.allocateRoom(r, inventory);
        }
    }
}
