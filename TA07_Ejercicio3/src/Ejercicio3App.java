import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Ejercicio3App {

	public static void main(String[] args) {
		
		ArrayList<Integer>stockProductos = new ArrayList<>();
		
		stockProductos.add(0, 2);
		stockProductos.add(1, 4);
		stockProductos.add(2, 8);
		stockProductos.add(3, 3);
		stockProductos.add(4, 1);
		stockProductos.add(5, 7);
		stockProductos.add(6, 9);
		stockProductos.add(7, 6);
		stockProductos.add(8, 5);
		stockProductos.add(9, 2);
		
		System.out.println(""+stockProductos.get(5));
		
		String producto = JOptionPane.showInputDialog("Introduce la cantidad del producto en existencia");
		int productoConvert = Integer.parseInt(producto);
		stockProductos.add(productoConvert);
		
		mostrarArreglo(stockProductos);
		
	}
	
	public static void mostrarArreglo(ArrayList<Integer>array){
		
		for(int i=0; i < array.size(); i++){
			JOptionPane.showMessageDialog(null, "El producto"+i+ "tiene una cantidad en stock de:"+array.get(i));
		}
	}

}
