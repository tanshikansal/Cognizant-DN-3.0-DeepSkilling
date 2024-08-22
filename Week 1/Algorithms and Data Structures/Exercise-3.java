class Order 
{
    private int orderId;
    private String customerName;
    private double totalPrice;

    public Order(int orderId, String customerName, double totalPrice) 
    {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }
}

class SortingApp 
{
    // Bubble Sort
    static void bubbleSort(Order[] orders) 
    {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) 
                {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    // Quick Sort
    static void quickSort(Order[] orders, int low, int high) 
    {
        if (low < high) 
        {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    static int partition(Order[] orders, int low, int high) 
    {
        double pivot = orders[high].getTotalPrice();
        int i = low - 1;
        for (int j = low; j < high; j++) 
        {
            if (orders[j].getTotalPrice() <= pivot) 
            {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) 
    {
        Order[] orders = {
            new Order(101, "Alice", 120.50),
            new Order(102, "Bob", 90.75),
            new Order(103, "Charlie", 150.25),
            // Add more orders as needed
        };

        // Sort using Bubble Sort
        bubbleSort(orders);

        // Sort using Quick Sort
        quickSort(orders, 0, orders.length - 1);
    }
}
