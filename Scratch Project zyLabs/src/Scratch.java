// ===== Code from file InventoryTag.java =====
public class Scratch {
    private int quantityRemaining;

    public Scratch() {
        quantityRemaining = 0;
    }

    public int getQuantityRemaining() {
        return quantityRemaining;
    }

    public void addInventory(int numItems) {
        if (numItems > 10) {
            quantityRemaining = quantityRemaining + numItems;
        }
    }
}
// ===== end =====
