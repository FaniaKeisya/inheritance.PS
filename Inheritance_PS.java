/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance_ps;

/**
 *
 * @author SMK TELKOM 13
 */
public class Inheritance_PS {

    public static void main(String[] args) {
        BangunRuang bangunRuang = new BangunRuang();
        
        Bola bola = new Bola();
        bola.r = 8;
        
        Balok balok = new Balok();
        balok.l = 4;
        balok.p = 6;
        balok.t = 2;
        
        LimasSegitiga limas = new LimasSegitiga();
        limas.a = 12;
        limas.t = 8;
        limas.lSisiTegak = 5;
        limas.tLimas = 10;
        
        Tabung tabung = new Tabung();
        tabung.r = 8;
        tabung.t = 10;
        
        bangunRuang.volume();
        bangunRuang.LuasPermukaan();
        
        bola.volume();
        bola.LuasPermukaan();
        
        balok.volume();
        balok.LuasPermukaan();
        
        limas.volume();
        limas.LuasPermukaan();
        
        tabung.volume();
        tabung.LuasPermukaan();
    }
}
