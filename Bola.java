/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance_ps;

/**
 *
 * @author SMK TELKOM 13
 */
public class Bola extends BangunRuang{
    double r;
    
    @Override
    double volume(){
        double volume = 4/3*3.14*r*r*r;
        System.out.println("Volume bola : "+volume);
        return volume;
    }
    
    @Override
    double LuasPermukaan(){
        double LP = 4*3.14*r*r*r;
        System.out.println("Luas Permukaan Bola : "+LP);
        return LP;
    }
}
