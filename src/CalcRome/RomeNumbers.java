 class RomeNumbers {

     static int getArabNumber(String romeNumber){
        int arabNumber = 0;;

        switch (romeNumber){
            case("I") : arabNumber = 1;
                break;
            case("II") : arabNumber = 2;
                break;
            case("III") : arabNumber = 3;
                break;
            case("IV") : arabNumber = 4;
                break;
            case("V") : arabNumber = 5;
                break;
            case("VI") : arabNumber = 6;
                break;
            case("VII") : arabNumber = 7;
                break;
            case("VIII") : arabNumber = 8;
                break;
            case("IX") : arabNumber = 9;
                break;
            case("X") : arabNumber = 10;
                break;
        }
        return arabNumber;
    }
     public static String getRomeNumbers(int numbers) throws Exception{
        String romeNumbers = "";
        if (numbers <=0 ){
            throw new Exception("в римской системе нет отрицательных чисел");
        }
         if(numbers >=100){
            romeNumbers = "C";
            int difference = numbers-100;
            romeNumbers = romeNumbers + getRomeNumber(Integer.toString(difference));
        } else if(numbers>= 90){
            romeNumbers = "XC";
            int difference = numbers - 90;
            romeNumbers = romeNumbers + getRomeNumber(Integer.toString(difference));
        } else if(numbers>=80){
            romeNumbers = "LXXX";
            int difference = numbers-80;
            romeNumbers = romeNumbers + getRomeNumber(Integer.toString(difference));

        } else if(numbers>=70){
            romeNumbers = "LXX";
            int difference = numbers - 70;
            romeNumbers = romeNumbers + getRomeNumber(Integer.toString(difference));
        } else if(numbers>=60){
            romeNumbers = "LX";
            int difference = numbers - 60;
            romeNumbers= romeNumbers + getRomeNumber(Integer.toString(difference));
        } else if(numbers>=50){
            romeNumbers = "X";
            int difference = numbers - 50;
            romeNumbers = romeNumbers + getRomeNumber(Integer.toString(difference));

        }
        else if(numbers>=40){
            romeNumbers = "XL";
            int difference = numbers - 40;
            romeNumbers = romeNumbers + getRomeNumber(Integer.toString(difference));
        }
        else if(numbers>=30){
            romeNumbers = "XXX";
            int difference = numbers - 30;
            romeNumbers = romeNumbers + getRomeNumber(Integer.toString(difference));
        }
        else if(numbers>=20){
            romeNumbers = "XX";
            int difference = numbers - 50;
            romeNumbers = romeNumbers + getRomeNumber(Integer.toString(difference));
        }
        else if(numbers>=10){
            romeNumbers = "X";
            int difference = numbers - 50;
            romeNumbers = romeNumbers + getRomeNumber(Integer.toString(difference));
        }
        else {
            romeNumbers = getRomeNumber(Integer.toString(numbers));
        }
        return romeNumbers;
    }

     public static String getRomeNumber(String arabNumber) {
        String romeNumber  = " ";
        switch(arabNumber){
            case("1"): romeNumber = "I";
                break;
            case("2"): romeNumber = "II";
                break;
            case("3"): romeNumber = "III";
                break;
            case("4"): romeNumber = "IV";
                break;
            case("5"): romeNumber = "V";
                break;
            case("6"): romeNumber = "VI";
                break;
            case("7"): romeNumber = "VII";
                break;
            case("8"): romeNumber = "VIII";
                break;
            case("9"): romeNumber = "IX";
                break;
            case("10"): romeNumber = "X";
                break;
        }
        return romeNumber;

    }
     public static boolean thisIsRomeNumbers(String strNumber){
        boolean thisIsRomeNumbers = false;

        switch (strNumber){
            case("I"): thisIsRomeNumbers = true;
                break;
            case("II"): thisIsRomeNumbers = true;
                break;
            case("III"): thisIsRomeNumbers = true;
                break;
            case("IV"): thisIsRomeNumbers = true;
                break;
            case("V"): thisIsRomeNumbers = true;
                break;
            case("VI"): thisIsRomeNumbers = true;
                break;
            case("VII"): thisIsRomeNumbers = true;
                break;
            case("VIII"): thisIsRomeNumbers = true;
                break;
            case("IX"): thisIsRomeNumbers = true;
                break;
            case("X"): thisIsRomeNumbers = true;
                break;

        } return  thisIsRomeNumbers;
    }


}
