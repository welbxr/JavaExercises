import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberFormatter
{
    static Scanner input = new Scanner(System.in);
    private final List<String> stringArray = new ArrayList<>();
    private final List<String> formatedNumber = new ArrayList<>();
    private String stringInput;
    private int option;
    private String answer;

    // Essa string se trata de um regex, com formatação que segue
    // o padrão de núemros de telefones fixos e celulares no Brasil.
    // Exs: (nn)nnnn-nnnn, nnnn-nnnn, (nn)nnnnn-nnnn, nnnnn-nnnn

    public void run()
    {
        getInput();
        convertStringToList();
        removeMessFromStringList();
        checkSize();
        showAnwser();
        showsNumberType();
    }

    private void getInput()
    {
        System.out.print("\n Insira o valor a ser formatado: \n");
        this.stringInput = input.next();
    }

    private void convertStringToList()
    {
        for (int i=0; i < stringInput.length(); i++)
        {
            stringArray.add(stringInput.substring(i, i+1));
        }
    }

    private void removeMessFromStringList()
    {
        stringArray.removeIf(s -> !s.matches("^[0-9]$"));
    }

    private static void showIncompatibility()
    {
        System.out.println("Entrada inválida!");
    }

    private void checkSize() {
        option = stringArray.size();
        switch (option) {
            case 8  -> landlineNoDDDRegex();
            case 9  -> phoneNoDDDRegex();
            case 10 -> landlineWithDDDRegex();
            case 11 -> phoneWithDDDRegex();
            default -> showIncompatibility();
        }
    }

    private void landlineNoDDDRegex()
    {
        answer = String.join("", stringArray)
        .replaceAll("(\\d{4})(\\d{4})","$1-$2");
    }
    private void landlineWithDDDRegex()
    {
        answer = String.join("",stringArray).replaceAll
        ("(\\d{2})(\\d{4})(\\d{4})", "($1)$2-$3");
    }
    private void phoneNoDDDRegex()
    {
        answer = String.join("", stringArray).replaceAll
        ("(\\d{5})(\\d{4})","$1-$2");
    }
    private void phoneWithDDDRegex()
    {
        answer = String.join("",stringArray).replaceAll
        ("(\\d{2})(\\d{5})(\\d{4})", "($1)$2-$3");
    }

    private void showAnwser()
    {
        System.out.println(this.answer);
    }

    private void showsNumberType()
    {
        if (option == 8 || option == 10)
        {
            System.out.println("O núemro informado é um telefone fixo!");
        }   else {
            System.out.println("O número informado é um celular móvel!");
        }
    }

    public NumberFormatter() {}

}
