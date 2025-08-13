public class Main {
    public static void main(String[] args) {

        Logger log1 = Logger.getInstance(); // gets the logger
        Logger log2 = Logger.getInstance(); // gets it again

        log1.log("Hello from log1!");
        log2.log("Hello from log2!");

        if (log1 == log2) {
            System.out.println("Both log1 and log2 are the SAME Logger! 🎉");
        } else {
            System.out.println("Oops! Something went wrong.");
        }
    }
}
