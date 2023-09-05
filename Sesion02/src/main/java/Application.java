import e1.Singleton;
import e2.AnalysisLibrary;
import e2.StockMarketAdapter;
import e2.StockMarketReport;
import e3.TextEditor;
import r1.Motor;
import r1.MotorElectricoAdapter;

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

        System.out.println("");
        System.out.println("--------------------R1-------------");
        Motor motor = new MotorElectricoAdapter();
        motor.encender();
        motor.acelerar();
        motor.apagar();

        System.out.println("--------------------E3-------------");
        TextEditor textEditor = new TextEditor();

        textEditor.onPressOption();
        textEditor.onPressSaveButton();
        textEditor.onShorOut();

    }
}
