package abstractClass;

public class LaserPrinter extends Printer {

    private int remainingToner;

    public LaserPrinter(String model) {
        super(model);
        remainingToner = 100;
    }

    public int getRemainingToner() {
        return remainingToner;
    }

    public void refillToner() {
        remainingToner = 100;
    }

    @Override
    public void print() {
        if (remainingToner == 0) {
            System.out.println("The toner is empty.");
        } else {
            remainingToner -= 10;
            System.out.println(getModel() + " is printing. Remaining toner: "
                    + remainingToner + "%");
        }
    }
}
