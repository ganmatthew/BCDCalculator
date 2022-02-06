package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Controller {
    private Converter converter = new Converter();

    public String toUnpackedBCD(int number) {
        return converter.decimalToUnpackedBCD(number);
    }

    public String toPackedBCD(int number) {
        return converter.decimalToPackedBCD(number);
    }

    public String toDenselyPackedBCD(int number) { return converter.decimalToDenselyPackedBCD(number); }

    public int toDecimal(String dense) {
        return converter.denselyPackedBCDtoDecimal(dense); 
    }

    public void export(String decimal, String dense, String packed, String unpacked) {
        StringBuilder sb = new StringBuilder();

        try {
            File file = new File("out.txt");
            FileWriter writer = new FileWriter(file);

            sb.append("Decimal: ");
            sb.append(decimal);
            sb.append('\n');

            sb.append("Densely-Packed BCD: ");
            sb.append(dense);
            sb.append('\n');

            sb.append("Packed BCD: ");
            sb.append(packed);
            sb.append('\n');

            sb.append("Unpacked BCD: ");
            sb.append(unpacked);
            sb.append('\n');

            writer.write(sb.toString());

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
