import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {
    private static ConfigManager instance;
    private Properties config;

    private ConfigManager() {
        this.config = loadConfig();
    }

    public static synchronized ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    private Properties loadConfig() {
        Properties config = new Properties();
        try {
            FileInputStream in = new FileInputStream("config.properties");
            config.load(in);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return config;
    }

    public Properties getConfig() {
        return this.config;
    }
}
