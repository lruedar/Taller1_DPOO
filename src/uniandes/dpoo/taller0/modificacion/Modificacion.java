package uniandes.dpoo.taller0.modificacion;

import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;

public class Modificacion 
{

	public static void main(String[] args)
	{
		try
		{
			CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
			System.out.println(calc.paisConMasMedallistas());
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo indicado no se encontró.");
		}
		catch (IOException e)
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo.");
			System.out.println(e.getMessage());
		}
	}
}
