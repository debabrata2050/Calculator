package com.mycompany.calculator;

import java.awt.Color;
import javax.swing.JPanel;

public class operation {
    
    public static void num_setcolor(JPanel panel)
    {
        panel.setBackground(new Color(46,47,62));
    }
    public static void num_resetcolor(JPanel panel)
    {
        panel.setBackground(new Color(54,55,70));
    }
    
    //Remove (.0) from the last of every number where it is not needed
    public static String removeDot(String arg){
        int r = arg.indexOf(".0");
        if(r != -1){
            arg = arg.substring(0,r);
        }
        return arg;
    }
}
