public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задания 1");

        int money = 1000000000;
        System.out.println("Было " + money + " монеты");
        money = money - 100000000;
        System.out.println("Теперь осталось " + money + " монетов");

        byte a = 6;
        byte b = 4;
        System.out.println("Было утро в " + a + " часов");
        System.out.println(a + b + " часов теперь");

        short c = 100;
        short d = 100;
        System.out.println("short c = " + c + " short d = " + d);
        c = 150;
        System.out.println(c);

        long e = 1000L;
        long f = 2000L;
        System.out.println("long e = " + e + " long f = " + f);
        f = f + 1000L;
        System.out.println("f = f + 1000 " + f);

        float one = 2.5f;
        float two = 1.2f;
        System.out.println("float = " + one + two);

        double oneDouble = 1.25;
        oneDouble = oneDouble + 1.25;
        System.out.println("double = " + oneDouble);

        //Задача 2
        System.out.println("Задания 2");

        double variable1 = 27.12;
        System.out.println(variable1);

        long variable2 = 987678965549L;
        System.out.println(variable2);

        float variable3 = 2.786f;
        System.out.println(variable3);

        boolean variable4 = false;
        System.out.println(variable4);

        char variable5 = 569;
        System.out.println(variable5);

        short variable6 = -159;
        System.out.println(variable6);

        int variable7 = 27897;
        System.out.println(variable7);

        byte variable8 = 67;
        System.out.println(variable8);

        //Задача 3
        System.out.println("Задания 3");

        short pupilsInFirstClass = 23;
        System.out.println("у Людмилы Павловны " + pupilsInFirstClass + " ученика");

        short pupilsInSecondClass = 27;
        System.out.println("у Анны Сергеевны " + pupilsInSecondClass + " ученика");

        short pupilsInThirdClass = 30;
        System.out.println("у Екатерины Андреевны " + pupilsInThirdClass + " ученика");

        int totalTeacherStudents = pupilsInFirstClass + pupilsInSecondClass + pupilsInThirdClass;
        System.out.println("Общие " + totalTeacherStudents + " учеников");

        short totalPapersTeachers = 480;
        System.out.println("Три учительницы закупили все вместе " + totalPapersTeachers + " листов бумаги на все три класса");

        int everyStudent = totalPapersTeachers / totalTeacherStudents;
        System.out.println("На каждого ученика рассчитано " + everyStudent + " листов бумаги");

        //Задача 4
        System.out.println("Задания 4");
        byte bottles = 16;
        byte minutes = 2;
        int productivityPerMinute = bottles / minutes;
        byte twentyMinutes = 20;
        System.out.println("За " + twentyMinutes + " минут машина произвела бутылок " + productivityPerMinute * twentyMinutes + " штук");
        short minutesInDay =  24 * 60;
        System.out.println("За " + minutesInDay + " минут машина произвела бутылок " + productivityPerMinute * minutesInDay + " штук");
        int minutesInThreeDays = 3 * minutesInDay;
        System.out.println("За " + minutesInThreeDays + " минут машина произвела бутылок " + productivityPerMinute * minutesInThreeDays + " штук");
        int minutesInMonth = 10 * minutesInThreeDays;
        System.out.println("За " + minutesInMonth + " минут машина произвела бутылок " + productivityPerMinute * minutesInMonth + " штук");

        //Задача 5
        System.out.println("Задания 5");

        byte totalCans = 120;
        byte whiteCansPerClass = 2;
        byte brownCansPerClass = 4;
        int totalClasses = totalCans/(whiteCansPerClass + brownCansPerClass);
        int totalWhiteCans = totalClasses * whiteCansPerClass;
        int totalBrownCans = totalClasses * brownCansPerClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        //Задача 6
        System.out.println("Задание 6");
        int bananas = 5;
        bananas = bananas * 80;
        System.out.println("Бананы " + bananas + " грамм");
        int milk = 2;
        milk = milk * 105;
        System.out.println("Молоко " + milk + " грамм");
        int iceCream = 100;
        int briquettes = iceCream * 2;
        System.out.println("Морожное пломбир " + briquettes + " грамм");
        int egg = 4;
        int oneEggGramm = egg * 70;
        System.out.println("Яйца сырые " + oneEggGramm + " грамм");
        int totalWeight = bananas + milk + briquettes + oneEggGramm;
        System.out.println("Общий вес " + totalWeight + " грамм");

        //Задача 7
        System.out.println("Задание 7");
        int resetWeight = 7000;
        int lostWeight = 250;
        int lossWeight2 = 500;
        int totalWeight1 = resetWeight / lostWeight;
        int totalWeight2 = resetWeight / lossWeight2;
        int totalMidWeight = totalWeight1 + totalWeight2;
        int totalMid2Weight = totalMidWeight / 2;
        System.out.println("В среднем уйдет " + totalMid2Weight + " дней");


        //Задача 8
        System.out.println("Задание 8");
        int mashaEmployeeSalary = 67760;
        int denisEmployeeSalary = 83690;
        int cristinaEmployeeSalary = 76230;
        int year = 12;
        int totalOneYearBefore1 = mashaEmployeeSalary * 12;
        int mashaEmployeeNew = (mashaEmployeeSalary * 10) / 100;
        int mashaEmployeeUpSalary = mashaEmployeeNew + mashaEmployeeSalary;
        int totalOneYearAfter1 = mashaEmployeeUpSalary * year;
        System.out.println("Маша получает зарплату " + totalOneYearBefore1 + " рублей в год");
        System.out.println("Маша повышен зарплату на " + mashaEmployeeNew + " рублей за год");
        System.out.println("Теперь Маша получает " + mashaEmployeeUpSalary + " рублей в месяц");
        System.out.println("Годовой доход Маши вырос на " + totalOneYearAfter1 + " рублей в год после повышение");
        int denisEmployeeNew = (denisEmployeeSalary * 10) / 100;
        int denisEmployeeUpSalary = denisEmployeeNew + denisEmployeeSalary;
        int totalOneYearBefore2 = denisEmployeeSalary * 12;
        int totalOneYearAfter2 = denisEmployeeUpSalary * year;
        System.out.println("Денис получает зарплату " + totalOneYearBefore2 + " рублей в год");
        System.out.println("Денис повышен зарплату на " + denisEmployeeNew + " рублей за год");
        System.out.println("Теперь Денис получает " + denisEmployeeUpSalary + " рублей в месяц");
        System.out.println("Годовой доход Дениса вырос на " + totalOneYearAfter2 + " рублей в год после повышение");
        int cristinaEmployeeNew = (cristinaEmployeeSalary * 10) / 100;
        int cristinaEmployeeUpSalary = cristinaEmployeeNew + cristinaEmployeeSalary;
        int totalOneYearBefore3 = cristinaEmployeeSalary * 12;
        int totalOneYearAfter3 = cristinaEmployeeUpSalary * year;
        System.out.println("Кристина получает зарплату " + totalOneYearBefore3 + " рублей в год");
        System.out.println("Кристина повышен зарплату на " + cristinaEmployeeNew + " рублей за год");
        System.out.println("Теперь Кристина получает " + cristinaEmployeeUpSalary + " рублей в месяц");
        System.out.println("Годовой доход Кристины вырос на " + totalOneYearAfter3 + " рублей в год после повышение");



    }
}
