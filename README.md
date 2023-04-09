# Binary Coded Decimal (BCD) Generator and Translator
This is a Java application that allows users to convert decimal numbers into various forms of Binary Coded Decimal (BCD) representations. The calculator supports three different forms of BCD conversion: unpacked, packed, and densely packed. The user can also choose to output the results to a text file.

# Getting Started
## Prerequisites
To run this application, you will need to have the following installed on your system:
- Java Runtime Environment (JRE) 8 or later

Afterwards, simply download and run the JAR file under the [Releases](https://github.com/ganmatthew/BCDCalculator/releases) page.

# Usage
To use the calculator, simply enter either a decimal number to get its value in Unpacked, Packed, or Densely-Packed BCD, or enter a Densely-Packed BCD to get its value in decimal. You can also reset the input and output and export the results to a `txt` file.

The following BCD conversion formats are supported:

- **Unpacked:** Each decimal digit is converted to its binary representation using four bits. The result is a sequence of binary digits where each decimal digit is represented by four bits.
- **Packed:** Each decimal digit is converted to its binary representation using four bits. The resulting binary digits are packed into groups of four, resulting in a shorter sequence of binary digits.
- **Densely Packed:** Each decimal digit is converted to its binary representation using three bits. The resulting binary digits are packed into groups of three, resulting in an even shorter sequence of binary digits.

Created as part of coursework for CSARCH2 (Introduction to Computer Organization and Architecture 2) at De La Salle University-Manila

# Credits
- [@ganmatthew](https://github.com/ganmatthew)
- [@manoloenriquez](https://github.com/manoloenriquez)
- [@migsmo](https://github.com/migsmo)
- [@nicscheng](https://github.com/nicscheng)
- [@RANrvz](https://github.com/RANrvz)
