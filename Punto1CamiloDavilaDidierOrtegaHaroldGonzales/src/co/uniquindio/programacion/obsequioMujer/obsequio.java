package co.uniquindio.programacion.obsequioMujer;

import static co.uniquindio.programacion.obsequioMujer.Biblioteca.leerDouble;
import static co.uniquindio.programacion.obsequioMujer.Biblioteca.imprimir;
import static co.uniquindio.programacion.obsequioMujer.Biblioteca.leerString;
import static co.uniquindio.programacion.obsequioMujer.Biblioteca.leerEntero;

/**
*
* @author Camilo Davila,Didier Ortega y Harold Gonzalez .
*/

public class obsequio{

	public static void main(String[] args) {
		String mesCum, obsequio, tarjeta;
		double puntosAcumulados, comprasAnuales;
		int tiempoTarjeta, edad, numeroCompras;
		/**Varibales que se pidieron al usuario.
		 * @Datatypes Double, Entero, String.
		*/

		tarjeta = leerString("Ingrese el tipo de tarjeta que posee, de lo contrario ingrese NO : ");
		puntosAcumulados = leerDouble("Ingrese sus puntos acumulados: ");
		comprasAnuales = leerDouble("Ingrese el valor total de sus compras anuales en pesos: ");
		numeroCompras = leerEntero("ingrese el numero de compras anuales que realizo: ");
		tiempoTarjeta = leerEntero("hace cuantos años posee su tarjeta?");
		edad = leerEntero("ingrese se edad: ");
		mesCum = leerString("Ingrese el mes en que cumple años: ");
		obsequio = informarObsequio(tarjeta, puntosAcumulados, comprasAnuales, tiempoTarjeta, edad, mesCum, numeroCompras);
		imprimir(obsequio);
	}
	/**
     * informar el obsequio que recibirá una mujer en una tienda de ropa, considerando 
     * algunas condiciones.
     * 
     * @param el tipo de tarjeta(platinum o gold),los puntos acumulados, el valor total de las compras anuales,el tiempo de posesion de la tarjeta por parte del usuario(Mujer),
     * 		  la edad del usuario(mujer), mes de cumpleaños del ususario(mujer), el numero total de compras anuales realizadas.
     *        
     * @return obsequio, El obsequio respectivo de acuerdo a las condiciones dadas.
     */

	public static String informarObsequio(String tar, double puntosAc, double comprasAn, int tiempoTar, int edad, String mes, int nC) 
	{
		String obsequio = "";
		double prom;
		prom = hallarPromedioComprasAnuales(comprasAn, nC);
		if (tar.equals("platinum") || tar.equals("Platinum") || tar.equals("PLATINUM")
				&& puntosAc > 20000 && comprasAn < 4500000 && tiempoTar >= 2) 
		{
			obsequio = "Su obsequio es un Bolso ";
		} else if (tar.equals("platinum") || tar.equals("Platinum") || tar.equals("PLATINUM") && puntosAc < 20000) {
			obsequio = "Su obsequio es una cosmetiquera ";
		} else if (tar.equals("gold") || tar.equals("Gold") || tar.equals("GOLD") && tiempoTar >= 2
				&& edad > 45 && comprasAn > 10000000) {
			obsequio = "Su obsequio es una pulsera de SWAROVSKI ";
		} else if (tar.equals("gold") || tar.equals("Gold") || tar.equals("GOLD") && (edad >= 18 && edad <= 45)
				&& (mes.equals("marzo") || mes.equals("Marzo") || mes.equals("MARZO"))) {
			obsequio = "Su obsequio es un brazalete de SWAROVSKI ";
		} else if (tar.equals("gold") || tar.equals("Gold") || tar.equals("GOLD")
				|| tar.equals("platinum") || tar.equals("Platinum") || tar.equals("PLATINUM")
				&& prom == 6000000) {
			obsequio = "Su obsequio es una comestiquera ";
		} else if (tar.equals("No") || tar.equals("no") || tar.equals("NO") && prom > 15000000) {
			obsequio = "Su obsequio es un iphone  6s ";
		} else {
			obsequio = "Lo sentimos, no puedes recibir obsequios";
		}
		return obsequio;

	}
	/**Esta funcion HallarPromedioComprasAnuales nos permite hallar el promedio en el valor 
	 * total de las compras que el usuario ha hecho durante el año 
	 * @param comprasAn, que corresponde al valor total de compras anuales y nCom que corresponde al numero total de las compras anuales.
	*/
	
	public static double hallarPromedioComprasAnuales(double comprasAn, int nCom) 
	{
		double promCompras;
		promCompras = comprasAn / nCom;
		return promCompras;
	}

}
