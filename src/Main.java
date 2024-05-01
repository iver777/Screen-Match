import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos al cine!");
        //System.out.println("Pelicula Matrix");
        int fechaDeanzamiento=1990;
        double evaluacion=4.5;
        boolean incluidoEnElPlanBasico=true;
        String nombre="Matrix";
        String sinopsis= "la mejor pelicula del fin del milenio";
        double mediaEvaluacionUsuario=0;
        System.out.println("Pelicula: "+nombre);
        System.out.println("Fecha de lanzamiento: "+fechaDeanzamiento);
        System.out.println("Evaluacion: "+ evaluacion);
        System.out.println("plan: "+ incluidoEnElPlanBasico);
        double mediaEvaluacion=(4.5+4.8+3)/3;
        System.out.println("media de evaluacion de matrix: "+mediaEvaluacion);
        if (fechaDeanzamiento > 2023){
            System.out.println("pelicula del momento");
        }

        else{
            System.out.println("pelicula retro");

        }
        for (int i=0;i<3;i++){
            Scanner teclado=new Scanner(System.in);
            System.out.println("Ingresa la nota de que le darias a Matrix");
            double notaMatrix=teclado.nextDouble();
            mediaEvaluacionUsuario=mediaEvaluacionUsuario+notaMatrix;
        }
        System.out.println("la media de la pelicula claculada por el usuario es: "+mediaEvaluacionUsuario/3);


    }
}