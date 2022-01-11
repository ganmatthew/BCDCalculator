package sample;

public class Converter {

    public String toUnpackedBCD (int number) {
        String convert = String.valueOf(number);
        String unpackedBCD = "";

        char[] digits = convert.toCharArray();

        for (char digit : digits) {
            String binary = Integer.toBinaryString(Character.getNumericValue(digit));
            unpackedBCD = unpackedBCD.concat(String.format("%8s", binary)
                    .replace(' ', '0'));
        }
        return unpackedBCD;
    }

    public String toPackedBCD(int number) {
        String convert = String.valueOf(number);
        String packedBCD = "";

        char[] digits = convert.toCharArray();

        for (char digit : digits) {
            String binary = Integer.toBinaryString(Character.getNumericValue(digit));
            packedBCD = packedBCD.concat(String.format("%4s", binary)
                    .replace(' ', '0'));
        }
        return packedBCD;
    }
}
