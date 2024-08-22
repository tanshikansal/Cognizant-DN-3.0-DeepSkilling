class Product 
{
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) 
    {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

//Linear Search

public class LinearSearch 
{
    public static int linearSearch(Product[] products, int productId) 
    {
        for (int i = 0; i < products.length; i++) 
        {
            if (products[i].productId == productId) 
            {
                return i; 
            }
        }
        return -1; 
    }
    public static void main(String[] args) 
    {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Smartphone", "Electronics"),
            new Product(3, "Tablet", "Electronics")
        };

        int index = linearSearch(products, 2);
        if (index != -1) 
        {
            System.out.println("Product found at index: " + index);
        } 
        else 
        {
            System.out.println("Product not found");
        }
}

//Binary Search

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch 
{
    public static int binarySearch(Product[] products, int productId)
    {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) 
        {
            int mid = left + (right - left) / 2;

            if (products[mid].productId == productId) 
            {
                return mid;
            }

            if (products[mid].productId < productId) 
            {
                left = mid + 1;
            } 
            else 
            {
                right = mid - 1;
            }
        }
        return -1; 
    }

    public static void main(String[] args)
    {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Smartphone", "Electronics"),
            new Product(3, "Tablet", "Electronics")
        };

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        int index = binarySearch(products, 2);
        if (index != -1) 
        {
            System.out.println("Product found at index: " + index);
        } 
        else 
        {
            System.out.println("Product not found");
        }
    }
}

