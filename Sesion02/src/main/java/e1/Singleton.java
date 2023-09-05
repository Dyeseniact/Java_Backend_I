package e1;

public class Singleton {
    private static Singleton instance;
    /* entodo el proyecto esta asignada y se mantiene estatica */
    public String value;

    private Singleton (String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value
    ) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
