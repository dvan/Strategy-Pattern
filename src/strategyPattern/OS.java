package strategyPattern;

public class OS {

    public OSFinder getInstance() {
        final boolean isWin = System.getProperty("os.name").startsWith(
                "Windows");
        final boolean isMac = System.getProperty("os.name").startsWith("Mac");
        final boolean isLinux = System.getProperty("os.name").startsWith(
                "Linux");

        if (isWin) {
            return new Win();
        } else if (isMac) {
            return new Mac();
        } else if (isLinux) {
            return new Linux();
        } else {
            System.out.println("OS unbekannt");
        }
        return null;
    }

    public static void main(String[] args) {
        OS str = new OS();
        OSFinder inter = str.getInstance();
        inter.printOS();
    }
} 
