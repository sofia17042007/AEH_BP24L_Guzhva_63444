public class Warehouse {
    private int warehouseNumber;
    private int totalSpace;
    private int occupiedSpace;
    private String ownerName;
    private String ownerEmail;
    private String ownerPhone;

    public Warehouse(int warehouseNumber, int totalSpace, String ownerName, String ownerEmail, String ownerPhone) {
        this.warehouseNumber = warehouseNumber;
        this.totalSpace = totalSpace;
        this.occupiedSpace = 0;
        this.ownerName = ownerName;
        this.ownerEmail = ownerEmail;
        this.ownerPhone = ownerPhone;
    }

    // Getters
    public int getWarehouseNumber() { return warehouseNumber; }
    public int getTotalSpace() { return totalSpace; }
    public int getOccupiedSpace() { return occupiedSpace; }
    public String getOwnerName() { return ownerName; }
    public String getOwnerEmail() { return ownerEmail; }
    public String getOwnerPhone() { return ownerPhone; }

    // Setters
    public void setWarehouseNumber(int number) { this.warehouseNumber = number; }
    public void setTotalSpace(int space) { this.totalSpace = space; }
    public void setOwnerName(String name) { this.ownerName = name; }
    public void setOwnerEmail(String email) { this.ownerEmail = email; }
    public void setOwnerPhone(String phone) { this.ownerPhone = phone; }

    // Methods
    public void addGoods(int amount) {
        if (occupiedSpace + amount > totalSpace) {
            System.out.println("Not enough space in the warehouse. Remaining warehouse space: " + (totalSpace - occupiedSpace) + " units.");
        } else {
            occupiedSpace += amount;
            System.out.println("Added " + amount + " units of goods. Remaining warehouse space: " + (totalSpace - occupiedSpace) + " units.");
        }
    }

    public void removeGoods(int amount) {
        if (amount > occupiedSpace) {
            System.out.println("Cannot remove more goods than currently in the warehouse.");
        } else {
            occupiedSpace -= amount;
            System.out.println("Removed " + amount + " units of goods. Remaining warehouse space: " + (totalSpace - occupiedSpace) + " units.");
        }
    }

    public void checkOccupancy() {
        System.out.println("Occupied warehouse space: " + occupiedSpace + " units.");
        System.out.println("Available warehouse space: " + (totalSpace - occupiedSpace) + " units.");
    }

    public void updateContact(String newEmail, String newPhone) {
        this.ownerEmail = newEmail;
        this.ownerPhone = newPhone;
        System.out.println("Owner's contact details updated.");
        System.out.println("New email: " + ownerEmail);
        System.out.println("New phone number: " + ownerPhone);
    }
}
