package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide integers to add");
        }
	catch (ArraIndexOutOfBoundsException e) {
            System.err.println(“Array not enough Arguments“);
    }

    private static int addArguments(String[] args) {
        int sum = 0;
	if (args.lenght > 0){
		for (String v: args){
		sum = sum + Integer.valueOf(v);
		}
	}
    }
}
