package abstractClass;

/**
 * Abstract superclass representing a generic printer.
 * Subclasses must define how printing is performed,
 * including how supplies are consumed and what message is displayed.
 */
public abstract class Printer {

    private String model;
    private int serialNumber;
    private static int count = 0;

    /**
     * Protected constructor.
     * Increments printer count, initializes model,
     * and generates serial number.
     */
    protected Printer(String model) {
        count++;
        this.model = model;
        this.serialNumber = 12345 + count;
    }

    public String getModel() {
        return model;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    /**
     * Performs a print operation.
     * Subclasses must:
     * - Check whether printing supply (toner/cartridge) is empty.
     * - If empty, display an appropriate message without changing state.
     * - Otherwise, reduce the supply level and display
     *   a message indicating the model and remaining supply percentage.
     */
    public abstract void print();

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + model + " #" + serialNumber;
    }
}
