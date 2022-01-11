package test;

import org.junit.jupiter.api.Test;
import sample.Converter;

public class ConverterTest {
    @Test
    void test_decimal_to_unpackedBCD () {
        Converter converter = new Converter();

        String unpackedBCD = converter.toUnpackedBCD(52);
        System.out.println("UnpackedBcd: " + unpackedBCD);
        assert unpackedBCD.equals("0000010100000010");
    }
    @Test
    void test_decimal_to_packedBCD () {
        Converter converter = new Converter();

        String packedBCD = converter.toPackedBCD(256);
        System.out.println("packedBCD: " + packedBCD);
        assert packedBCD.equals("001001010110");
    }
}
