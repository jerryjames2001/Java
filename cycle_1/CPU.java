public class CPU {
    double price;

    class Processor {
        double cores;
        String manufacturer;

        Processor(double cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        double getCache() {
            return 4.3;
        }
    }

    static class RAM {
        double memory;
        String manufacturer;

        RAM(double memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        double getClockSpeed() {
            return 5.5;
        }
    }

    public static void main(String[] args) {
    System.out.println("Jerry James \n 23mca036 \n 20-02-24");
    System.out.println("Information of Processor and RAM.");
    System.out.println("****************************");

        CPU cpu = new CPU();
        cpu.price = 300;
        CPU.Processor processor = cpu.new Processor(4, "Intel");
        CPU.RAM ram = new CPU.RAM(16, "Samsung");

        System.out.println("Processor Cache=" + processor.getCache());
        System.out.println("Ram Clock speed=" + ram.getClockSpeed());
    }
}