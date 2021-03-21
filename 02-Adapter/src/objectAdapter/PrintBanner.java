package objectAdapter;

public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String s) {
        this.banner = new Banner(s);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
