/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bbms;

/**
 *
 * @author jakec
 */
public class Bbms {

    public static void main(String[] args) {
       
        displayGreetings();
        displayInfo();
    }
    static void  displayGreetings(){
        System.out.println("Welcome to Baldurs Gate!");
    }
    static void displayInfo(){
       displayCharacter();
       displayClass();
    }
    static void  displayCharacter(){
        System.out.println("Jae\nA hero came from a demon clan that want to be good because of his master");
    }
    static void  displayClass(){
        System.out.println("Paladin\nA heavily armored knight");
        displaySkills();
        displayTrait();
         }
    static void  displayTrait(){
        System.out.println("Tiefling Shift\nA demon race in DnD. That is always thirsty for blood");
    }
    static void displaySkills(){
       demonAura();
       demonsClone();
       angelsHeal();
       shadowArise();
    }
    static void  demonAura(){
        System.out.println("demonAura\nIt boost all stats of the character and teammates");
    }
    static void demonsClone(){
        System.out.println("demonsClone\nThe character summons multiple clones he can imagine");
    }
    static void angelsHeal(){
        System.out.println("angelsHeal\nA skill his master taught him. It heals him and his teammates");
    }
    static void  shadowArise(){
        System.out.println("shadowArise\nHe can revive enemys he kill and the enemy will be his ally, the storger the enemy the stonger the shadow");
    }
}