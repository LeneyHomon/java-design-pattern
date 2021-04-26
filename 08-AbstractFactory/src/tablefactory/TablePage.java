package tablefactory;

import factory.Item;
import factory.Page;

public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<html><head><title>" + title + "</title></head>\n");
        stringBuilder.append("<body>\n");
        stringBuilder.append("<h1>" + title + "</h1>\n");
        stringBuilder.append("<table border=\"3\">\n");
        for (Item item : content) {
            stringBuilder.append("<tr>" + item.makeHtml() + "</tr>");
        }
        stringBuilder.append("</table>\n");
        stringBuilder.append("<hr><address>" + author + "</address></hr>");
        stringBuilder.append("</body></html>\n");
        return stringBuilder.toString();
    }
}
