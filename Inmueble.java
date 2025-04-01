public class Inmueble
{
	// Versión comentada
	private String direccion;
	private double metrosCuadrados;
	private boolean nuevo;
	private double precioBase;
	private int antiguedad;
	
	public Inmueble(String direccion, double metros, boolean nuevo, double precioBase, int antiguedad)
	{
		this.direccion = direccion;
		this.metrosCuadrados = metros;
		this.nuevo = nuevo;
		this.precioBase = precioBase;
		this.antiguedad = antiguedad;
	}
	
	protected double precio()
	{
		double precio = precioBase - precioBase * 0.01;
		if (antiguedad > 15)
			precio = precio - precioBase * 0.01;
		return precio;
		
		// return (antiguedad >= 15) ? (precioBase - precioBase * 0.02) : (precioBase - precioBase * 0.01);
	}
	
	public String toString()
	{
		return (direccion +", metros="+metrosCuadrados+" m2, nuevo="+ nuevo +", antiguedad "+antiguedad);
	}
	
	protected double getPrecioBase()
	{
		return this.precioBase;
	}
	
	protected double getMetrosCuadrados()
	{
		return this.metrosCuadrados;
	}
}
	
	
	
	
	
