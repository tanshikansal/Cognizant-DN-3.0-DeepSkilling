class Computer {
    private String cpu;
    private int ram;
    private int storage;

    private Computer(String cpu, int ram, int storage) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public static class Builder {
        private String cpu;
        private int ram;
        private int storage;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(cpu, ram, storage);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer.Builder()
                .setCpu("Intel i7")
                .setRam(16)
                .setStorage(512)
                .build();

        Computer computer2 = new Computer.Builder()
                .setCpu("AMD Ryzen 9")
                .setRam(32)
                .setStorage(1_000)
                .build();

        System.out.println("Computer 1: CPU=" + computer1.getCpu() +
                ", RAM=" + computer1.getRam() + "GB, Storage=" + computer1.getStorage() + "GB");
        System.out.println("Computer 2: CPU=" + computer2.getCpu() +
                ", RAM=" + computer2.getRam() + "GB, Storage=" + computer2.getStorage() + "GB");
    }
}
