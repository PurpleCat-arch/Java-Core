public class BaseConverter {
    public static void main(String[] args) {
        int decimalNumber = 255;
        int targetBase = 16;
        
        System.out.println("Decimal " + decimalNumber + " in base " + targetBase + " is: " 
                           + decimalToBase(decimalNumber, targetBase));
    }

    public static String decimalToBase(int num, int base) {
        if (num == 0) {
            return "0";
        }
        
        String result = "";
        boolean isNegative = num < 0;
        num = Math.abs(num);

        while (num > 0) {
            int remainder = num % base;
            if (remainder < 10) {
                result = remainder + result;
            } else {
                result = (char) ('A' + (remainder - 10)) + result;
            }
            num /= base;
        }

        return isNegative ? "-" + result : result;
    }
}
