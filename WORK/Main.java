/* 
Создать иерархию классов для персонажей
Крестьянин	Разбойник*	Снайпер*	Колдун*
копейщик*	арбалетчик	монах

Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун,
Копейщик, Арбалетчик, Монах". Для каждого определит 8 полей данных(здоровье,
сила итд) 3-4 поля поведения(методов атаковать, вылечить итд). Создать 
абстрактный класс и иерархию наследников. Расположить классы в пакет так, 
чтобы в основной программе небыло видно их полей. В не абстрактных классах 
переопределить метод toString() так чтобы он возвращал название класса или имя. 
Создать в основной программе по одному обьекту каждого не абстрактного класса и 
вывести в консоль его имя.
*/
package WORK;


import WORK.Units.*;

public class Main {

    public static void main(String[] args) {
        Hero hero1 = new Sniper("Alex");     //СНАЙПЕР
        Hero hero2 = new Spearman("Vlad");   //КОПЕЙЩИК
        Hero hero3 = new Witcher("Maxim");   //КОЛДУН
        Hero hero4 = new Thief("Anatoly");   //РАЗБОЙНИК
        Hero hero5 = new Peasant("Alexey");  //КРЕСТЬЯНИН
        Hero hero6 = new Monk("Serega");     //МОНАХ
        Hero hero7 = new CrossBowMan("Maga"); //АРБАЛЕТЧИК
        hero4.attack(hero3);
        
        System.out.println(hero1.toString());
        System.out.println(hero2.toString());
        System.out.println(hero3.toString());
        System.out.println(hero4.toString());
        System.out.println(hero5.toString());
        System.out.println(hero6.toString());
        System.out.println(hero7.toString());

    }
}