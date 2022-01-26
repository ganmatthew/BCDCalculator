package test;

import org.junit.jupiter.api.Test;
import sample.Converter;

public class ConverterTest {
    @Test
    void test_decimal_to_unpackedBCD () {
        Converter converter = new Converter();

        String unpackedBCD = converter.decimalToUnpackedBCD(52);
        System.out.println("UnpackedBcd: " + unpackedBCD);
        assert unpackedBCD.equals("0000010100000010");
    }
    @Test
    void test_negative_decimal_to_unpackedBCD () {
        Converter converter = new Converter();

        String unpackedBCD = converter.decimalToUnpackedBCD(-910);
        System.out.println("UnpackedBcd: " + unpackedBCD);

        assert unpackedBCD.equals("00001001000000010000000000001101");
    }
    @Test
    void test_decimal_to_packedBCD () {
        Converter converter = new Converter();

        String packedBCD = converter.decimalToPackedBCD(256);
        System.out.println("packedBCD: " + packedBCD);
        assert packedBCD.equals("001001010110");
    }
    @Test
    void test_negative_decimal_to_packedBCD () {
        Converter converter = new Converter();

        String packedBCD = converter.decimalToPackedBCD(-250);
        System.out.println("packedBCD: " + packedBCD);
        assert packedBCD.equals("0010010100001101");
    }
    @Test
    void test_decimal_to_densely_packedBCD_1() {
        Converter converter = new Converter();

        String denselyPackedBCD = converter.decimalToDenselyPackedBCD(489);
        System.out.println("denselyPackedBCD: " + denselyPackedBCD);
        assert denselyPackedBCD.equals("1001001111");
    }
    @Test
    void test_decimal_to_densely_packedBCD_2 () {
        Converter converter = new Converter();

        String denselyPackedBCD = converter.decimalToDenselyPackedBCD(532);
        System.out.println("denselyPackedBCD: " + denselyPackedBCD);
        assert denselyPackedBCD.equals("1010110010");
    }
    @Test
    void test_decimal_to_densely_packedBCD_3 () {
        Converter converter = new Converter();

        String denselyPackedBCD = converter.decimalToDenselyPackedBCD(123);
        System.out.println("denselyPackedBCD: " + denselyPackedBCD);
        assert denselyPackedBCD.equals("0010100011");
    }
    @Test
    void test_decimal_to_densely_packedBCD_4 () {
        Converter converter = new Converter();

        String denselyPackedBCD = converter.decimalToDenselyPackedBCD(280);
        System.out.println("denselyPackedBCD: " + denselyPackedBCD);
        assert denselyPackedBCD.equals("0100001010");
    }
}
