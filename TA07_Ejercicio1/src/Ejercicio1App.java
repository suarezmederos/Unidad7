import javax.swing.JOptionPane;
import java.util.ArrayList;


public class Ejercicio1App {

	public static void main(String[] args) {
		
		String cantAlumnos = JOptionPane.showInputDialog("Introduce la cantidad de alumnos en el curso");
		int cantAlumnosConvert = Integer.parseInt(cantAlumnos);
		
		String cantEvaluacion = JOptionPane.showInputDialog("Introduce la cantidad de evualaciones del alumno en el curso");
		int cantEvaluacionConvert = Integer.parseInt(cantEvaluacion);
		
		double [][] array =generarArray(cantEvaluacionConvert,cantAlumnosConvert);
		ArrayList<Double>notas = calcularMediaNotas(array);
		
		mostrarArreglo(notas);
	}
	
	public static double[][] generarArray( int cantEval, int cantAlumnos){ 
	// metodo para crear array y rellenarlo con notas introducidas;
			double array [][] = new double [cantAlumnos][cantEval];
			for(int i=0; i < array.length ; i++){
				for(int j=0; j < array[i].length; j++){
					JOptionPane.showMessageDialog(null, "La nota del estudiante"+(i));
					String nota = JOptionPane.showInputDialog("Introduce la nota de la evaluacion");
					int notaConvert = Integer.parseInt(nota);
					array[i][j]= notaConvert ;
				}
			}
				return array;
    }
	
	public static ArrayList<Double> calcularMediaNotas(double[][] array){
		// metodo que calcula la media de las posiciones array pasado
			double media=0;
			ArrayList<Double>mediaNotas = new ArrayList<>();
			for(int i =0; i < array.length; i++){
				for(int j=0; j < array[i].length; j++){
					media +=array[i][j];
				}
				media = media / array[i].length;
				mediaNotas.add(media) ;
            }
			return mediaNotas;
   }
   
	public static void mostrarArreglo(ArrayList<Double>notas){
		for(int i =0; i < notas.size(); i++){
			JOptionPane.showMessageDialog(null, "El estudiante"+i+ "su nota promedio fue:"+notas.get(i));
		}
	}
	
		
	
	
	

}
