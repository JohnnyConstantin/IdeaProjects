package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int Points = 0;
        int Money = 100000;
        Scanner in = new Scanner(System.in);
        System.out.println("Добро пожаловать на хакатон! Самое ожидаемое мероприятие нашего института \nВы капитан команды? Как вас зовут?");
        String Name = in.next();
        System.out.println("Замечательно, " + Name + "\nКак называется ваша команда?");
        String Team = in.next();
        System.out.println("Ваша команда " + Team + " сейчас располагает: " + "\t" + Points + " Очками и " + "\t" + Money + " Рублей");
        System.out.println("В каком кейсе желаете принять участие?");
        System.out.println("---(1) Разработка ПО для нового Tesla Truck");
        System.out.println("---(2) Дизайн интерфейса для нового стриминг сервиса 'Huitch'");
        System.out.println("---(3) Нейронная сеть, распознающая студентов, списывающих на экзамене для Samsung Academy");
        String Choice1 = in.next();
        switch (Choice1) {
            case "1" :
                System.out.println("Ваше первое дейстие?");
                System.out.println("---(1) Засунем туда систему распознавания гуманоидов");
                System.out.println("---(2) Система климат контроля, распознавания настроения водителя и автоматический подогрев пяток");
                System.out.println("---(3) На главный экран будем выводить игру Wold of Tanks, \nчтобы водитель был в танке как в реальности, так и в игре");
                String Choice2_1 = in.next();
                switch (Choice2_1) {
                    case "1":
                        Points += 100;
                        Money += 100000;
                        System.out.println("Поздравляем, вы выиграли хакатон! И заработали 100 000 рублей. \nНа вашем счету: " + "\t" + Points + " Баллов и " + "\t" + Money + "Рублей");
                        break;
                    case "2":
                        Money -= 45000;
                        System.out.println("Вы разработали очень удобное ПО, но Илон его не принял.\nХакатон вы проиграли, но зато теперь вам будет тепло в своих жигулях. На вашем счету:" + "\t" + Points + " Баллов и " + "\t" + Money + "Рублей");
                        break;
                    case "3":
                        Money -= 100000;
                        Points -= 100000;
                        System.out.println("Позор! Вас выгнали с хакатона по причине 'Танкист'. На вашем счету" + "\t" + Points + " Баллов и " + "\t" + Money + "Рублей");
                        break;
                }

                break;
            case "2" :
                System.out.println("Ваше второе дейстие?");
                System.out.println("---(1) Позвоним Лебедеву и закажем у него дизайн");
                System.out.println("---(2) Нарисуем проект в пеинте и сэкономим кучу денег");
                System.out.println("---(3) Будем рисовать в лицензионной версии фотошопа");
                String Choice2_2 = in.next();
                switch (Choice2_2){
                    case "1" :
                        Money -= 100000;
                        System.out.println("Поздравляем, вы проиграли хакатон. \nНа вашем счету: " + "\t" + Points +" Баллов и " + "\t" + Money + "Рублей");
                        break;
                    case "2" :
                        Money += 50000;
                        System.out.println("Поздравляем, вы создали шедевр. Хакатон вы проиграли, но вам удалось продать свой рисунок/ На вашем счету:" + "\t" + Points +" Баллов и " + "\t" + Money + "Рублей");
                        break;
                    case "3" :
                        Money -= 15000;
                        Points += 5;
                        System.out.println("Вы потратили кучу денег и нарисовали средненький проект, однако прошли в следующий тур и теперь готовитесь к защите работы. На вашем счету:" + "\t" + Points + " Баллов и " + "\t" + Money + "Рублей");

                        break;
                }
                break;
            case "3" :
                System.out.println("Ваше первое дейстие?");
                System.out.println("---(1) Пишем нейронку самостоятельно, проводим OVER9000 обучений");
                System.out.println("---(2) Воруем код со стака и смотрим, что произойдет");
                System.out.println("---(3) Покупаем нейронные сети у Яндекса");
                String Choice2_3 = in.next();
                switch (Choice2_3) {
                    case "1":
                        Money -= 100000;
                        System.out.println("Поздравляем, вы проиграли хакатон. \nНа вашем счету: " + "\t" + Points + " Баллов и " + "\t" + Money + "Рублей");
                        break;
                    case "2":
                        Money += 50000;
                        System.out.println("Поздравляем, вы создали шедевр. Хакатон вы проиграли, но вам удалось продать свой рисунок" + "\t" + Points + " Баллов и " + "\t" + Money + "Рублей");
                        break;
                    case "3":
                        Money -= 15000;
                        Points += 5;
                        System.out.println("Вы потратили кучу денег и нарисовали средненький проект, однако прошли в следующий тур и теперь готовитесь к защите работы" + "\t" + Points + " Баллов и " + "\t" + Money + "Рублей");

                        break;
                }
                    break;

        }
    }
}
