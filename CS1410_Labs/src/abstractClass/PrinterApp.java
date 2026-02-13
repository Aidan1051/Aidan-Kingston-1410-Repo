package abstractClass;

public class PrinterApp {

    public static void main(String[] args) {

        Printer[] printers = new Printer[2];

        printers[0] = new InkjetPrinter("Canon TS202");
        printers[1] = new LaserPrinter("Samsung Xpress");

        for (Printer printer : printers) {

            System.out.println(printer);

            for (int i = 0; i < 11; i++) {
                printer.print();
            }

            System.out.println();
        }

        // Refill supplies
        InkjetPrinter inkjet = (InkjetPrinter) printers[0];
        LaserPrinter laser = (LaserPrinter) printers[1];

        inkjet.refillCartridge();
        laser.refillToner();

        // Dynamically access remaining amounts
        System.out.println("Remaining cartridge after refilling: "
                + inkjet.getRemainingCartridge() + "%");

        System.out.println("Remaining toner after refilling: "
                + laser.getRemainingToner() + "%");
    }
}
