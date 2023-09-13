package com.barabanovanton;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Массивы
        int[] intArr = new int[]{1, 421, 123};
        int[] intArr0 = new int[5];
        intArr0[0] = 1;
        intArr0[1] = 421;
        intArr0[2] = 123;
        intArr0[3] = -100;
        intArr0[4] = 21;
        System.out.println("Длина массива " + intArr0.length);
        System.out.println("Массив " + Arrays.toString(intArr0));

        //Циклы
        for(int i = 0; i < intArr0.length; i++){
            if(intArr0[i] == -100){
                System.out.println(intArr0[i]);
                break;                              //Заканчивает весь цикл
                                                    // continue - Заканчивает итерацию
            }
            System.out.println("Next iteration");
        }

        for (int element : intArr0) {
            System.out.println(element);
        }

        int indexForLoop = 0;
        while (indexForLoop < intArr0.length){
            System.out.println(intArr0[indexForLoop]);

            indexForLoop++;
        }

//        В любом случае будет одна итерация
//        do {
//            do smth
//        }while ("true");


        //КОЛЛЕКЦИИ

        //List<Integer> intList = new ArrayList<>();
        List<Integer> intList = List.of(1, 421, 123);
        intList.add(1);
        intList.remove((Integer) 1);

        //Set<String> stringSet = new HashSet<>();
        Set<String> stringSet = Set.of("Anton", "Vasya");       //Могут храниться только уникальные обьекты

        //Map<String, People> exampleMap = new HashMap<>();
        Map<String, People> exampleMap = Map.of(
                "1234", new People(),
                "5432", new People()
                );
        exampleMap.get("1234");
        //exampleMap.containsKey("5432");
        Set<String> keySet = exampleMap.keySet();
        Collection<People> values = exampleMap.values();





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
