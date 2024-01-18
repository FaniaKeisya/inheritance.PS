/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance_ps;

/**
 *
 * @author SMK TELKOM 13
 */
public class Tabung extends BangunRuang {
    double r;
    double t;
    
    @Override
    double volume(){
        double volume = 3.14*r*r*t;
        System.out.println("Volume Tabung : "+volume);
        return volume;
    }
    
    double LuasPermukaan(){
        double LP = 2*3.14*r*(r+t);
        System.out.println("Luas Permukaan Tabung : "+LP);
        return LP;
    }
    
}
