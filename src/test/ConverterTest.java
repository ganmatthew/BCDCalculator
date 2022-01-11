package test;

import org.junit.jupiter.api.Test;
import sample.Converter;

public class ConverterTest {
    @Test
    void test_decimal_to_BCD () {
        Converter converter = new Converter();

        String unpackedBCD = converter.toUnpackedBCD(52);
        System.out.println("UnpackedBcd: " + unpackedBCD);
        assert unpackedBCD.equals("0000010100000010");
    }
}
