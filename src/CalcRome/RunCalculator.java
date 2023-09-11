import java.util.Scanner;

public class RunCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[]subStr = str.split(" ");

        if(subStr.length != 3){
            System.out.println("You entered incorrect data");
            return;
        }

        int numbersType1 = itCorrectNumbers(subStr[0]);
        int numbersType2 = itCorrectNumbers(subStr[2]);
        int arifmeticOperationType = ArifmeticOperations.getArifmeticOperationType(subStr[1]);

        if(numbersType1 < 0){
            System.out.println("не удалось распознать данное число " + subStr[0]);
        } else if(numbersType2 < 0){
            System.out.println(" не удалось распознать данное число"+ subStr[2]);
        } else if(arifmeticOperationType < 0){
            System.out.println(" Неизвестный тип арифметической операции" + subStr[1]);
        } else if(numbersType1 != numbersType2){
            System.out.println("Калькулятор не поддерживает вычисление с одновременным использованием арабских и римских цифр");
            return;
        }
        int number1 = getNumber(subStr[0], numbersType1);
        int number2 = getNumber(subStr[2], numbersType2);

        if(number1 == 0 || number1 > 10){
            System.out.println("Калькулятор понимает цифры в диапозоне от 1 до 10, вы ввели число: " + number1);
            return;
        } else if(number2 ==0 || number2 > 10){
            System.out.println("Калькулятор понимает цифры в диапозоне от 1 до 10, вы ввели число: " + number2);

        }
        int finalValue = calculateValue(number1, number2, arifmeticOperationType);
        if(numbersType1 == 1){
            System.out.println(RomeNumbers.getRomeNumbers(finalValue));
        }
        else {
            System.out.println(finalValue);
        }
    }
    public static int getNumber(String numberStr, int numberType){
        int number = 0;

        if(numberType == 1) {
            number = RomeNumbers.getArabNumber(numberStr);
        }
        else {
            number = Integer.parseInt(numberStr);
        }
        return number;
    }


    private static int calculateValue(int number1, int number2, int arifmeticOperationType) {
        int finalValue = 0;
        switch (arifmeticOperationType){
            case(0): finalValue = number1 + number2;
            break;
            case(1): finalValue = number1 - number2;
            break;
            case(2): finalValue = number1 * number2;
            break;
            case(3): finalValue = number1 / number2;
            break;
        }
        return finalValue;

    }
    private static int itCorrectNumbers(String strNumber) {
        int numbersType = -1;

        if(ArabNumbers.thisArabicNums(strNumber)){
            numbersType = 0;
        }
         else if(RomeNumbers.thisIsRomeNumbers(strNumber)){
             numbersType = 1;
        } return numbersType;
    }
}
