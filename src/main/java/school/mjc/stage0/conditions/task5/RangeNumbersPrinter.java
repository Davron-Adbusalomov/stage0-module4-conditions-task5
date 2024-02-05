package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
    public void printRange(int number) {
        String message;
        switch (number) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                message = "Number is between 1 and 5";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                message = "Number is between 6 and 10";
                break;
            default:
                message = "Out of range";
        }
        System.out.println(message);
    }

    public static void main(String[] args) {
        RangeNumbersPrinter printer = new RangeNumbersPrinter();
        printer.printRange(3);  // Example usage
        printer.printRange(8);
        printer.printRange(12);
    }
}
