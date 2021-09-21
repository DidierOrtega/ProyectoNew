package co.uniquindio.programacion.PuntotresParcial3;
import javax.swing.JOptionPane;

public class Biblioteca {
	/**
	 * Permite leer un numero double mediante una caja de dialogo 
	 * @param mensaje El mensaje que verá el usuario 
	 * @return el numero ingresado por el usuario
	 */	

	public static double leerDouble (String mensaje)
	{
		double dato= Double.parseDouble(JOptionPane.showInputDialog(mensaje));
		return dato;
	}

	/**
	 * Permite leer un numero entero mediante una caja de dialogo 
	 * @param mensaje El mensaje que verá el usuario 
	 * @return el numero ingresado por el usuario
	 */
	public static int leerEntero (String mensaje)
	{
		int dato= Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		return dato;
	}


	/**
	 * Permite leer un caracter mediante una caja de dialogo 
	 * @param mensaje El mensaje que verá el usuario 
	 * @return el caracter ingresado por el usuario
	 */
	public static char leerChar(String mensaje)
	{
		char dato= (JOptionPane.showInputDialog(mensaje)).charAt(0);
		return dato;
	}

	/**
	 * Permite leer una cadena de caracteres mediante una caja de dialogo 
	 * @param mensaje El mensaje que verá el usuario 
	 * @return el string ingresado por el usuario
	 */
	public static String leerString (String mensaje)
	{
		String dato= JOptionPane.showInputDialog(mensaje);
		return dato;
	}


	/**
	 * Permite leer un boolean 
	 * @param mensaje El mensaje mostrado al usuario
	 * @return un boolean, true si presiona el boton si, false en caso contrario
	 */
	public static boolean leerBoolean (String mensaje)
	{
		boolean centinela=false;
		int result = JOptionPane.showConfirmDialog(null, 
				mensaje,null, JOptionPane.YES_NO_OPTION);
		if(result == JOptionPane.YES_OPTION) {
			centinela=true;
		}
		return centinela;
	}

	/**
	 * Permite imprimir un mensaje
	 * @param mensaje El mensaje a imprimir
	 */
	public static void imprimir (String mensaje)
	{
		JOptionPane.showMessageDialog(null,mensaje);
	}
	public static int[] leerArregloEnteros ( String mensaje, int cantidad )
	{
	int i, enteros[];
	enteros = new int [ cantidad ];
	for ( i = 0 ; i < cantidad ; i++ )
	{
	enteros [ i ] = leerEntero( mensaje +
	"( " + (i+1) + " de " + cantidad + " )" );
	}
	return enteros;
	}
	/**
	* Método para leer varios numeros y retornarlos en un arreglo
	*
	* @param pregunta Texto que se muestra al usuario
	* @param num Cantidad de elementos a leer
	* @return Arreglo con la informacion ingresada por el usuario
	*/
	public static double[] leerArregloDouble ( String pregunta, int num )
	{
	double arreglo[]= new double [ num ];
	for ( int i = 0 ; i < num ; i++ )
	{
	arreglo [ i ] = leerDouble( pregunta +
	"( " + (i+1) + " de " + num + " )" );
	}
	return arreglo;
	}
	/**
	* Método que imprime varios enteros dados en un arreglo
	*
	* @param cadenas Representación en String del arreglo
	*/
	
	public static String devolverStringArreglo ( int[] arreglo )
	{
	String salida;
	salida = "[";
	for ( int i = 0 ; i < arreglo.length ; i++ )
	{
	salida += arreglo[ i ] + " ";
	}
	salida +="]";
	return ( salida );
	}
	public static void mostrarMatriz(int[][] M)
    {
        for (int i = 0; i <M.length; i++) {
           for (int j = 0; j < M[i].length; j++) {
               System.out.print("\t" + M[i][j]);
           }
           System.out.println();
       }
    }
}
