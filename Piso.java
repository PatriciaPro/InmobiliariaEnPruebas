public class Piso extends Inmueble
{
	private int planta;
	
	public Piso(int planta, String direccion, double metros, boolean nuevo, double precioBase, int antiguedad)
	{
		super(direccion, metros, nuevo, precioBase, antiguedad);
		this.planta = planta;
	}
		
	public double precio()
	{
		double incremento = 0;
		if (planta >= 3)
			incremento = super.getPrecioBase() * 0.03;
		return super.precio() + incremento;
	}
	public String toString()
	{
		return super.toString() +", planta="+planta;
	}
}