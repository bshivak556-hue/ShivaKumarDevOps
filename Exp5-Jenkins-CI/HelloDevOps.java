public class HelloDevOps {
    public static String message() {
        return "Hello from Jenkins CI!";
    }

    public static void main(String[] args) {
        System.out.println(message());
        if (args.length > 0 && "--test".equals(args[0])) {
            if (!"Hello from Jenkins CI!".equals(message())) {
                throw new AssertionError("Unexpected message");
            }
            System.out.println("TEST PASSED");
        }
    }
}
