/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;
import java.util.Scanner;
/**
 *
 * @author SALA I
 */
public class EjecutorDos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c,p,ce;
        System.out.print("Ingrese el barrio: ");
        c = sc.nextLine();
        Barrio barrio1 = new Barrio(c);
        System.out.print("Ingrese el nombre: ");
        p = sc.nextLine();
        System.out.print("Ingrese la cédula: ");
        ce = sc.nextLine();
        Persona persona1 = new Persona(p, ce, barrio1);
        System.out.printf("%s\n", persona1);
    }
}
