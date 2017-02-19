public class FurtherReflection {
    public static void main(String[] args) {
        System.out.println("Please enter a class name");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        Class cls = Class.forName(input);
    }
}