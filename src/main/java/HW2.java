public class HW2 {
    public static void main(String[] args) {

        int num1=-30;
        int num2=20;
        int num3=10;
        int num4=7;
        String str = "Hello, world";
        int year = 1984;

        System.out.println(checkSum(num1, num2)  ? "TRUE" : "FALSE2" );
        checkSign(num3);
        checkSign2(num3);
        System.out.println(checkSign2(num3) ? "More Tnan 0" : "Less than 0");
        printString(str, num4);
        System.out.println(checkBissextile(year) ? ("The year " + year + " is bissextile " ) : ("The year " + year + " is NOT bissextile"));

    }

    private static boolean checkBissextile(int year) {
        return ( (year % 4 == 0 & year % 100 != 0) ^ year % 400 ==0  );

    }

    private static void printString(String str, int num4) {
        for (int i = 0; i < num4; i++){
            System.out.println(str);
        }
    }

    private static boolean checkSign2(int num3) {
        return num3 > 0;
    }

    private static void checkSign(int num3) {
        if ( num3 >= 0 ) {
            System.out.println("The num3 is positive");
        } else {
            System.out.println("The num3 negative");
        }
    }

    private static boolean checkSum(int num1, int num2) {
        return (num1+num2 >= 10 & num1+num2 <= 20 );
    }
}
