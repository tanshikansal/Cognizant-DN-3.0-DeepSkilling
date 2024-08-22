public class Book 
{
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) 
    {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
    
    public static int linearSearch(Book[] books, String targetTitle) 
    {
        for (int i = 0; i < books.length; i++) 
        {
            if (books[i].getTitle().equalsIgnoreCase(targetTitle)) 
            {
                return i; 
            }
        }
        return -1; 
    }

    public static int binarySearch(Book[] sortedBooks, String targetTitle) 
    {
        int low = 0;
        int high = sortedBooks.length - 1;

        while (low <= high) 
        {
            int mid = low + (high - low) / 2;
            int comparison = sortedBooks[mid].getTitle().compareToIgnoreCase(targetTitle);

            if (comparison == 0) 
            {
                return mid; 
            } 
            else if (comparison < 0) 
            {
                low = mid + 1;
            } 
            else 
            {
                high = mid - 1; 
            }
        }
        return -1; // Book not found
    }

    public static void main(String[] args) 
    {
        Book[] library = {
            new Book(1, "Harry Potter", "J.K. Rowling"),
            new Book(2, "Lord of the Rings", "J.R.R. Tolkien"),
            new Book(3, "To Kill a Mockingbird", "Harper Lee"),
        };

        String targetTitle = "To Kill a Mockingbird";
        int linearResult = linearSearch(library, targetTitle);
        int binaryResult = binarySearch(library, targetTitle);

        if (linearResult != -1) 
        {
            System.out.println("Linear search: Book found at index " + linearResult);
        } 
        else 
        {
            System.out.println("Linear search: Book not found.");
        }

        if (binaryResult != -1) 
        {
            System.out.println("Binary search: Book found at index " + binaryResult);
        } 
        else 
        {
            System.out.println("Binary search: Book not found.");
        }
    }
}
