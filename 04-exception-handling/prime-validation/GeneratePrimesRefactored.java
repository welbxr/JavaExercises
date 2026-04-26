import java.util.Scanner;

Scanner input = new Scanner(System.in, System.getProperty("stdin.encoding"));

public class GeneratePrimesRefactored
{

    private static boolean[] numberPrimeList;
    private static int[] primeNumbers;
    private int userInput = input.nextInt();

    public void readUserInput()
    {
        System.out.println("Identificador de Números Primos");
        System.out.println(" ");
        System.out.println("Digite um número Inteiro");
        userInput = input.nextInt();
    };

    public static boolean CheckUserValue(int maxValue)
    {
        int minimumValue = 2;
        return maxValue >= minimumValue;
    };

    public static int[] userAnswer(int userInput)
    {
      if (CheckUserValue(userInput))
        return new int[0];
      else
      {
        createNumberList(userInput);
        determineMultiples();
        putPrimeNumbersInList();
        return primeNumbers;
      }
    };

    private static void createNumberList(int maxValue)
    {
        numberPrimeList = new boolean[maxValue + 1];
        for (int i = 2; i < numberPrimeList.length; i++)
            numberPrimeList[i] = false;
    };

    private static void determineMultiples()
    {
        int delimiter = iterationDelimiter();
        for (int i = 2; i < numberPrimeList.length; i++)
            if (isNumberPrime(i))
                calculateMultiplesOf(i);
    }

    private static int iterationDelimiter()
    {
        // Cada Múltiplo do Array tem um Fator Primo,
        // que é menor ou igual a raiz quadrada do tamanho
        // do array, então nós não precisamos percorrer
        // todos os múltiplos dos números maiores que aquela raiz.
      double iterationDelimiter = Math.sqrt(numberPrimeList.length);
      return (int) iterationDelimiter;
    };

    private static void calculateMultiplesOf(int i)
    {
        for (int multiples = 2*i;
             multiples <= numberPrimeList.length;
             multiples +=1)
            numberPrimeList[multiples] = true;
    }

    public static boolean isNumberPrime(int i)
    {
        return !numberPrimeList[i];
    }

    private static void putPrimeNumbersInList()
    {
        primeNumbers = new int[remainingNumbers()];
        for (int ii = 0, i = 2; i < numberPrimeList.length; i++)
            if (isNumberPrime(i))
                primeNumbers[ii++] = i;
    }

    private static int remainingNumbers()
    {
        int count = 0;
        for (int i = 2; i < numberPrimeList.length; i++)
            if (isNumberPrime(i))
                count++;
        return count;
    }
}

void main()
{
    GeneratePrimesRefactored test = new GeneratePrimesRefactored();

    test.readUserInput();
    test.CheckUserValue(test.userInput);
    test.userAnswer(test.userInput);
    System.out.println(test.primeNumbers);

};
