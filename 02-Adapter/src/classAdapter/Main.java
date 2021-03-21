package classAdapter;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello by class adapter");
        p.printWeak();
        p.printStrong();
    }
}
