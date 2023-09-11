public class ArifmeticOperations {

    public static int getArifmeticOperationType(String ArifmeticOperation){
        int ArifmeticOperationType = -1;

        switch (ArifmeticOperation){
            case ("+"): ArifmeticOperationType = 0;
            break;
            case ("-"): ArifmeticOperationType = 1;
            break;
            case ("*"): ArifmeticOperationType = 2;
            break;
            case ("/"): ArifmeticOperationType = 3;
            break;
        }
        return ArifmeticOperationType;
    }
}
