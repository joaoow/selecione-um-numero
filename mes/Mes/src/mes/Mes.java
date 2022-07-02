/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mes;

import javax.swing.JOptionPane;

/**
 *
 * @author João Renis
 */
public class Mes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mes = (String) JOptionPane.showInputDialog("Forneça um número do mês: ");
        if (mes != null) {
            switch (mes) {
                case "1":
                    mes = "Janeiro";
                    break;
                case "2":
                    mes = "Fevereiro";
                    break;
                case "3":
                    mes = "Março";
                    break;
                case "4":
                    mes = "Abril";
                    break;
                case "5":
                    mes = "Maio";
                    break;
                case "6":
                    mes = "Junho";
                    break;
                case "7":
                    mes = "Julho";
                    break;
                case "8":
                    mes = "Agosto";
                    break;
                case "9":
                    mes = "Setembro";
                    break;
                case "10":
                    mes = "Outubro";
                    break;
                case "11":
                    mes = "Novembro";
                    break;
                case "12":
                    mes = "Dezembro";
                    break;
            }
            JOptionPane.showMessageDialog(null, mes);
        }
        System.exit(0);

    }

}
