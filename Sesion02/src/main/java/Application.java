import e1.Singleton;
import e2.AnalysisLibrary;
import e2.StockMarketAdapter;
import e2.StockMarketReport;

public class Application {
    public static void main(String[] args) throws Exception {
        System.out.println("----------------E1-----------------");
        Singleton singleton = Singleton.getInstance("Bedu");
        Singleton singleton2 = Singleton.getInstance("Beto");

        System.out.println(singleton.value);
        System.out.println(singleton2.value);

        System.out.println("------------------E2---------------");

        StockMarketReport report = new StockMarketAdapter();
        String json = report.download();

        AnalysisLibrary library = new AnalysisLibrary();
        library.analyzeInformation(json);

    }
}
