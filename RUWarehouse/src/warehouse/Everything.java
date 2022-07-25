package warehouse;



/*
 * Use this class to put it all together.
 */ 
public class Everything {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

	// Use this file to test all methods
    Warehouse ware = new Warehouse();
    StdIn.readInt();
    String first = "add";

    // Use this file to test addProduct
    while(!StdIn.isEmpty()) {
        //first = StdIn.readString();
        //System.out.print(first);
        if(first.equals("add")) {
            int day = StdIn.readInt();
            int idtemp = StdIn.readInt();
            ware.betterAddProduct(idtemp, StdIn.readString(), StdIn.readInt(), day, StdIn.readInt());
        } else if(first.equals("delete")) {
            ware.deleteProduct(StdIn.readInt());
        } else if(first.equals("restock")) {
            ware.restockProduct(StdIn.readInt(), StdIn.readInt());
        } else if(first.equals("purchase")) {
            int day = StdIn.readInt();
            ware.purchaseProduct(StdIn.readInt(), day, StdIn.readInt());
        } else {
            System.out.print(StdIn.readInt());
            System.out.print(StdIn.readInt());
            System.out.print(StdIn.readString());
            System.out.print(StdIn.readInt());
            System.out.print(StdIn.readInt());
        }
        //days = StdIn.readInt();9 5
        //idtemp = StdIn.readInt();
        //ware.getSectors()[idtemp % 10].add(new Product(idtemp, StdIn.readString(), StdIn.readInt(), days, StdIn.readInt()));
    }
    System.out.println(ware);
}
}
