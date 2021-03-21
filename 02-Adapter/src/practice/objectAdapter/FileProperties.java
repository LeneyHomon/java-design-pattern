package practice.objectAdapter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties extends FileIO {
    Properties p = new Properties();

    @Override
    public void readFromFile(String filename) throws IOException {
        p.load(new FileInputStream(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        p.store(new FileOutputStream(filename), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        p.setProperty(key, value);
    }

    @Override
    public void getValue(String key) {
        p.getProperty(key);
    }
}
