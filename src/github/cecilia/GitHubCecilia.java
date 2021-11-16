/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github.cecilia;

import java.util.Scanner;

/**
 *
 * @author IFSC
 */
public class GitHubCecilia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in); 
       
        System.out.println ("Entre com seu nome:");
        String nome = leia.next();
        System.out.println (nome+"bem vinfo ao GitHub");
        
    }
    
}
