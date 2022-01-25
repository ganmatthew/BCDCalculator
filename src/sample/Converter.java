package sample;

import java.util.Arrays;

public class Converter {

    public String toUnpackedBCD (int number) {
        return converter("%8s", number);
    }
    public String toPackedBCD(int number) {
        return converter("%4s", number);
    }
    public String converter(String format, int number) {
        boolean negative = false;
        //if negative, convert to positive
        if(number<0) {
            negative = true;
            number*=-1;
        }
        String convert = String.valueOf(number);
        String converted = "";


        char[] digits = convert.toCharArray();

        for (char digit : digits) {
            String binary = Integer.toBinaryString(Character.getNumericValue(digit));
            converted = converted.concat(String.format(format, binary)
                    .replace(' ', '0'));
        }

        //if negative, add negative sign at Least significant
        if(negative) {
            converted = converted.concat(String.format(format, "1101")
                    .replace(' ', '0'));
        }

        return converted;
    }

    public String toDenselyPackedBCD(int number) {
        char[] packed = String.valueOf(this.toPackedBCD(number)).toCharArray();
        char[] keys = new char[]{ packed[0], packed[4], packed[8] }; // iea

        if (Arrays.equals(keys, new char[]{'0', '0', '0'})) {
            return new String(new char[]{
                packed[1], packed[2], packed[3],            // bcd
                packed[5], packed[6], packed[7],            // fgh
                '0', packed[9], packed[10], packed[11]      // 0jkm
            });
        } else if (Arrays.equals(keys, new char[]{'0', '0', '1'})) {
            return new String(new char[]{
                packed[1], packed[2], packed[3],            // bcd
                packed[5], packed[6], packed[7],            // fgh
                '1', '0', '0', packed[11]                   // 100m
            });
        } else if (Arrays.equals(keys, new char[]{'0', '1', '0'})) {
            return new String(new char[]{
                packed[1], packed[2], packed[3],            // bcd
                packed[9], packed[10], packed[7],           // jkh
                '1', '0', '1', packed[11]                   // 100m
            });
        } else if (Arrays.equals(keys, new char[]{'0', '1', '1'})) {
            return new String(new char[]{
                packed[1], packed[2], packed[3],            // bcd
                '1', '0', packed[7],                        // 10h
                '1', '1', '1', packed[11]                   // 111m
            });
        } else if (Arrays.equals(keys, new char[]{'1', '0', '0'})) {
            return new String(new char[]{
                packed[9], packed[10], packed[3],           // jkd
                packed[5], packed[6], packed[7],            // fgh
                '1', '1', '0', packed[11]                   // 110m
            });
        } else if (Arrays.equals(keys, new char[]{'1', '0', '1'})) {
            return new String(new char[]{
                packed[5], packed[6], packed[3],            // fgd
                '0', '1', packed[7],                        // 01h
                '1', '1', '1', packed[11]                   // 111m
            });
        } else if (Arrays.equals(keys, new char[]{'1', '1', '0'})) {
            return new String(new char[]{
                packed[9], packed[10], packed[3],           // jkd
                '0', '0', packed[7],                        // 00h
                '1', '1', '1', packed[11]                   // 111m
            });
        } else if (Arrays.equals(keys, new char[]{'1', '1', '1'})) {
            return new String(new char[]{
                '0', '0', packed[3],                        // 00d
                '1', '1', packed[7],                        // 11h
                '1', '1', '1', packed[11]                   // 111m
            });
        }

        return "";
    }
}
