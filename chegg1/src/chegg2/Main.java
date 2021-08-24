
package chegg2;

class InventoryItem {

    //1. private variables
    private String name;
    private double price;
    private int inStockCount;

    //2. default constructor
    InventoryItem() {
        name = "item";
        price = 00;
        inStockCount = 0;
    }

    //3. 3 paraeter constructor
    public InventoryItem(String name, double price, int inStockCount) {
        this.name = name;
        this.price = price;
        this.inStockCount = inStockCount;
    }

    //4. shipping cost method
    public double shippingCost() {
        return 0;
    }

    //5. toString method
    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price + ", In Stock: " + inStockCount;
    }

    //6. equals method
    public boolean equals(InventoryItem item) {
        return this.name.equals(item.name);
    }

    // getter methods to use private variables in derived class
    public String getName() {
        return name;
    }

    public int getInStockCount() {
        return inStockCount;
    }

    public double getPrice() {
        return price;
    }
}

class DigitalItem extends InventoryItem {

    //1. private variables
    private double fileSize;

    //2. default constructor
    DigitalItem() {
        fileSize = 0;
    }

    //3. 3 paraeter constructor
    public DigitalItem(double fileSize, String name, double price, int inStockCount) {
        super(name, price, inStockCount);
        this.fileSize = fileSize;
    }

    //4. shipping cost method
    @Override
    public double shippingCost() {
        double ItemPrice = super.getPrice();
        double ShippingCost = 0;
        double TotalPrice = ItemPrice + ShippingCost;

        return TotalPrice;
    }

    //5. toString method
    @Override
    public String toString() {
        String name = super.getName();
        double price = super.getPrice();
        int inStockCount = super.getInStockCount();
        return "Name: " + name + ", Price: " + price + ", In Stock: " + inStockCount + ", File Size: " + fileSize;
    }

    //6. equals method
    public boolean equals(DigitalItem item) {
        String name = super.getName();

        return name.equals(item.getName()) && this.fileSize == item.fileSize;
    }
}

//Main class to test both classes
public class Main {

    public static void main(String[] args) {
        InventoryItem inventoryItem1 = new InventoryItem("pen", 10, 5);
        InventoryItem inventoryItem2 = new InventoryItem("pen", 20, 2);
        DigitalItem digitalItem1 = new DigitalItem(20, "pen", 10, 5);
        DigitalItem digitalItem2 = new DigitalItem(20, "pen", 20, 2);

        System.out.println("inventoryItem1: " + inventoryItem1);
        System.out.println("inventoryItem2: " + inventoryItem2);
        System.out.println("Shipping cost of inventoryItem1 is " + inventoryItem1.shippingCost() + ".");
        System.out.println("Shipping cost of inventoryItem2 is " + inventoryItem2.shippingCost() + ".");

        if (inventoryItem1.equals(inventoryItem2)) {
            System.out.println("inventoryItem1 and inventoryItem2 are same.");
        } else {
            System.out.println("inventoryItem1 and inventoryItem2 are not same.");
        }

        System.out.println();

        System.out.println("digital item1: " + digitalItem1);
        System.out.println("digital item1: " + digitalItem2);
        System.out.println("Shipping cost of digitalItem1 is " + digitalItem1.shippingCost() + ".");
        System.out.println("Shipping cost of digitalItem1 is " + digitalItem2.shippingCost() + ".");

        if (digitalItem1.equals(digitalItem2)) {
            System.out.println("digitalItem1 and digitalItem2 are same.");
        } else {
            System.out.println("digitalItem1 and digitalItem2 are not same.");
        }
    }
}
