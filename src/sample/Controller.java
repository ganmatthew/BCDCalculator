package sample;

public class Controller {
    private Converter converter = new Converter();

    public String toUnpackedBCD(int number) {
        return converter.toUnpackedBCD(number);
    }

    public String toPackedBCD(int number) {
        return converter.toPackedBCD(number);
    }

    public String toDenselyPackedBCD(String number) { return converter.toDenselyPackedBCD(number); }
}
