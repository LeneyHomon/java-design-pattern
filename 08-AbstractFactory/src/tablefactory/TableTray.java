package tablefactory;

import factory.Item;
import factory.Tray;

public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<td>\n");
        stringBuilder.append("<table border=\"2\"><tr>\n");
        stringBuilder.append("<td colspan=\"" + tray.size() + "\" align=\"center\">" + caption + "</td>\n");
        stringBuilder.append("</tr>\n");
        stringBuilder.append("<tr>\n");
        for (Item item : tray) {
            stringBuilder.append(item.makeHtml());
        }
        stringBuilder.append("</tr></table>\n");
        stringBuilder.append("</td>\n");
        return stringBuilder.toString();
    }
}
