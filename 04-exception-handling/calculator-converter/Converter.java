import java.util.*;

public class Converter {
    Scanner scanner = new Scanner(System.in);
    String values;
    ArrayList<Double> arrayListNumbers = new ArrayList<>();
    int option = -1;

    public void startMenu() {
        while (option != 5) {
            System.out.println();
            System.out.println("Escolha uma opção");
            System.out.println();
            System.out.println("1. - Adição");
            System.out.println("2. - Subtração");
            System.out.println("3. - Multiplicação");
            System.out.println("4. - Divisão");
            System.out.println("5. - Sair");
            System.out.println();
            option = scanner.nextInt();

            if (option > 5 || option < 1) {
                System.out.println("Selecione uma opção válida!");
                continue;
            }

            if (option == 5) break;

            this.requestValues();
            this.splitString();   // já converte direto para Double
            this.showValues();
        }
    }

    public void requestValues() {
        System.out.println();
        System.out.println("Informe os valores da operação separados por vírgula.");
        System.out.println();
        values = scanner.next();
    }

    // Converte direto para Double usando ponto como separador decimal
    public void splitString() {
        arrayListNumbers.clear();
        String[] arrayValue = values.split(",");
        for (String val : arrayValue) {
            arrayListNumbers.add(Double.parseDouble(val.trim()));
        }
    }

    public Double consumeValues() {
        Double result = this.arrayListNumbers.removeFirst();
        var selectedOption = Calculate.values()[option - 1];

        while (!arrayListNumbers.isEmpty()) {
            Double nextValue = this.arrayListNumbers.removeFirst();
            result = selectedOption.getCaclulate().apply(result, nextValue);
        }
        return result;
    }

    public void showValues() {
        System.out.printf("\nO resultado é: %.5f\n", this.consumeValues());
    }
}