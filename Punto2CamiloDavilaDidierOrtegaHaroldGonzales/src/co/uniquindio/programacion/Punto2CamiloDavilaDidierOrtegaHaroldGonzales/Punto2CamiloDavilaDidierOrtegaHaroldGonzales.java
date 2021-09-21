package co.uniquindio.programacion.Punto2CamiloDavilaDidierOrtegaHaroldGonzales;

import static co.uniquindio.programacion.Punto2CamiloDavilaDidierOrtegaHaroldGonzales.Biblioteca.leerDouble;
import static co.uniquindio.programacion.Punto2CamiloDavilaDidierOrtegaHaroldGonzales.Biblioteca.imprimir;

/**
 *
 * @author Camilo Davila,Didier Ortega y Harold Gonzalez .
 */
public class Punto2CamiloDavilaDidierOrtegaHaroldGonzales {

    public static void main(String[] args) {
        double horas, salario;
        horas= leerDouble("Ingresa la cantidad de horas trabajadas: ");
        salario= calcularSueldo(horas);
        imprimir("El salario del trabajador es :" + salario );
    }

    /**
     * Calcula el salario dependiendo dependiendo de las horas trabajadas.
     *
     * @param horas, Las horas trabajadas duranet la semana.
     * @return salario, El salario respectivo por las horas trabajadas.
     */
    public static double calcularSueldo(double horas) {
        double salario = 0;

        if (horas <= 40) {
            salario = horas * 200;
        } else if (horas >= 40) {
            salario = ((horas - 40) * 300) + (40 * 200);
        }

        return salario;
    }
}

