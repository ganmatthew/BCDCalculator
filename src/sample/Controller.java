package sample;

public class Controller {
    private Converter converter = new Converter();

    public String toUnpackedBCD(int number) {
        return converter.toUnpackedBCD(number);
    }
}
