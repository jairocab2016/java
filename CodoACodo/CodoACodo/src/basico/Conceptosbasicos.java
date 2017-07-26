﻿package basico;
// -----------------------------------------------------------------------------
// --	Curso Java Inicial
// --   Profesor: Jorge Sanchez	intercrios@hotmail.com
// --	Revisión: Marzo 2015
// --	Archivo: Parte_01.Java
// --   Duración estimada: 8 Hs Reloj
// --  	Temas a desarrollar:	
// --		- Introducción a JAVA.
// --		- Que es el JDK.
// --           - Uso de la IDE.
// --		- "Hola Mundo" y Comentarios
// --		- Uso de Variables y tipo de datos.
// --		- Operadores Relacionales.
// --		- Operadores Lógicos.
// --		- Operadores Binarios.
// -- 		- Concepto de operador Unario, Binario y Ternario.
// --		- Lógica básica.
// --		- Estructuras condicionales IF - IF ELSE - SWITCH.
// --		- Laboratorio de Práctica.
// -----------------------------------------------------------------------------


import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class Conceptosbasicos {

    public static void main(String args[]) {

// -----------------------------------------------------------------------------
//        Qué es Java?
//
//        Introducción
//
//        JAVA es una tecnología pensada para desarrollo de aplicaciones de gran
//        envergadura, altamente escalables, de gran integración con otras
//        tecnologías y sumamente robustas.
//
//        Sus principales características son presentadas a continuación:
//        Lenguaje orientado a objetos
//        Respeta el paradigma de orientación a objetos, permitiendo utilizar 
//        los fundamentos del mismo:
//
//        Herencia
//        Polimorfismo
//        Abstracción
//        Encapsulamiento
//
//        Todos estos conceptos serán presentados mas adelante.
//
//        -Sintaxis basada en C/C++
//        Aporta gran simplicidad ya que es una de las formas de escribir código
//        mas reconocidas y difundidas, y permite incorporar rápidamente a los
//        programadores que conocen este lenguaje.
//
//        -Multiplataforma
//        Significa que su código es portable, es decir se puede transportar por
//        distintas plataformas. De esta manera es posible codificar una única 
//        vez una aplicación, y luego ejecutarla sobre cualquier plataforma y/o
//        sistema operativo.
//
//        -Manejo automático de memoria
//        No hay que preocuparse por liberar memoria manualmente ya que un 
//        proceso propio de la tecnología se encarga de monitorear, y por 
//        consiguiente eliminar el espacio ocupado que no esta siendo utilizado. 
//        El proceso encargado de realizar este trabajo se denomina Garbage 
//        Collector.
//
//        -Evolución permanente
//        La tecnología esta en constante evolución debido a la gran cantidad de
//        consumidores que poseen, JAVA es uno de los lenguajes mas utilizados
//        en el mundo, y SUN pretende estar a la altura de la situación 
//        ofreciendo constantemente nuevas entregas.
//
//        -Organización
//        La tecnología esta organizada en tres grandes áreas bien definidas:
//
//        JME (Mobile / Wireless)Esta área tiene como objetivo el desarrollo de
//        aplicaciones móviles, tales como GPS, celulares y otros dispositivos 
//        móviles programables.
//        JME significa Java Micro Edición.
//
//        JSE (Core / Desktop)
//        Esta área tiene como objetivo el desarrollo de aplicaciones de
//        escritorio, similares a las aplicaciones tipo ventanas creadas con
//        Visual Basic o Delphi. Incluye la funcionalidad básica del lenguaje 
//        como manejo de clases, colecciones, entrada/salida, acceso a base de 
//        datos, manejo de sockets, hilos de ejecución, etc.
//        JSE significa Java Standard Edition.
//
//        JEE (Enterprise / Server)
//        Esta área tiene como objetivo el desarrollo de aplicaciones
//        empresariales, de gran envergadura. Contempla ambientes web, como los
//        ambientes manejados por servidores de aplicación. Las tecnologías
//        principales incluidas en esta area son Servlets, JSP y EJB, entre 
//        otras.
//        JEE significa Java Enterprise Edition.
//
//
// -----------------------------------------------------------------------------
//        La historia
//
//        El comienzo
//
//        En el año 1990 nace Java, bajo el diseño y la implementación de la
//        empresa Sun Microsystems. El padre-fundador de la tecnología es el 
//        James Gosling , a través de una filial dentro de Sun llamada First 
//        Person Inc.
//        Gosling tuvo la visión inicial de construir una lenguaje de 
//        programación capaz de ejecutar su código sobre cualquier set de 
//        instrucciones, de distintos procesadores. Inicialmente el proyecto 
//        apuntó a la programación unificada de distintos electrodomésticos, es 
//        decir programar una sola vez y que el programa generado fuera util 
//        para cualquier dispositivo.
//        El proyecto inicial de Java fue técnicamente un éxito, aunque
//        comercialmente no tuvo el rendimiento esperado, y debio ser relegado
//        unos años.
//
//        Aparición de Internet
//        En el año 1993, Internet da el gran salto, y se convierte de una
//        interfaz textual a una interfaz grafica.
//        Java ve una oportunidad y entra fuertemente a internet con los Applets,
//        pequeños programitas construidos en Java con todos sus beneficios
//        capaces de ejecutarse dentro de un navegador. Es aquí donde Java
//        comienza a dar sus primeros pasos firmes como lenguaje a difundir
//        masivamente. En el año 1995, el navegador Netscape Navigator comienza
//        formalmente a soportar los Applets Java.
//        Adicionalmente, el lenguaje podía adaptarse fácilmente a las múltiples
//        plataformas, con lo cual surge una de las primeras aplicaciones
//        multiplataformas mas conocidas: WebRunner (hoy HotJava), un navegador
//        multiplataforma construido en Java.
//
//        Por qué el nombre JAVA
//        Inicialmente la intención fue nombrar al lenguaje de programación con 
//        el nombre de Oak, pero este ya estaba registrado. La leyenda cuenta 
//        que una visita a la cafetería le dio rápida solución al problema.
//        En las confiterías norteamericanas hay un café denominado Java, en el
//        cual esta inspirado el nombre del lenguaje de programación. El 
//        logotipo de Java es justamente una taza café.
//
//
// -----------------------------------------------------------------------------
//        Desarrollo, compilación y ejecución
//
//        Organizacion El Java Development Kit (JDK)
//        El Java Development Kit es el kit de desarrollo propuesto por Sun
//        Microsystems para realizar desarrollos en JAVA. Se puede bajar de 
//        forma gratuita de la pagina
//        http://www.java.sun.com
//        El kit incluye herramientas de desarrollo tales como un compilador, un
//        debugger, un documentador para documentar en forma casi automática
//        una aplicación, un empaquetador para crear archivos de distribución, y
//        otras herramientas mas.
//        El kit no incluye un entorno de desarrollo interactivo (o IDE) como
//        pueden ser Netbeans, Jdeveloper o Eclipse.
//
//        El compilador
//
//        El compilador viene incluido como una herramienta dentro de la JDK, en
//        el sistema operativo Windows viene presentado como javac.exe
//        El compilador transforma los archivos de codigo fuente de java, es 
//        decir los archivos de texto con extension .java, en archivo compilados,
//        tambien denominados bytecode. Los archivos compilados tiene la 
//        extension .class, y son archivos binarios.
//
//        El Java Runtime Environment (JRE)
//        Java Runtime Environment es el ambiente de ejecucion de Java, y 
//        tambien esta incluido en la JDK. Tiene como componentes mas 
//        importantes a la Java Virtual Machine y a las class libraries, que son
//        las que contienen las clases base del lenguaje de programacion JAVA.
//        El JRE se distribuye también en forma independiente, es decir sin la
//        JDK, ya que cuando es necesario desplegar una aplicación hecha en JAVA
//        en el cliente, no es necesario instalarle herramientas que son propias
//        del proceso de desarrollo, como ser el compilador, empaquetador,
//        documentador, y otros.
//        Sin una JRE instalada no es posible ejecutar una aplicación construida
//        en JAVA.
//        En Windows, el comando para invocarlo es el java.exe
//
//
//        La Java Virtual Machine (JVM)
//        Que es
//        La Java Virtual Machine viene incluida dentro de la Java Runtime
//        Environment, y tiene como principal objetivo la ejecucion de codigo 
//        JAVA compilado, es decir de los archivo .class
//        La JVM se encarga de interpretar el bytecode y convertirlo a codigo
//        nativo en tiempo de ejecución, lo cual hace que la ejecucion sea un
//        poco mas lenta pero garantiza la portabilidad, es decir que el 
//        lenguaje sea multiplataforma. De esta manera el codigo compilado JAVA 
//        se puede ejecutar en cualquier plataforma (arquitectura + sistema 
//        operativo) que tenga instalada el JRE.
//        Write once, run anywhere" es la política desde el primer dia de JAVA,
//        es decir construir la aplicacion una vez y ejecutarla en cualquier 
//        lado.        
        

// -----------------------------------------------------------------------------
// Como empezar:
// SoftWare:
//         Descargar   JDK 7   www.oracle.com
//                     netbeans IDE 8.x   netbeans.org
        
// JDK  JAVA DEVELOPMENT KIT
// Opción Libre OpenJDK
// IDE  Integrated Development Enviroment.
        
// Otras IDEs: Eclipse - JDeveloper - Visual Studio -
// Editores avanzados de Programación: notepad++ - Sublime Text

// Versiones de Java
// Java SE      Standard Edition
// Java EE      Enterprise Edition
// Java ME      Micro Edition
// Java FX      Rich Internet Applications (RIAs),


// la doble barra permite los comentarios
// los comentarios sirven para documentar el codigo
// o para anular parte del codigo
// no usamos acentos por que se distorciona
// Para cambiar el tamaño de la fuente en el editor netbeans, 
// Presionar la tecla ALT Derecha y mover la ruedita del mouse

// -----------------------------------------------------------------------------
// uso de Comentarios
//        Este
//        es
//        un
//        comentario
        /*
         Bloque
         de
         Comentarios
         */
        
        
        
        // ---------------------------------------------------------------------
        // Primer Programa
        // impresión en pantalla
        System.out.println("Hola Mundo");
        System.out.println("JAVA 2 SE");
        System.out.print("1"); //imprime en una misma linea
        System.out.print("2");
        System.out.print("3");
        System.out.print("4");
        System.out.println("5");
        System.out.println("probando");
        System.out.println("");
        System.out.println("");
        // sout seguido de la tecla TAB es el metodo abreviado de println
        // el atajo de teclado solo es valido para netbeans ide

        // Secuencias de escape
        System.out.println("Hola mundo \n\n");
        // \n hace que se deje una linea extra despues imprimir en consola

        System.out.println("\thola");
        // \t deja espacio de tabulación antes de imprimir

        System.out.println("\n\n\thola");
	// puedo combinar los modificadores

        // JAVA no tiene una instrucción que limpie la consola
        // Otros lenguajes si
        
        
        // ---------------------------------------------------------------------
        // Variables
	// Las variables son estructuras de almacenamiento en memoria RAM.
        // Memoria RAM: Volatil		Veloz	Costosa
        // Disco Duro:	 Persistente	Lento	Barato
        // Java - C++ - C#.net - VB.net son lenguajes tipados.
        // PHP - Python son lenguajes no tipados.
        

        // ---------------------------------------------------------------------  
        // Declaración de variables enteras
        // --------------------------------------------------------------------- 
        //los nombres de variables se fijan en minusculas
        int a;      //declare una variable
        a = 2;      //asigne valor a la variable

        int b = 3;  //declare y asigne valor en una sola linea

        int q = 4, w = 5, r = 20; // puedo declarar y asignar varias variables

        // int a=4;
        // sólo se puede definir una ves la variable
        a = 30;
        a = 40;
        a = 2;
        // pero puede asignar valor cuantas veces quiera

        int c = a + b;
        int d = 100;

        System.out.print("Variable A = ");
        System.out.println(a);
        System.out.print("Variable B = ");
        System.out.println(b);
        System.out.print("Variable C = ");
        System.out.println(c);
        System.out.print("Variable D = ");
        System.out.println(d);

        System.out.println(2 + 2);    // salida 4
        System.out.println("2" + 2);  // salida 22

        System.out.println("A + B = " + a + b); // error produce la concatenación

        System.out.print("A + B = ");
        System.out.println(a + b);

        System.out.println("A + B = " + (a + b));

        // los nombres de todos los tipos de variables van en minúsculas
        // es una convención, los nombres de variables pueden tener
        // letras y números, pero no pueden iniciar su nombre en número
        // para nombres de varias palabras se usa camelCase
        // camelCase : letra camello inicia todominuscula, pero cada palabra 
        // empieza en mayuscula
        // Ejemplo: int=controlTemperatura2;
        // no se puede int 2controlTemperatura; //ERROR
        // La ide marca como warning las variables declaras pero no usadas.
        
        
        
        // ---------------------------------------------------------------------
        // Variables String
        // --------------------------------------------------------------------- 
        
        // Las variables del tipo String almacenan caracteres de texto y numeros 
        // como caracteres.
        // String empieza con mayúsculas por que es una clase no un tipo de 
        // datos primitivo.
        // No existe el tipo de datos primitivo string en java, si en C#
        String p;
        String l;
        String f;

        p = "Perro";
        l = "Ladra";
        f = "fuerte";

        //String p="perro";                         //permitido
        //String p="perro", l="ladra",f="fuerte";   //permitido
        System.out.println(p + l);

        System.out.println(p + " " + l);

        System.out.println(p + c);
        System.out.println("2" + 2);
        // Siempre que hay un termino String o literal, el operador +
        // actua como concatenador, no suma.

        //System.out.println("el {0} que {1} muy {2}",p,l,f);
        // no funciona es este lenguage, si en C++ o C#
        
        
        // --------------------------------------------------------------------- 
        // Variables Chars UNICODE 2 Bytes 
        // ---------------------------------------------------------------------
        char o = 65;
        char i = 67;
        System.out.println(o + " " + i);
        char ii = 'a';
        System.out.println(ii);

        
        // --------------------------------------------------------------------- 
        // Variables Booleans
        // --------------------------------------------------------------------- 
        boolean z;
        z = true;
        System.out.println(z);
        z = false;
        System.out.println(z);

        
        // --------------------------------------------------------------------- 
        // Variables float 32 bits
        // --------------------------------------------------------------------- 
        float fl = 0;
        System.out.println(fl);
        fl = 95.60f;
        System.out.println(fl);

        
        // --------------------------------------------------------------------- 
        // Variables double 64 bits
        // --------------------------------------------------------------------- 
        double dl = 0;
        System.out.println(dl);
        dl = 95.60d;
        System.out.println(dl);

        // Ensayo de presición decimal
        fl = 10;
        dl = 10;
        System.out.println(fl / 3);
        System.out.println(dl / 3);

        
	//        int u;
        //        System.out.println(u);
        // las variables no se inicializan en ningun valor, por eso no se puede 
        // imprimir
        
        
        // --------------------------------------------------------------------- 
        // Operador de Asignación =
        // --------------------------------------------------------------------- 
        int nro1 = 5;
        int nro2 = 7;

        System.out.println(nro1);
        System.out.println(nro2);

        nro1 = nro2;
        // <--
        // el igual es el operador de asignación y
        // la asignacion se produce de derecha a izquierda

        System.out.println(nro1);
        System.out.println(nro2);

        
	// --------------------------------------------------------------------- 
        // INCREMENTALES
        // --------------------------------------------------------------------- 
        //suma 1 a la variable ++
        nro1++; // es eficiente que la segunda
        // nro1=nro1+1 // ambas producen el mismo resultado
        System.out.println(nro1);

        //resta 1 a la variable -- 
        nro1--;
        // nro1=nro1-1
        System.out.println(nro1);

        //agregar un valor x a la variable +=
        nro1 += 7;
        //nro1=nro1+7
        System.out.println(nro1);

        //quitar un valor a la variable -=
        nro1 -= 7;
        //nro1=nro1-7
        System.out.println(nro1);

        //Multiplicar por un valor a la variable *=
        nro1 *= 5;
        //nro1=nro1*5
        System.out.println(nro1);

        //Dividir por un valor a la variable /=
        nro1 /= 5;
        //nro1=nro1/5
        System.out.println(nro1);

        // los operadores ++ -- += -= *= /=
        // no llevan espacios entre los 2 caracteres
        // no se le puede cambiar el orden de los caracteres
        // separador de consola para no mesclar los resultados
        System.out.println("-------------------------------");

        // Precedencia y procedencia del operador ++ --
        System.out.println(nro1);
        System.out.println(nro1++); //primero imprime despues suma
        System.out.println(nro1); // el resultado de la suma lo vemos aca

        System.out.println("-------------------------------");

        System.out.println(nro1);
        System.out.println(++nro1); //primero suma despues imprime
        System.out.println(nro1);

        System.out.println("-------------------------------------------------");
        System.out.println(nro2 = 8); //primero asigna despues imprime

        
        // --------------------------------------------------------------------- 
        // Definición de constantes usando final y en mayusculas
        // ---------------------------------------------------------------------
        // la palabra final define a las constantes
        // por conveción los nombres de constantes van en mayusculas
        final float PI = 3.14f;
        System.out.println(PI);
        //  Esto No es posible  PI ++
        System.out.println(PI);
        

        // ---------------------------------------------------------------------
        // Lógica Básica
        // ---------------------------------------------------------------------
        
        // tablas de verdad
        // ---------------------------------------------------------------------
        //  X       Y       Or      And
        //  F       F       F       F
        //  F       V       V       F
        //  V       F       V       F
        //  V       V       V       V
        
        
	// ---------------------------------------------------------------------
        //operadores lógicos
        // ---------------------------------------------------------------------
        //   &&  operador Y Lógico
        //   ||  operador O Lógico (ALT 124)
        //   !  Operador NOT
        //   =!  operador no igual
        //   == operador de comparación  
        // los operadores logicos primero analiza el operador
        // y despues los terminos
        
        
        boolean log1 = true;
        boolean log2 = false;
        boolean resultado1 = log1 && log2;
        System.out.println(resultado1);
        System.out.println(log1 || log2);
        System.out.println(resultado1 || log2);
        System.out.println(!log1);
        log1 = !log2;
        System.out.println(log1);

        // cuidado con el doble negado
        System.out.println(! !log1);

        // ---------------------------------------------------------------------
        // operadores Binarios
        //   &  operador Y 
        //   |  operador O 
        // Estos operadores siempre analizan los dos terminos
        // y despues la operación
        
        System.out.println(log1 | log2);
        System.out.println(log1 & log2);

        System.out.println("mas operadores Logicos");
        int nro3 = 4;
        int nro4 = 4;
        int nro5 = 5;
        System.out.println(nro3 == nro4);
        System.out.println(nro3 != nro4);
        System.out.println(nro4 == nro5);

        System.out.println("más todavia");
        System.out.println(nro3 > 4);
        System.out.println(nro3 > 4 && nro1 > nro2);
        System.out.println(nro3 > 0 && nro1 + nro2 == 10);

	// los operadores == != >= <=
        // no llevan espacios entre los 2 caracteres
        // no se le puede cambiar el orden de los caracteres
        // Operador ^ OR exclusivo
        // no hay ^^
        // Funciona como el OR pero si ambos operadores son true devuelve false
        // Para devolver true, ambos operadores deben ser diferentes
        // Comparación de Strings usando el metodo equals
        String texto = "hola";
        //System.out.println(texto=="hola");
        System.out.println(texto.equals("hola"));

        boolean k = true;
        boolean t = true;
        System.out.println(k ^ t);
        //int a;
        a = 30;
        a = (k ? a++ : a--);
        System.out.println(a);

        
        // ---------------------------------------------------------------------
        // Estructura Condicional IF
        // ---------------------------------------------------------------------
        int condicion = 3;
        System.out.println("Condición = " + condicion);

        // modo recomendado para JAVA
        if (condicion == 3) {
            System.out.println("La condición se cumplio");
        }
	// notar que cuando abrimos unas { y luego presionamos enter
        // el editor agrega automaticamente la } que cierra

        // Mala Práctica -- modo abreviado para una sola sentencia
        // sin llaves
        if (condicion == 3) 
            System.out.println("La condición se cumplio");
        

        // el primer punto y coma finaliza la estructura
        // solo cuando hay una sola linea en el ambito
        // Mala Práctica -- Modo colegio
        if (condicion == 3) 
        {
            System.out.println("La condición se cumplio");
        }
        // este modo es muy comun en educación pero da lugar a poner por error ; 
        // detras de la sentencia IF
        // este modo es el recomendado por Microsoft para C# y C++ no es para java, 
        // pero igual se lo puede usar 

        
        // ---------------------------------------------------------------------
        // Estructura Condicional IF ELSE
        // ---------------------------------------------------------------------
        if (true) {
            System.out.println("La condición se cumplio");

        } else {
            System.out.println("La condición no se cumplio");

        }

        // Mala Práctica -- Modo abreviado
        // solo cuando hay una sola linea en el ambito
        if (true) 
            System.out.println("La condición se cumplio");
         else 
            System.out.println("La condición no se cumplio");
        

        // Mala Práctica -- Modo colegio // ocupa mucho espacio
        // este modo es el recomendado para C# y C++ no es para java, 
        // pero igual se lo puede usar 
        if (true) 
        {
            System.out.println("La condición se cumplio");
        } 
        else 
        {
            System.out.println("La condición no se cumplio");
        }

	// ERROR NUNCA PONER ; DESPUES DE LA SENTENCIA
        // if (condicion == 3);
        // System.out.println("La condición se cumplio");
        // ERROR NUNCA PONER ; DESPUES DE LA SENTENCIA	
        // if (condicion == 3);
        // {
        // System.out.println("La condición se cumplio");
        // }
        
        
        
        // ---------------------------------------------------------------------
        // Estructura si anidada
        // ---------------------------------------------------------------------
        String clima, plata;

        clima = "bueno";
        plata = "si";

        System.out.println("El Clima es :" + clima);
        System.out.println("Hay Plata :" + plata);

        if (clima == "bueno") {
            if (plata == "no") {
                System.out.println("Ponete la bata por que no salimos, no hay plata");
            } else {
                System.out.println("salimos");
            }
        } else {
            System.out.println("Ponete la bata por que no salimos, el clima esta malo");
        }

        
        // ---------------------------------------------------------------------
        // estructura de selección switch case
        // ---------------------------------------------------------------------
        int cond = 12;

        switch (cond) {
            case 10:
                System.out.println("El Valor 10");
                break;
            case 11:
                System.out.println("El Valor 11");
                break;
            case 12:
                System.out.println("El Valor 12");
            case 13:
                System.out.println("El Valor 13");
            case 14:
                System.out.println("El Valor 14");
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                System.out.println("El Valor es entre 15 y 20");
                break;
            default:
                System.out.println("El Valor otro");
        }

        //  Limitación 1: solo admite una condición. No son validos los 
        //  operadores && y ||. 
        //  Limitación 2: en esa condición se presupone que el operador de 
        //  relación es la comparacion (==). 
        //  Limitación 3: la variable asociada a la condición solo puede ser de
        //  tipo byte, short, int o char, ninguna otra es valida. 
        //  si no hay break continua ejecutando hasta encontrar un break
        

        // ---------------------------------------------------------------------
        // Ingresos por consola
        // Entradas de teclado
        // Al inicio del codigo importamos la libreria Scanner de Java Util
        // import java.util.Scanner;
        Scanner teclado = new Scanner(System.in);
        int valor1;
        int valor2;
        System.out.println("Ingrese el Valor 1 :");
        valor1 = teclado.nextInt();
        System.out.println("Ingrese el Valor 2 :");
        valor2 = teclado.nextInt();

        System.out.println("El Valor 1 es:" + valor1);
        System.out.println("El Valor 2 es:" + valor2);

        // en caso de ingresar String usar el metodo .next()
        // en caso de ingresar float usar el metodo .nextFloat()
        
        
        // ---------------------------------------------------------------------
        // Ingreso de datos usando JOptionPane
        // Al inicio del codigo importamos la libreria Scanner de Java Util
        //import javax.swing.JOptionPane;
        
        JOptionPane.showMessageDialog(null,"Hola");
        String texto2=JOptionPane.showInputDialog("Ingrese un texto");
        JOptionPane.showMessageDialog(null,texto2);
        
        
        
	//---------------------------------------------------------------------- 
        // Laboratorio Parte 1 Estructura de control IF
        //---------------------------------------------------------------------- 
        
        
        // Ejercicio 1.
        // Dado el siguiente código:
        // int nro1 = 100, nro2 = 500, nro3 = 250;
        // Informar cual de los 3 números es el mayor.
        // Requisitos: se necesita tener conocimiento de operadores mayor y 
        // menor, y la utilizacion de if anidados.
        
        // int
        nro1 = 150;
        // int
        nro2 = 500;
        // int
        nro3 = 250;

        if (nro1 > nro2) {
            if (nro1 > nro3) {
                System.out.println("el mayor es el Numero 1");
            } else {
                System.out.println("el mayor es el Numero 3");
            }

        } else {
            if (nro2 > nro3) {
                System.out.println("el mayor es el Numero 2");
            } else {
                System.out.println("el mayor es el Numero 3");
            }

        }

        
        
	// Ejercicio 2
        // Dado el siguiente código:
        // int a=10, b=-2, c=5; // hay 2 numeros positivos y 1 negativo
        // Informar la multiplicación de los dos números positivos.
        
        // int
        a = 10;
        // int
        b = -2;
        // int
        c = 5;

        if (a < 0) {
            System.out.println(b * c);
        } else {
            if (b < 0) {
                System.out.println(a * c);
            } else {
                System.out.println(a * b);
            }

        }
        
        

	// Ejercicio 3
        // Dado el siguiente código:
        // String usuario = "pepito", clave = "123";
        // Informar los siguientes casos:
        // si usuario="pepito" y clave="123" Informar "Bienvenido pepito!"
        // si usuario="pepito" y clave no es "123" 
        // informar "El usuario no coincide con la contraseña"
        // si el usuario no es "pepito" informar "El usuario no existe!"
        
        String usuario, clave;
        usuario = "Pepito";
        clave = "123";

        if (usuario == "Pepito" && clave == "123") {
            System.out.println("Bienvenido Pepito");
        } else {
            if (usuario == "Pepito") {
                System.out.println("Contraseña Incorrecta");
            } else {
                System.out.println("Usuario Incorrecto");
            }
        }

        
	// remake Trabajo 3 con consola
        // String usuario, clave;
        // Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese su nombre de Usuario:");
        usuario = teclado.next();
        System.out.println("Ingrese su clave:");
        clave = teclado.next();

        if (usuario.equals("Pepito") && clave.equals("123")) {
            System.out.println("Bienvenido Pepito");
        } else {
            if (usuario.equals("Pepito")) {
                System.out.println("Contraseña Incorrecta");
            } else {
                System.out.println("Usuario Incorrecto");
            }
        }
        // el metodo equals compara la propiedad texto de los objetos clase 
        // String.

        System.out.println("-- Fin del Programa --");
    }
}

