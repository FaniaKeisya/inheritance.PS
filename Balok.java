/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance_ps;

/**
 *
 * @author SMK TELKOM 13
 */
public class Balok extends BangunRuang{
    double p;
    double l;
    double t;
    
    @Override
    double volume(){
        double volume = p*l*t;
        System.out.println("Volume Balok : "+volume);
        return volume;
    }
    
    @Override
    double LuasPermukaan(){
        double LP = 2*(p*l)+(p*t)+(l*t);
        System.out.println("Luas Permukaan Balok : "+LP);
        return LP;
    }
    
}
