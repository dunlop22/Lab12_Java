package Avto;


import Avto.Obchee;
import java.util.Scanner;
import java.util.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Main {

    
    public static void table_print(Koleso [][]Kol_Massiv)
    {
        for (int i = 0; i < 4; i++)
        {
                System.out.println("*************************************************");
                for (int j = 0; j < 4; j++)
                {
                        if (Kol_Massiv[i][j].diametr_info() != -1)
                        {
                                System.out.print("* " + Kol_Massiv[i][j].dannii() + " ");
                        }
                        else
                        {
                                System.out.print("*           ");
                        }
                }
                System.out.println("*");
        }
        System.out.println("*************************************************");
    }
    public static void main(String[] args) throws IOException
    {
        Scanner in1 = new Scanner(System.in);        //инициализация сканера
        
        Obchee obchie = new Obchee();
        Motor motorishe = new Motor();
        Korobka korobas = new Korobka();
        Koleso kolesiko = new Koleso();
        Avto Avtom = new Avto(); 
        
        int main_key = 9;
        char c;
        Scanner in = new Scanner(System.in);        //инициализация сканера
        do
	{
            System.out.println("1) Общее\n2) Двигатель\n3) Коробка\n4) Колеса\n5) Автомобиль\n6) Конструкторы\n7) Одномерный массив параметром\n8) Двумерный массив\n\n0) - выход");
            main_key = in1.nextInt();
            switch (main_key) {
                case 1:
                    int key = 9;
                    do {
                        System.out.println("1) Ввод собственных данных об общем\n2) Ввод данных по конструктору\n3) Просмотр информации\n\n0) - выход\n\n");
                        key = in1.nextInt();
                        switch (key) {
                        case 1:
                            obchie.new_obchee_info();
                            System.out.println("\nОбщая информация добавлена\n");
                            break;
                        case 2:
                            obchie.new_obchee("Subaru", "4WD", "Бензин", 5, 1500, 60, 8);
                            System.out.println("\nОбщая информация добавлена по конструктору\n");
                            break;
                        case 3:
                            if (obchie.massa >= 0)
                            {
                                obchie.prosmotr_obchee();
                            }
                            else
                            {
                                System.out.println("Общая информация не найдена\n\n");
                            }    
                            break;
                        }
                    } while (key != 0);
                    break;
                    
                case 2:
                    key = 9;
                    do {
                        System.out.println("1) Ввод собственных данных о двигателе\n2) Ввод данных по конструктору\n3) Просмотр информации\n\n0) - выход\n\n");
                        key = in1.nextInt();
                        switch (key) {
                        case 1:
                            motorishe.new_motor_info();
                            System.out.println("\nИнформация о двигателе добавлена\n");
                            break;
                        case 2:
                            motorishe.new_motor("FB20", 150, 4, 8, 4, 2);
                            System.out.println("\nИнформация о двигателе добавлена по конструктору\n");
                            break;
                        case 3:
                            if (motorishe.klapan >= 0)
                            {
                                motorishe.prosmotr_motor();
                            }
                            else
                            {
                                System.out.println("Информация о двигателе не найдена\n\n");    
                            }
                            break;
                        }
                    } while (key != 0);
                    break;
                    
                case 3:
                    key = 9;
                    do {
                        System.out.println("1) Ввод собственных данных о коробке переключения передач\n2) Ввод данных по конструктору\n3) Просмотр информации\n\n0) - выход\n\n");
                        key = in1.nextInt();
                        switch (key) {
                        case 1:
                            korobas.new_korobka_info();
                            System.out.println("\nИнформация о коробке переключения передач добавлена\n");
                            break;
                        case 2:
                            korobas.new_korobka("АКПП", 5);
                            System.out.println("\nИнформация о коробке переключения передач добавлена по конструктору\n");
                            break;
                        case 3:
                            if (korobas.kolvo_peredach >= 0)
                            {
                                korobas.prosmotr_korobka();    
                            }
                            else
                            {
                                System.out.println("Информация о коробке переключения передач не найдена\n\n");    
                            }
                            break;
                        }
                    } while (key != 0);
                    break;
                    
                case 4:
                    key = 9;
                    do {
                        System.out.println("Последний уникальный ID: " + Koleso.id_return() + "\nОбщее количество добавленных колес: " + Koleso.kolvo_return() + "\n\n1) Ввод собственных данных о колесах\n2) Ввод данных по конструктору\n3) Удаление\n\n0) - выход\n\n");
                        key = in1.nextInt();
                        switch (key) {
                        case 1:
                            kolesiko.new_koleso_info();
                            break;
                        case 2:
                            kolesiko.new_koleso(225, 17, 55, "Литье");
                            break;
                        case 3:
                            if (Koleso.kolvo_return() > 0)
                            {
                                Koleso.koleso_del();
                            }
                            break;
                        }
                        kolesiko.prosmotr_koleso();     
                        
                    } while (key != 0);
                    break;  
                    
                case 5:
                    key = 9;
                    do {
                        System.out.println("1) Создание автомобиля\n2) Просмотр информации\n\n0) - выход\n\n");
                        key = in1.nextInt();
                        switch (key) {
                        case 1:
                            Avtom.new_avto( motorishe, obchie, kolesiko, korobas);
                            break;
                        case 2:
                            Avtom.prosmotr_avto();
                            break;
                        }
                    } while (key != 0);
                    break;
                case 6:
                    key = 9;
                    Koleso kol1 = new Koleso();
                    Koleso kol2 = new Koleso(12);
                    System.out.println("Констуктор без параметров: \n");
                    kol1.prosmotr_koleso();
                    System.out.println("Констуктор с одним параметром: \n");
                    kol2.prosmotr_koleso();
                    /*
                    System.out.println("Введите количество коробок в массиве: ");
                    int n;
                    n = -1;
                    do
                    {
                        if (in.hasNextInt()){
                            
                            n = in.nextInt();
                        }
                        else
                        {
                            System.out.println("Количество введено неверно, повторите попытку: ");    
                            in.nextLine();
                        }
                    } while (n <= 0);
                    Korobka Kor = new Korobka();
                    Korobka Korobka_Massiv = new Korobka(); 
                    int i;
                    for (i = 0; i < n; i++)
                    {
                        Korobka_Massiv.Korobka_Mass(Kor);    
                    }
                    
                    Korobka_Massiv.Korobka_prosmotr();
                    
                    System.out.println("\n\n\n");    */
                    break;
                case 7:
                    key = 9;
                    Koleso Kol_mass[] = new Koleso[10];
                    Koleso temp = new Koleso();
                    int n;

                    System.out.print("Введите количество колес в массиве: ");
                    do
                    {
                        n = in.nextInt();
                    } while (n < 0);
                    for (int i = 0;i < n; i++)
                    {
                        
                        
                        temp.new_koleso(130.0 + i * 5, 13.0 + i * 2, 30 + i * 4, "Enkei №" + (i + 1) + " Japan");
                        Kol_mass[n] = temp;
                        Kol_mass[n].prosmotr_koleso();
                    }
                    /*
                    {
                        Kol_mass[i] = new Koleso(12);
                        System.out.println("\n");
                        Kol_mass[i].prosmotr_koleso();
                    }
                    
                    /*
                    Help schet = new Help();
                    Motor Mot1 = new Motor();
                    Motor Mot2 = new Motor();
                    Mot1.vsego_koni(schet);
                    System.out.println("Количество лошадей в двигателе №1: " + schet.vsego);    
                    Mot2.vsego_koni(schet);
                    System.out.println("Количество лошадей в двигателях (№1 + №2): " + schet.vsego + "\n\n\n\n");    
                    */
                    break;
                case 8:
                    key = 9;
                    Koleso[][] Kol_mass_ = new Koleso[4][4];
                    Koleso temp1 = new Koleso();
                    
                    for (int i = 0;i < 4; i++)
                    {
                        for (int j = 0;j < 4; j++)    
                        {
                            Kol_mass_[i][j] = new Koleso(-1);
                        }
                    }
                    int podmenu;
                    do
                    {
                        temp1.new_koleso_info();
                        table_print(Kol_mass_);
                        int m, k;
                        System.out.print("Введите номер строки: ");
                        do
                        {
                            m = in.nextInt();
                        } while (m < 1 || m > 4);
                        System.out.print("Введите номер стобца: ");
                        do
                        {
                            k = in.nextInt();
                        } while (k < 1 || k > 4);

                        Kol_mass_[m-1][k-1] = temp1;
                        table_print(Kol_mass_);
                        System.out.print("0) Выход в меню\nЛюбая клавиша - продолжение заполнения массива");
                        podmenu = in.nextInt();
                    } while (podmenu != 0);
                    
                    /*System.out.println("Введите количество коробок в массиве: ");
                    int m;
                    m = -1;
                    do
                    {
                        if (in.hasNextInt()){
                            
                            m = in.nextInt();
                        }
                        else
                        {
                            System.out.println("Количество введено неверно, повторите попытку: ");    
                            in.nextLine();
                        }
                    } while (m <= 0);
                    Korobka Kor1 = new Korobka();
                    List<Korobka> Korobka_Massiv1 = new ArrayList<>();
                    Korobka Kor2 = new Korobka();
                    //Korobka Korobka_Massiv1 = new Korobka(); 
                    int j;
                    String name = " Aisin";
                    for (j = 0; j < m; j++)
                    {
                        Kor1.new_korobka("АКПП №" + (j + 1) + name, 5 + j * 1);
                        Korobka_Massiv1.add(Kor1);
                        //Korobka_Massiv1.Korobka_Mass(Kor1);
                        Kor2 = Korobka_Massiv1.get(0);
                        Kor2.prosmotr_korobka();
                        System.out.println("\n");    
                    }
                    System.out.println("\n\n\n");
                        */
                    break;
            }
        } while (main_key != 0);
    }
}