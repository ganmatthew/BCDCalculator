package sample;

public class Controller {
    private Converter converter = new Converter();

    public String toUnpackedBCD(int number) {
        return converter.decimalToUnpackedBCD(number);
    }

    public String toPackedBCD(int number) {
        return converter.decimalToPackedBCD(number);
    }

    public String toDenselyPackedBCD(int number) { return converter.decimalToDenselyPackedBCD(number); }
}
