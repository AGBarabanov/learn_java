package com.barabanovanton;

public class Main {
    public static void main(String[] args) {
        //Целые числа
        byte varByte = 1; //-128 .. 127
        short varShort = 1; //-32768 .. 32767
        int varInt = 1;
        long varLong = 1L;
        //

        //Числа с плававющей точкой
        float varFloat = 0.0f;
        double varDouble = 0.0d;
        //

        //Логический
        boolean varBool = true; //true or false
        //

        //Символьный
        char varChar = 'c';
        //

        //Класс String (ссылочный тип данных)
        String varStr = "Hello world!";
        //

        //ОПЕРАТОРЫ
        // 1. Присвоение
        int varInt0 = 0;

        // 2. Математические
        varInt0 = 7-4;
        varInt0 = 7+4;
        varInt0 = 7*4;
        varInt0 = 7/4; // Целочисленное деление
        varInt0 = 7%4; // Остаток от деления
        varInt0 = varInt++;

        // 3. Сравнения >, <, >=, <=, !=, ==

        // 4. Логиские &&(и), ||(или), !(не)
        if ((age >= 30) && (sex.equals("female"))){
        }

        if (varStr != null && varStr.length() == 10){
            System.out.println("Строка состоит из 10 символов");
        } else if (varStr != null && varStr.length() == 13) {
            System.out.println("Строка состоит из 13 символов");
        }
        else {
            System.out.println("Строка состоит из другого количества символов");
        }
    }
}
