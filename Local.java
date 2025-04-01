public class Local extends Inmueble
{
	// Versión comentada
	private int numEscaparates;
	
	public Local (int numEscaparates, String direccion, double metros, boolean nuevo, double precioBase, int antiguedad)
	{
		super(direccion, metros, nuevo, precioBase, antiguedad);
		this.numEscaparates=numEscaparates;	
	}
	
	public double precio()
	{
		double incremento = 0;
		double descuento = 0;
		if(super.getMetrosCuadrados()> 50)
			incremento = super.getPrecioBase()*0.01;

		if(this.numEscaparates <= 1)
			descuento = super.getPrecioBase()*0.02;
		
		if(this.numEscaparates > 4)
			incremento = incremento  + super.getPrecioBase()*0.02;
		
		return super.precio()+incremento-descuento;
	}
	
	public String toString()
	{
	   return super.toString() + ", escaparates="+this.numEscaparates;
	}
}
