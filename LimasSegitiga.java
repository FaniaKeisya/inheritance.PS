/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance_ps;

/**
 *
 * @author SMK TELKOM 13
 */
public class LimasSegitiga extends BangunRuang{
    double a;
    double t;
    double tLimas,lSisiTegak;
    
    @Override
    double volume(){
        double volume = 1/3*1/2*(a*t)*tLimas;
        System.out.println("Volume Limas Segitiga : "+volume);
        return volume;
    }
    
    @Override
    double LuasPermukaan(){
        double LP = (1/2*a*t)+(3*lSisiTegak);
        System.out.println("Luas Permukaan Limas Segitiga : "+LP);
        return LP;
    }
}
