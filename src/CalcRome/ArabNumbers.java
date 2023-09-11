public class ArabNumbers {
    public static boolean thisArabicNums(String strNumber){

        boolean thisArabicNums = true;

        char[] strToArray = strNumber.toCharArray();

        for (int i = 0; i < strToArray.length; i++) {
            if(!ArabNumbers.thisArabNumber(strToArray[i]))
            {
                thisArabicNums = false;
            }
        }
        return thisArabicNums;

    }



    public static boolean thisArabNumber(char strNum){
        boolean isArabNumber = false;

        switch (strNum) {
            case ('1'): isArabNumber = true;
            break;
            case ('2'): isArabNumber = true;
            break;
            case ('3'): isArabNumber = true;
            break;
            case ('4'): isArabNumber = true;
            break;
            case ('5'): isArabNumber = true;
            break;
            case ('6'): isArabNumber = true;
            break;
            case ('7'): isArabNumber = true;
            break;
            case ('8'): isArabNumber = true;
            break;
            case ('9'): isArabNumber = true;
            break;
            case ('0'): isArabNumber = true;
            break;

        }
        return isArabNumber;
    }
}
