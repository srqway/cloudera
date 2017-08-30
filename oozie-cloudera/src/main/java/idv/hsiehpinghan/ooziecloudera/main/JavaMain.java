package idv.hsiehpinghan.ooziecloudera.main;

public class JavaMain {
    public static void main(String[] args) {
        System.out.println("Demo Java Main");

        System.out.println("# Arguments: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument[" + i + "]: " + args[i]);
        }
    }
}
