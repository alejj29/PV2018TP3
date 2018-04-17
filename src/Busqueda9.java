
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Busqueda9 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        ArrayList<Libros> libro=new ArrayList<Libros>();
        int limite = 0;
        while (limite==0) {            
            System.out.println("Menu de usuario");
            System.out.println("1-Crear auto");
            System.out.println("2-Buscar Libro");
            System.out.println("3-salir");
            
            int opc=Integer.parseInt(scanner.nextLine());
            switch(opc){
                case 1:System.out.println("ingrese ISBM"); 
                    String isbm=scanner.nextLine();
                    System.out.println("ingrese titulo");
                    String titulo=scanner.nextLine();
                    System.out.println("ingrese autor");
                    String autor=scanner.nextLine();
                    System.out.println("ingrese precio");
                    double precio=Double.parseDouble(scanner.nextLine());
                    Libros l1=new Libros(isbm, titulo, autor, precio);
                    System.out.println("libro creado");
                    System.out.println(l1.toString());
                break;
                case 2:System.out.println("ingrese la isbm:");
                    String p=scanner.nextLine();
                    
                    int encontrado=0;
                    for (int i = 0; i < libro.size(); i++) {
                        System.out.println("-----");
                        if (p.equals(libro.get(i).getISBN())) {
                            System.out.println("libro encontrado");
                            System.out.println("titulo:"+libro.get(i).getTítulo());
                            System.out.println("autor:"+libro.get(i).getAutor());
                            System.out.println("precio:"+libro.get(i).getPrecio());
                            encontrado=1;
                        }
                    }
                    if (encontrado==0) {
                        System.out.println("Libro no  encontrado");
                    }
                break;
                case 3:
                    System.out.println("El programa finaliso");
                    limite=1;
                break;
                default:
                    System.out.println("opcion n valida ");
            }
        }
        
    }
    
}


