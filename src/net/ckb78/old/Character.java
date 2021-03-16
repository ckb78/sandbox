package net.ckb78.old;

import javax.swing.JOptionPane;

public class Character {

    String name;
    int level;

    public Character(String name1, int level1){

        name = name1;
        level = level1;

    }

    public void printStatus(){
        JOptionPane.showMessageDialog(null, "Character name     :           " + name + "\n "
                +            "Character level    :           " + level + "\n ");

    }



    public static void main(String[] args){
        // Input value into window.
        // int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Value "));
     Character Gandalf = new Character("Gandalf", 12);
        Gandalf.printStatus();


    }

}
