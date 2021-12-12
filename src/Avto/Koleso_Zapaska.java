/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Avto;

/**
 *
 * @author Пользователь
 */
public class Koleso_Zapaska extends Koleso
{
    public Koleso_Zapaska()
    {
        vid = "Литье";
    }
    public Koleso_Zapaska(double shirina, double diametr, double visota, String tip_diska, String vid)
    {
        super.new_koleso(shirina, diametr, visota, tip_diska);
        this.vid = vid;
    }
    
    public void print()
    {
        System.out.print("Вид запасного колеса: " + vid);
        super.prosmotr_koleso();
    }
    
    private String vid;
    
    
}
