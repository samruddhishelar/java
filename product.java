class Product
{
    int product_id;
    String product_name;
    double product_cost;
    int product_quantity;

    static int count = 0;

    Product(int id, String name, double cost, int quantity)
    {
        product_id = id;
        product_name = name;
        product_cost = cost;
        product_quantity = quantity;
    }
    static void countObject()
    {
        System.out.println("No of object created :"+(++count));
    }

    void display()
    {
        System.out.println("Product ID       : " + product_id);
        System.out.println("Product Name     : " + product_name);
        System.out.println("Product Cost     : " + product_cost);
        System.out.println("Product Quantity : " + product_quantity);
        System.out.println();
    }

    public static void main(String args[])
    {
        Product p1 = new Product(101, "Laptop", 50000, 2);
        Product.countObject();
        p1.display();
        Product p2 = new Product(102, "Mobile", 20000, 5);
        Product.countObject();
        p2.display();
        Product p3 = new Product(103, "Keyboard", 1500, 10);
	Product.countObject();
        p3.display();
    }
}
