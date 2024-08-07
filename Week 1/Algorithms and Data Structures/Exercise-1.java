import java.util.HashMap;

public class Product 
{
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(String productId, String productName, int quantity, double price) 
    {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
}

public class Inventory
{
    private HashMap<String, Product> products;

    public Inventory() 
    {
        products = new HashMap<>();
    }

    // Add a product
    public void addProduct(Product product) 
    {
        products.put(product.getProductId(), product);
    }

    // Update a product
    public void updateProduct(Product product) 
    {
        if (products.containsKey(product.getProductId())) 
        {
            products.put(product.getProductId(), product);
        } 
        else 
        {
            System.out.println("Product not found!");
        }
    }

    // Delete a product
    public void deleteProduct(String productId) 
    {
        if (products.containsKey(productId)) 
        {
            products.remove(productId);
        } 
        else 
        {
            System.out.println("Product not found!");
        }
    }

    // Retrieve a product
    public Product getProduct(String productId) 
    {
        return products.get(productId);
    }
}
