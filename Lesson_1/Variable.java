public class Variable {
    public static void main(String[] args) {
        byte numCore = 4;
        short cpuFrequency = 3300;
        int diskSpace = 4000000;
        long ram = 64000;
        float sectors = 25;
        double powerSupply = 750;
        char effencyPower = 'A';
        boolean laptop = true;
        
        System.out.println("Number core: " + numCore);
        System.out.println("CPU frequency: " + cpuFrequency);
        System.out.println("Disk space: " + diskSpace);
        System.out.println("Ram: " + ram);
        System.out.println("Sectors: " + sectors);
        System.out.println("Power supply: " + powerSupply);
        System.out.println(effencyPower);
        System.out.println("Laptop: " + laptop);        
    }
}