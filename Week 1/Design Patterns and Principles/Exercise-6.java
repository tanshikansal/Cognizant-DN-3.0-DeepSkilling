interface Image {
    void display();
}

class RealImage implements Image {
    private String imageUrl;

    public RealImage(String imageUrl) {
        this.imageUrl = imageUrl;
        loadFromRemoteServer();
    }

    private void loadFromRemoteServer() {
        System.out.println("Loading image from remote server: " + imageUrl);
        // Actual image loading logic here...
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + imageUrl);
        // Actual display logic here...
    }
}

class ProxyImage implements Image {
    private RealImage realImage;
    private String imageUrl;

    public ProxyImage(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(imageUrl);
        }
        realImage.display();
    }
}

public class Main {
    public static void main(String[] args) {
        Image proxyImage = new ProxyImage("https://example.com/image.jpg");

        proxyImage.display();

        proxyImage.display();
    }
}
