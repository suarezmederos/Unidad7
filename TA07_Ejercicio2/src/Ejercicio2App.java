import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Ejercicio2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generarArray();
	}
	
	public static void generarArray(){ 
		// metodo para crear array y rellenarlo con notas introducidas;
				int cantProductos = 1;
				ArrayList<Double>compra = new ArrayList<>();
				boolean fin= false;
				int i=0;
				while( i < cantProductos && !fin){
					for(int j=0; j < cantProductos; j++){
						
						JOptionPane.showMessageDialog(null, "Introduce datos del producto"+(i));
						
						String iva = JOptionPane.showInputDialog("Introduce IVA:21% o 4%");
						double ivaConvert = Double.parseDouble(iva);
						compra.add(ivaConvert);
						
						
						String precio = JOptionPane.showInputDialog("Introduce Precio Bruto");
						double precioConvert = Double.parseDouble(precio);
						compra.add(precioConvert);
						
				        
						double precioIva = ivaConvert * precioConvert;
						compra.add(precioIva);
						
						
						String articulos = JOptionPane.showInputDialog("Introduce numero de articulos comprado");
						double articulosConvert = Double.parseDouble(articulos);
						compra.add(articulosConvert);
						
						double aPagar = articulosConvert * precioIva;
						JOptionPane.showMessageDialog(null, "El total de la compra es de"+aPagar);
						
						String pagado = JOptionPane.showInputDialog("Introduce Cantidad Pagada por el cliente");
						double pagadoConvert = Double.parseDouble(pagado);
						compra.add(pagadoConvert);
						
						double cambio = pagadoConvert - aPagar ;
						JOptionPane.showMessageDialog(null, "El cambio al cliente es de"+cambio);
						compra.add(cambio);
						
						String respuesta = JOptionPane.showInputDialog("Desea introducir mas producto");
						if(respuesta.equalsIgnoreCase("si")){
							i++;
							cantProductos++;
						}else{
							fin=true;
						}
					}
					
				}
	    }
}
