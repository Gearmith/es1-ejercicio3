/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package john.ejercicio3;

/**
 *
 * @author johnferneymontoyaramirez
 */
public class Ejercicio3 {

    public static void main(String[] args) {
	int semanaBruto = 48 * 5000;
	double reteFuente = semanaBruto * (12.5 / 100);
	double semanaNeto = semanaBruto - reteFuente;
	System.out.println("El salario semanal bruto es: " + semanaBruto);
	System.out.println("El salario semanal neto es: " + semanaNeto);
    }
}
