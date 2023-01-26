# Notas Academy


Modulos en Java fueron lanzados en java 9, en esta academy no se ven.

Receso de 11 a 11:30

Comida de 2 a 3

## Prerrequisitos

* Java 8
* JRE
* Git

## TIPS

* Primero entender los paradigmas antes de adentrarse al código de un lenguaje.
* Siempre usar o basarse en los principios SOLID

## Paradigmas de Java

* OOP ---> No siempre es orientado a objetos por los datos primitivos
  * **Datos Primitivos**: 
    * boolean
    * char
    * byte
    * int
    * float
    * double
    * long
    * short
* Functional - desde sus inicios hasta java 8
* Reactivo -- desde Java 9
  * reactivex.io



## Ejercicios básicos

```java
package com.academy;

public class Main {
    public static void main(String[] args) {

        /**
         * Cuántos objetos se han creado? = 1
         * Cuántas variables de referencia se han creado? = 4
         */
        String x = "Hello";
        String y = "World";
        String z = x + y;

        //Instanciar un objeto de la clase String
        //2 objetos
        String w = new String("Hello");

        //Objeto vacío --> incorrecto
        y= null;

        //Concatenar
        x.concat(" World");
        System.out.println(x); //Hello

        //Concatenar
        System.out.println(x.equals(w)); //false

        //Comparación de objetos
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println(sb1.equals(sb2)); //false
    }
}
```



## Variables de referencia

Una variable de referenciq no es un objeto!
Las variables de referencia apunta a un objeto que nació con una propedad
Ejemplo: `String nombre = "Juan";`


Un objeto tiene:

* Atributos (propiedades)
* Métodos (comportamiento)



Un objeto puede ser: 

* Mutable
* Inmutable



Cuando se **castea** no involucra un objeto nuevo

el polimorfismo se basa siempre en variables de referencia



## Null

Tipo null

Cuando se declara `x = null`

Se pierde la referencia y ya no apunta al objeto


## String

Un string es inmutable

Un stringBuilder es mutable



```java
package com.academy.week1.class1;

public class Exercise2 {

    public static void main (String[] args) {

        String s = "Hello"; //Inmutable ---> Objeto
        StringBuilder sb = new StringBuilder("Hello"); //Mutable ---> Objeto

        s = "Another hello"; //Inmutable ---> Objeto, al hacer esto, se crea un nuevo objeto no se modifica el anterior
        System.out.println(s);

    }
}
```

Igual cuano se hace esto: 



```java
package com.academy.week1.class1;

public class Exercise2 {

    public static void main (String[] args) {

        String s = "Hello"; //Inmutable ---> Objeto
        StringBuilder sb = new StringBuilder("Hello"); //Mutable ---> Objeto

        s = "Another hello"; //Inmutable ---> Objeto, al hacer esto, se crea un nuevo objeto no se modifica el anterior
        System.out.println(s);
        
        s.concat(" World");
        //s = s.concat(" World");
        sb.append(" World");

        System.out.println(s);
        System.out.println(sb);
    }
}
```


### Pool de Strings

Cuando se hace: 

`String x = "hola";`

Se crea dentro el pool e strings

Si se hace:

`String y = "hola";`

`String x = "hola";`

Todo apunta al mismo string para hacer más eficiente la memoria al crear un solo objeto



Cuando se hace:

`String x = "hola";`

`x = "hello";`


Esto es un claro ejemplo de la inmutabilidad



En java se pasa por valor. Se hace una copia de la referencia y se pasa el valor de esta copia

Cuando se asignan nuevos valores a los primitivos no se le asigna a ninguno otro.

```java
int x = 5;
x + = 5;
```

