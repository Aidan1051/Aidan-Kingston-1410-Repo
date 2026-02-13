package abstractClass;

public class InkjetPrinter extends Printer {

    private int remainingCartridge;

    public InkjetPrinter(String model) {
        super(model);
        remainingCartridge = 100;
    }

    public int getRemainingCartridge() {
        return remainingCartridge;
    }

    public void refillCartridge() {
        remainingCartridge = 100;
    }

    @Override
    public void print() {
        if (remainingCartridge == 0) {
            System.out.println("The cartridge is empty.");
        } else {
            remainingCartridge -= 10;
            System.out.println(getModel() + " is printing. Remaining cartridge: "
                    + remainingCartridge + "%");
        }
    }
}
