package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

class Bank {
    private int n;
    private int Sum;

    void BankQuant(int n){
        this.n = n;
        System.out.println("Введите количество банкнот:");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
    }
    void isDevidable(int a, int b, int c, int d) {
        Scanner scan = new Scanner(System.in);
        Sum = scan.nextInt();
        int arr[] = new int[4];

//Рабочий вариант, с учетом кол-ва купюр

        if (Sum > (a*1000 + b*500 + c*100 + d*30)|| (Sum % 10 != 0)) {
            System.out.print("Невозможно выдать данную сумму.\n");
        } else {
            while (Sum % 100 != 0 && Sum > 0 && d > 0) {
                Sum -= 30;
                --d;
                arr[3]++;
            }
            while (a > 0 && Sum - 1000 >= 0) {         // Принцип работы как в последнем варианте
                Sum -= 1000;                           // От большего к меньшему + проверка на делимость на 100
                --a;
                arr[0]++;
            }
            while (b > 0 && Sum - 500 >= 0) {
                Sum -= 500;
                --b;
                arr[1]++;
            }
            while (c > 0 && Sum - 100 >= 0) {
                Sum -= 100;
                --c;
                arr[2]++;
            }
            if (Sum == 0) {
                System.out.println("1000: " + arr[0] + "\t" + "500: " + arr[1] + "\t" + "\n"
                        + "100: " + arr[2] + "\t\t" + "30:" + arr[3] + "\t");
            }
            else System.out.println("Низя. В банкомате не хватает денег.");
        }

/*
    //Это рабочий вариант, но не учитывает количество банкнот. Принцип перебора всех вариантов, начиная с наименьших
    //номиналов. Лучший вариант представления становится основным.
        int k = 4;
        int ar[] = {30, 100, 500, 1000};
        int INF=1000000000; // Значение константы
        int F[] = new int [Sum+1];
        F[0]=0;
        int m, i;
        for(m=1; m<=Sum; ++m)   // заполняем массив F
        {                     // m - сумма, которую нужно выдать
            F[m]=INF;           // помечаем, что сумму m выдать нельзя
            for(i=0; i<k; ++i)  // перебираем все номиналы банкнот
            {
                if(m>=ar[i] && F[m-ar[i]]+1<F[m])
                    F[m] = F[m-ar[i]]+1;// изменяем значение F[m], если нашли
            }                           // лучший способ выдать сумму m
        }
        if (F[Sum]==INF)
            System.out.println("Низя");
        else
            while(Sum>0)
                for(i=0;i<k;++i) {
                    if (F[Sum - ar[i]] == F[Sum] - 1) {
                        System.out.print(ar[i]);
                        System.out.print("\t");
                        Sum -= ar[i];
                        break;
                    }
                }
*/
    /*
        //Этот вариант работает только в половине случаев. Принцип в отборе сначала больших номиналов, потом маленьких
        int a1=0,b1=0,c1=0,d1=0;

            while (Sum >= 1000)
                if( a > 0){
            Sum -= 1000;
            a -= 1;
            a1+=1;
        }
            while (Sum >= 500)
                if(b>0) {
                    Sum -= 500;
                    b -= 1;
                    b1+=1;
                }
            while (Sum >= 100)
                if(c>0) {
                    Sum -= 100;
                    c -= 1;
                    c1+=1;
                }
            while (Sum >= 30)
                if(d>0) {
                    Sum -= 30;
                    d -= 1;
                    d1+=1;
                }

        if (Sum == 0){
            System.out.println("Делится");
            System.out.println(a1);
            System.out.println(b1);
            System.out.println(c1);
            System.out.println(d1);
            System.out.println(Sum);
        } else {
            System.out.println("Вашу сумму нельзя вывести банкнотами этого банкомата");
        }
    */
    }

}

public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        int a,b,c,d;
=======
        int a =0,b=0,c=0,d=0;
>>>>>>> dev
        Bank Bank = new Bank();
        Scanner scan = new Scanner(System.in);
        System.out.println("Номинал: 1000");
<<<<<<< HEAD
        Scanner scan = new Scanner(System.in);
=======
>>>>>>> dev
        a = scan.nextInt();
        System.out.println("Номинал: 500");
        b = scan.nextInt();
        System.out.println("Номинал: 100");
        c = scan.nextInt();
        System.out.println("Номинал: 30");
        d = scan.nextInt();
        System.out.println("Введите сумму для снятия");
        Bank.isDevidable(a,b,c,d);

    }
}
