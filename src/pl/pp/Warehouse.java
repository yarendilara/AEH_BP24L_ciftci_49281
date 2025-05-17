package pl.pp;

public class Warehouse {
    private int warehouseNumber;
    private int availableSpace;
    private int occupiedSpace;
    private String ownerName;
    private String ownerEmail;
    private String ownerPhone;

    public Warehouse(int warehouseNumber, int availableSpace, String ownerName, String ownerEmail, String ownerPhone) {
        this.warehouseNumber = warehouseNumber;
        this.availableSpace = availableSpace;
        this.ownerName = ownerName;
        this.ownerEmail = ownerEmail;
        this.ownerPhone = ownerPhone;
        this.occupiedSpace = 0;
    }

    public int getWarehouseNumber() {
        return warehouseNumber;
    }

    public int getAvailableSpace() {
        return availableSpace - occupiedSpace;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setWarehouseNumber(int warehouseNumber) {
        this.warehouseNumber = warehouseNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public void addGoods(int amount) {
        if (occupiedSpace + amount <= availableSpace) {
            occupiedSpace += amount;
            System.out.println("Added " + amount + " units of goods. Remaining warehouse space: " + getAvailableSpace() + " units.");
        } else {
            System.out.println("Not enough space. Available: " + getAvailableSpace() + " units.");
        }
    }

    public void removeGoods(int amount) {
        if (amount <= occupiedSpace) {
            occupiedSpace -= amount;
            System.out.println("Removed " + amount + " units of goods. Remaining warehouse space: " + getAvailableSpace() + " units.");
        } else {
            System.out.println("Cannot remove more goods than are currently stored.");
        }
    }

    public void checkOccupancy() {
        System.out.println("Occupied space: " + occupiedSpace + " units.");
        System.out.println("Free space: " + getAvailableSpace() + " units.");
    }

    public void updateContact(String newEmail, String newPhone) {
        setOwnerEmail(newEmail);
        setOwnerPhone(newPhone);
        System.out.println("Owner's contact updated to Email: " + newEmail + ", Phone: " + newPhone);
    }
}
