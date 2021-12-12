package Avto;


import java.io.IOException;
import java.util.Scanner;

public class Koleso {
    
    private double shirina;
    private double visota;
    private double diametr;
    private String tip_diska;
    private double otnoschenie;
    private int id;
    
    private static int id_kolesa = 0;
    private static int kolvo_koles = 0;
    
    public Koleso()
    {
        this.diametr = 17;
        this.shirina = 225;
        this.visota = 55;
        this.tip_diska = "Литье";
        this.id = 050120 + kolvo_koles;
        kolvo_koles = kolvo_koles + 1;
    }
    
    public Koleso(int diametr)
    {
        this.diametr = diametr;
        this.shirina = 225;
        this.visota = 55;
        this.tip_diska = "Литье";
        this.id = 050120 + kolvo_koles;
//        this.otnoschenie = -1;
        kolvo_koles = kolvo_koles + 1;
    }
   
    public void new_koleso_info()
    {
        Scanner in = new Scanner(System.in);        //инициализация сканера
        double temp;
        System.out.println("Введите ширину: ");
        
        do
        {
            try
            {
                temp = in.nextDouble();
                if (temp < 0)
                {
                    throw new IOException ("Введено отрицательное значение ширины колеса.");
                }
                if (temp > 300)
                {
                    throw new IOException ("Введено слишком большое значение ширины колеса.");
                }
                shirina = temp;
            } 
            catch (IOException e)
            {
                 System.out.println(e.getMessage());
                 System.out.println("Повторите попытку: ");
                 shirina = -1;
            }
        } while (shirina == -1);
        
        System.out.println("Введите высоту: ");
        do
        {
            try
            {
                temp = in.nextDouble();
                if (temp < 0)
                {
                    throw new IOException ("Введено отрицательное значение высоты колеса.");
                }
                if (temp > 70)
                {
                    throw new IOException ("Введено слишком большое значение высоты колеса.");
                }
                visota = temp;
            } 
            catch (IOException e)
            {
                 System.out.println(e.getMessage());
                 System.out.println("Повторите попытку: ");
                 visota = -1;
            }
        } while (visota == -1);
        
        System.out.println("Введите диаметр: ");
        
        do
        {
            try
            {
                temp = in.nextDouble();
                if (temp < 0)
                {
                    throw new IOException ("Введено отрицательное значение диаметра колеса.");
                }
                if (temp > 25)
                {
                    throw new IOException ("Введено слишком большое значение диаметра колеса.");
                }
                diametr = temp;
            } 
            catch (IOException e)
            {
                 System.out.println(e.getMessage());
                 System.out.println("Повторите попытку: ");
                 diametr = -1;
            }
        } while (diametr == -1);
        
        System.out.println("Введите тип диска: ");
        do
        {
            if (in.hasNextLine()){
                this.tip_diska = in.nextLine();
            }
            else
            {
                System.out.println("Тип диска введен неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.tip_diska == "");
        
        try
        {
            if (this.visota == 0)
            {
                throw new IOException ("\n\nЗначение высоты равно 0. Вычисление отношения невозможно\n\n.");
            }
            this.otnoschenie = this.shirina * this.visota / 100;
            
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());   
        }
        
        id = id_new();
        kolvo_koles = kolvo_koles + 1;
    }
    
    public static int id_new()
    {
        id_kolesa = id_kolesa + 1;
        return id_kolesa;
    }
    
    public String dannii()
    {
        return (this.shirina + "/" + this.visota + "/" + this.diametr);
    }
    
    public double diametr_info()
    {
        return (this.diametr);
    }
    
    public static int id_return()
    {
        return id_kolesa;
    }
    
    public static int kolvo_return()
    {
        return kolvo_koles;
    }
    
    public static void koleso_del()
    {
        kolvo_koles = kolvo_koles - 1;
    }
    
    public void new_koleso(double shirina, double diametr, double visota, String tip_diska)     //конструктор с параметрами
    {
        this.shirina = shirina;
        this.diametr = diametr;
        this.tip_diska = tip_diska;
        this.visota = visota;
        id = id_new();
        kolvo_koles = kolvo_koles + 1;
        
    }
    
    public void prosmotr_koleso()       //функция просмотра информации о колесе
    {
        System.out.println("ID: " + this.id);
        System.out.println("Ширина: " + this.shirina);
        System.out.println("Высота: " + this.visota);
        System.out.println("Диаметр: " + this.diametr);      
        System.out.println("Тип диска: " + this.tip_diska);
        if (this.otnoschenie > 0)
        {
            System.out.println("Высота (мм): " + this.otnoschenie);    
        }
    }

}
