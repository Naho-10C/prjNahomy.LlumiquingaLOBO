import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int personaje = 1; 
        Scanner sc = new Scanner(System.in);
        String menu = "\n1 Observador \n2 Lobo \n3 Caperucita \n4 Uvas \n Escoger Personaje: ";
        String [] ladIzquierdo = {"Observador", "Lobo", "Caperucita", "Uvas"}, ladDerecho = {"  ", "  ","  ", "  "};

        System.out.print("\033[H\033[2J");
        System.out.print("\t COMIENZA EL JUEGO \n\tLLEVAR PERSONAJE" + menu);
        personaje = sc.nextInt();
        if (personaje<=4) {
            if (personaje == 3) {
                System.out.print("\033[H\033[2J");
                ladIzquierdo[2] = " "; ladDerecho[2] ="Caperucita";
                ladIzquierdo[0] = " "; ladDerecho[0] ="Observador";
                System.out.println(Arrays.toString(ladIzquierdo) + "\t\t" + Arrays.toString(ladDerecho));
                System.out.print("\t TRAER PERSONAJE" + menu);
                personaje = sc.nextInt();  
                if (personaje == 1) {
                    System.out.print("\033[H\033[2J");
                    ladIzquierdo[2] = " "; ladDerecho[2] ="Caperucita";
                    ladIzquierdo[0] = "Observador"; ladDerecho[0] =" ";
                    System.out.println(Arrays.toString(ladIzquierdo) + "\t\t" + Arrays.toString(ladDerecho));
                    System.out.print("\t LLEVAR PERSONAJE" + menu);
                    personaje = sc.nextInt();  
                    if (personaje==2) {
                        System.out.print("\033[H\033[2J");
                        ladIzquierdo[1] = " "; ladDerecho[1] ="Lobo";
                        ladIzquierdo[0] = " "; ladDerecho[0] ="Observador";
                        System.out.println(Arrays.toString(ladIzquierdo) + "\t\t" + Arrays.toString(ladDerecho));
                        System.out.print("\t TRAER PERSONAJE" + menu);
                        personaje = sc.nextInt();
                        if (personaje==3) {
                            System.out.print("\033[H\033[2J");
                            ladIzquierdo[2] = "Caperucita"; ladDerecho[2] =" ";
                            ladIzquierdo[0] = "Observador"; ladDerecho[0] =" ";
                            System.out.println(Arrays.toString(ladIzquierdo) + "\t\t" + Arrays.toString(ladDerecho));
                            System.out.print("\t LLEVAR PERSONAJE" + menu);
                            personaje = sc.nextInt();
                            if (personaje == 4) {
                                System.out.print("\033[H\033[2J");
                                ladIzquierdo[3] = " "; ladDerecho[3] ="Uvas";
                                ladIzquierdo[0] = " "; ladDerecho[0] ="Observador";
                                System.out.println(Arrays.toString(ladIzquierdo) + "\t\t" + Arrays.toString(ladDerecho));
                                System.out.print("\t TRAER PERSONAJE" + menu);
                                personaje = sc.nextInt();
                                if (personaje==1) {
                                    System.out.print("\033[H\033[2J");
                                    ladIzquierdo[0] = "Observador"; ladDerecho[0] =" ";
                                    System.out.println(Arrays.toString(ladIzquierdo) + "\t\t" + Arrays.toString(ladDerecho));
                                    System.out.print("\t LLEVAR PERSONAJE" + menu);
                                    personaje = sc.nextInt();  
                                    if (personaje == 3) {
                                        System.out.print("\033[H\033[2J");
                                        ladIzquierdo[2] = " "; ladDerecho[2] ="Caperucita"; 
                                        ladIzquierdo[0] = " "; ladDerecho[0] ="Observador";
                                        System.out.println(Arrays.toString(ladIzquierdo) + "\t\t" + Arrays.toString(ladDerecho));
                                        System.out.print("\t\t GANASTE FIN DE JUEGO !!");
                                    } else 
                                    System.out.println("GAME OVER");
                                } else 
                                System.out.println("GAME OVER");
                            } else 
                            System.out.println("GAME OVER");
                        } else 
                            System.out.println("GAME OVER");
                    } else 
                        System.out.println("GAME OVER");
                } else
                    System.out.println("GAME OVER");  
            } else
                System.out.println("GAME OVER");  
        } else {
            System.out.println("\t VALOR INCORRECTO");
        }
        sc.close();
    }
}     