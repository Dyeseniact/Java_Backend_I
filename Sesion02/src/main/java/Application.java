import e1.Singleton;
import e2.AnalysisLibrary;
import e2.StockMarketAdapter;
import e2.StockMarketReport;
import e3.TextEditor;
import r1.Motor;
import r1.MotorElectricoAdapter;
import r2.AddOrRemove10;
import r2.Command2;
import r2.IncrementOne;
import r2.MultiplyOrSplitBy2;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

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

        System.out.println("");
        System.out.println("--------------------R2-------------");

        Scanner sc = new Scanner(System.in);

        Stack<Command2> stack = new Stack<>();

        Command2 addOrRemove10 = new AddOrRemove10();
        Command2 multiplyOrSplitBy2 = new MultiplyOrSplitBy2();
        Command2 incrementOne = new IncrementOne();


        int counter = 0;

        int option = 0;

        while (option != 5) {
            System.out.println("\nValor actual: " + counter);
            System.out.println("Elige alguna opción:");
            System.out.println("1. Incrementa en uno el contador");
            System.out.println("2. Multiplica por 2 el contador");
            System.out.println("3. Añade 10 al contador");
            System.out.println("4. Deshacer último cambio");
            System.out.println("5. Salir");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    counter = incrementOne.execute(counter);
                    stack.add(incrementOne);
                    break;
                case 2:
                    counter = multiplyOrSplitBy2.execute(counter);
                    stack.add(multiplyOrSplitBy2);
                    break;
                case 3:
                    counter = addOrRemove10.execute(counter);
                    stack.add(addOrRemove10);
                    break;
                case 4:
                    try {
                        Command2 undo = stack.pop();
                        if (undo != null) {
                            counter = undo.unexecute(counter);
                        }
                    } catch (EmptyStackException e) {
                        System.out.println("El counter esta vacio");
                    }
                    break;
            }
        }

    }
}
