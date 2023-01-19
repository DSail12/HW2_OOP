// Добавить файл с описанием интерфейса. В котором описать два метода, void step(); и String getInfo(); 
// Реализовать имнтерфейс в абстрактном классе. Создать два списка в классе main. В кждый из списков добавить 
// по десять экземнляров наследников BaseHero. Крестьянин, Разбойник, Снайпер и Колдун могут быть в одном и 
// Крестьянин Разбойник, копейщик, арбалетчик и монах в другой. Реализовать метод step() для магов таким 
// образом, чтобы они могли лечить самого повреждённого из своих однополчан!) Удалить ненужные методы из 
// абстрактного класса, если такие есть.


package OOP_2;

import java.util.ArrayList;

public class Main {
    public static ArrayList<BaseUnit> personList = new ArrayList<>();

    public static void getEqual(String unitType) {
        for (var item : personList) {
            if (item.getClass().getName().equals(unitType)) {
                System.out.print(item);
            }
        }
    }

    public static void main(String[] args) {
        Generator generator = new Generator();

        for (int i = 0; i < 50; i++) {
            switch (generator.getUnitType()) {
                case "crosbowman":
                    personList.add(new Crossbowman(generator.getName()));
                    break;
                case "thug":
                    personList.add(new Thug(generator.getName()));
                    break;
                case "farmer":
                    personList.add(new Farmer(generator.getName()));
                    break;
                case "wizard":
                    personList.add(new Wizard(generator.getName()));
                    break;
                case "monk":
                    personList.add(new Monk(generator.getName()));
                    break;
                case "pikeman":
                    personList.add(new Pikeman(generator.getName()));
                    break;
                case "sniper":
                    personList.add(new Sniper(generator.getName()));
                    break;
                default:
                    System.out.println("ошибка. такого персонажа нет.");
                    break;
            }
        }

        System.out.println("\n--------------------");
        System.out.println("Вывод всего списка:");
        System.out.print(personList);
        System.out.println("\n--------------------");
        System.out.println("Вывод по персонажам: ");

        getEqual("Crossbowman");
        getEqual("Thug");
        getEqual("Farmer");
        getEqual("Wizard");
        getEqual("Monk");
        getEqual("Pikeman");
        getEqual("Sniper");

    }

}