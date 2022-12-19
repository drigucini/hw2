public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача №1");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }

    public static void task2 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 8.0;
        cat = cat + 3.6;
        paper = paper + 763789;
        System.out.println("Задача №2");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Задача №3");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4 () {
        var friend = 19;
        System.out.println("Задача №4");
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 3;
        System.out.println(friend);
    }
    public static void task5 () {
        var frog = 3.5;
        System.out.println("Задача №5");
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача №6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println("Вес первого боксера " + boxer1 + " кг");
        System.out.println("Вес второго боксера " + boxer2 + " кг");
        var WeightCommon = boxer2 + boxer1;
        System.out.println("Общий вес боксеров " + WeightCommon + " кг");
        var WeightDifference = boxer2 - boxer1;
        System.out.println("Разница веса боксеров " + WeightDifference + " кг");
    }
    public static void task7 () {
        System.out.println("Задача №7");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println("Вес первого боксера " + boxer1 + " кг");
        System.out.println("Вес второго боксера " + boxer2 + " кг");
        var WeightDifference1 = boxer2 - boxer1;
        System.out.println("Метод 1: разница веса боксеров " + WeightDifference1 + " кг");
        var WeightDifference2 = boxer2%boxer1;
        System.out.println("Метод 2: разница веса боксеров " + WeightDifference2 + " кг");



    }
    public static void task8 () {
    var overallTime = 640;
    var timePerPerson = 8;
    var AllPeople = overallTime / timePerPerson;
        System.out.println("Всего работников в компании - " + AllPeople + " человек");
        var actualAmount = AllPeople + 94;
        var actualTimePerPerson = overallTime / actualAmount;
        System.out.println("Ecли в компании работает " + actualAmount + " человека, то всего " + actualTimePerPerson + " часа работы может быть поделено между сотрудниками");
    }

}
