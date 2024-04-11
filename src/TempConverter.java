public class TempConverter {
    static class Converter {

        public static double convertTemp (double celsius) {
            return (celsius * 9/5) + 32;
        }
        public static double convertTemp (double celsius, boolean toKelvin) {
            if (toKelvin) {
                return celsius + 273.15;
            } else {
                return convertTemp(celsius);
            }
        }

    }
    public static void main(String[] args) {
        System.out.println("Temperature in Fahrenheit is " +  Converter.convertTemp(25));
        System.out.printf("Temperature in Kelvin is  " +  Converter.convertTemp(25, false));
    }
}
