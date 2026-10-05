import java.util.Scanner;

public class proyectoFinal{
    public static void main(String[] args) {
        String opcion = "0";

        while (!opcion.equals("6")) {

            System.out.print("\033[H\033[2J");
            System.out.flush();
            opcion = System.console().readLine((""" 
                            Proyecto Final de la materia Fundamentos de computacion 1
                            Desarrollo por Santiago Pérez Cáñez
                               Menu principal\n
                               1. if - Triangulos
                               2. for - Padovan
                               3. while - Sumatoria de 1/1+1/2+...+1/n
                               4. do - Conjetura de Collatz
                               5. Arreglos - Rotar un arreglo a la derecha
                               6. Salir del sistema
                               Que quieres hacer y apurate que ando de malas: 
                               """));
            

            switch (opcion) {
                case "1":
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    triangulos();                     
                break;

                case "2":
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    padovan();
                break;

                case "3":
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    sumatoria();
                break;

                case "4":
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    collatz();
                break;

                case "5":
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    rotar();
                break;

                case "6":
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Gracias por usar el sistema");
                    break;

                default:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println(opcion + " No disponible (opciones del 1 al 6)");
                    System.console().readLine("Presione Enter para continuar");
                break;
            }
        }
    }

    static void triangulos(){
        System.out.println("Sistema para determinar si tres longitudes cumplen con ser un triángulo y su tipo");
        System.out.println("Desarrollado por Pérez Cáñez Santiago");
        float lado1=Float.parseFloat(System.console().readLine("Ingrese el lado 1: "));
        if(lado1>0){
            float lado2=Float.parseFloat(System.console().readLine("Ingrese el lado 2: "));
            if(lado2>0){
                float lado3=Float.parseFloat(System.console().readLine("Ingrese el lado 3: "));
                if(lado3>0){
                    System.out.println("Todas las medidas son positivas");
                    
                    float mayor=lado1;

                    if(mayor<lado2){
                        mayor=lado2;
                    }
                    
                    if(mayor<lado3){
                        mayor=lado3;
                    }
                    
                    System.out.println("El lado mayor es: "+mayor);

                    if(mayor<=lado1+lado2+lado3-mayor){
                        System.out.println("Si soy un triángulo");
                        System.out.println("Porque se cumple que "+mayor+" <= "+(lado1+lado2+lado3-mayor));
                        if(lado1==lado2&&lado2==lado3){
                            System.out.println("Soy un triángulo equilátero");
                        }else{
                            if(lado1!=lado2&&lado1!=lado3&&lado2!=lado3) {
                                System.out.println("Soy un triángulo escaleno");
                            }else{
                                System.out.println("Soy un triángulo isóceles");
                            }
                        }
                    }else{
                        System.out.println("Con esas medidas no es posible formar un triángulo");
                        System.out.println("Porque no se cumple que "+mayor+" <= "+(lado1+lado2+lado3-mayor));
                    }
                }else{
                    System.out.println("Error en la longitud 3");
                }
            }else{
                System.out.println("Error en la longitud 2");
            }
        }else{
            System.out.println("Error en la longitud");
        }
        System.console().readLine("\nPresione Enter para continuar");
    }

    static void padovan(){
        System.out.println("Sucesión de Padovan\nDesarrollado por Santiago Pérez Cañez");

        int limite = Integer.parseInt(System.console().readLine("Ingrese el límite de la serie: "));
        
        if (limite >= 0) {
            int primerNum=1, segundoNum = 1, tercerNum=1, sigNum;
            System.out.print(primerNum+", "+segundoNum+", "+tercerNum);

            for(; primerNum<=limite;){
                sigNum=primerNum+segundoNum;
                if(sigNum <= limite){
                    System.out.print(", "+sigNum);

                    primerNum=segundoNum;
                    segundoNum=tercerNum;
                    tercerNum=sigNum;
                }else{
                    break;
                }
            }
            System.out.print(".");
        }else{
            System.out.println("Error en el límite");
        }
        System.console().readLine("\nPresione Enter para continuar");
    }

    static void sumatoria(){
        System.out.println("Programa que calcula la sumatoria de 1/1+1/2+...+1/n\nDesarrollado por Santiago Pérez Cáñez");

        int num=Integer.parseInt(System.console().readLine("Ingrese el límite de la sumatoria: "));

        double acum=0, i=0;

        while(i<num){
            i++;
            acum+=1/i;
            if(i!=num){
                System.out.print("1/"+i+" + ");
            }else{
                System.out.print("1/"+i+" = "+acum);
            }
        }
        System.console().readLine("\nPresione Enter para continuar");
    }

    static void collatz(){
        System.out.println("Conjetura de Collatz\nDesarrollado por Santiago Pérez Cáñez");

        int num;
        
        do { 
            try {
                num=Integer.parseInt(System.console().readLine("Ingrese un número entero positivo: "));
                if(num<=0){
                    System.out.println("Entero natural");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Entero natural");
            }
        } while (true);
        
        if(num>0){
            do{
                if(num%2==0){
                    num/=2;
                }else{
                    num=num*3+1;
                }
                System.out.println(num);
            }while(num!=1);
        }else{
            System.out.println("Número no valido");
        }

        System.console().readLine("\nPresione Enter para continuar");
    }

    static void rotar(){
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];

        System.out.println("Desarrollado por Santiago Pérez Cáñez");
        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        System.out.print("Introduce el número de posiciones a rotar: ");
        int k = scanner.nextInt();

        k = k % arreglo.length;

        int[] rotado = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            rotado[(i + k) % arreglo.length] = arreglo[i];
        }

        System.out.print("Arreglo después de rotar: ");
        for (int num : rotado) {
            System.out.print(num + " ");
        }

        System.console().readLine("\nPresione Enter para continuar");
    }
}
