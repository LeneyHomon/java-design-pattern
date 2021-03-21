package objectAdapter;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello by object adapter");
        p.printWeak();
        p.printStrong();
    }
}
