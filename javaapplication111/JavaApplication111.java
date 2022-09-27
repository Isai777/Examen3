
package javaapplication111;

import java.util.Scanner;

/**
 *
 * @author Isai
 */
public class JavaApplication111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int respuesta,respuesta2;
        Scanner s = new Scanner(System.in);
        Scanner n = new Scanner(System.in);

        System.out.println("-------------------Tipos de musica------------------");
        
        System.out.println("Ingresa el genero que mas te gusta de los siguientes");
        
        System.out.println("\n (1) Pop"
                + "\n (2) Regueton"
                + "\n (3) Rap");
               
        respuesta=s.nextInt();
        switch(respuesta){
            
            case(1):
                ClasePadre pop = new Pop();
                System.out.println("Tu eleccion fue el pop");
                pop.PedirRegionPop();
                pop.Operaciones();
                pop.MostrarResultados();
                
                System.out.println("Escoje de esta lista de cantantes, un artista pop: "
                        + "\n(1) Sebastian Yatra"
                        + "\n(2) Michael Jackson"
                        + "\n(3) Taylor Swift");
                respuesta2=n.nextInt();
                
                switch(respuesta2){
                    
                    case(1):                 
                                
            vistas v=new vistas();
                        System.out.println("Las canciones mas populares de Sebastian Yatra son: ");
                        System.out.println("Ojos marrones ");
                        System.out.println("Tacones rojos ");
                        System.out.println("Pareja del año ");
                        v.viisitas(576889900, 332993909, 14613507);
                        break;
                    case(2):
                        vistas w=new vistas();
                        System.out.println("Las canciones mas populares de Michael Jackson son: ");
                        System.out.println("Billie Jean ");
                        System.out.println("Beat it ");
                        System.out.println("Chicago ");
                        w.viisitas(654165446, 553993909, 14613507,0);
                        break;
                    case(3):
                         vistas z=new vistas();
                        System.out.println("Las canciones mas populares de Taylor Swift son: ");
                        System.out.println("august ");
                        System.out.println("dont Blame Me ");
                        System.out.println("Blank Space ");
                        z.viisitas(506889900, 888993909, 45613507,0,0);
                        break;
                        default:
                System.out.println("Opcion no valida");
                }
                
                break;
            case(2):
                ClasePadre reg = new Regueton();
                System.out.println("Tu eleccion fue el Regueton");
                reg.PedirRegionRegueton();
                reg.Operaciones();
                reg.MostrarResultados();
                
                System.out.println("Escoje de esta lista de cantantes, un artista pop: "
                        + "\n(1) Bd bunny"
                        + "\n(2) Ozuna"
                        + "\n(3) karol g");
                respuesta2=n.nextInt();
                
                switch(respuesta2){
                    
                    case(1):                 
                                
            vistas v=new vistas();
                        System.out.println("Las canciones mas populares de Bad bunny son: ");
                        System.out.println("Me porto bonito ");
                        System.out.println("efecto ");
                        System.out.println("ojitos lindos ");
                        v.viisitas(576889900, 332993909, 14613507);
                     break;
                    case(2):
                        vistas w=new vistas();
                        System.out.println("Las canciones mas populares de Ozuna son: ");
                        System.out.println("Diles ");
                        System.out.println("Solita ");
                        System.out.println("SG ");
                        w.viisitas(45165446, 453993909, 7893507,0);
                        break;
                    case(3):
                         vistas z=new vistas();
                        System.out.println("Las canciones mas populares de KarolG son: ");
                        System.out.println("Provenza ");
                        System.out.println("Gatubela ");
                        System.out.println("Mamii ");
                        z.viisitas(1239900, 788993909, 78913507,0,0);
                        break;
                        default:
                System.out.println("Opcion no valida");
                }
                break;
                
                
            case(3):
                ClasePadre rap = new Rap();
                System.out.println("Tu eleccion fue el Rap");
                rap.PedirRegionRap();
                rap.Operaciones();
                rap.MostrarResultados();
                System.out.println("Escoje de esta lista de cantantes, un artista pop: "
                        + "\n(1) Bzrp"
                        + "\n(2) Aczino"
                        + "\n(3) Vico C");
                respuesta2=n.nextInt();
                
                switch(respuesta2){
                    
                    case(1):                 
                                
            vistas v=new vistas();
                        System.out.println("Las canciones mas populares de Bzrp son: ");
                        System.out.println("bzrp quevedo ");
                        System.out.println("bzrp Lgant ");
                        System.out.println("bzrp Aczino ");
                        v.viisitas(576889900, 332993909, 14613507);
                     break;
                    case(2):
                        vistas w=new vistas();
                        System.out.println("Las canciones mas populares de Aczino son: ");
                        System.out.println("Cielo ");
                        System.out.println("Mi vida ");
                        System.out.println("MG ");
                        w.viisitas(45165446, 453993909, 7893507,0);
                        break;
                    case(3):
                         vistas z=new vistas();
                        System.out.println("Las canciones mas populares de vico C son: ");
                        System.out.println("Lente ");
                        System.out.println("Oye ");
                        System.out.println("Rap f ");
                        z.viisitas(1239900, 788993909, 78913507,0,0);
                        break;
                        default:
                System.out.println("Opcion no valida");
                }
                break;
            
            default:
                System.out.println("Opcion no valida");
        }
        
    }
    
}











