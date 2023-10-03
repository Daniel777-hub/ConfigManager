public class Main {
    public static void main(String[] args) {
        ConfigManager configManager = ConfigManager.getInstance();
        System.out.println(configManager.getConfig());
    }
}
