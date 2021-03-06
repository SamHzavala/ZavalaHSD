# ***COLECCIONES EN JAVA*** #

Una coleccion representa un grupo de objetos. Estos objetos son  conocidos como elementos. Cuando queremos trabajar con un conjunto 
de elementos, necesitamos un almacen donde poder guardarlos. En Java, se emplea la interfaz generica **Collection** para 
este proposito. Gracias a esta interfaz, podemos alamenar cualquier tipo de objeto y podemos usar una serie de metodos comunes,
como pueden ser: **añadir, eliminar, obtener el tamaño del a coleecion**...Partiendo de la interfaz generica **Collection** extienden 
otra serie de interfaces genericas. Estas subinterfaces aportan distintas funcionalidades sobre la interfaz anterior.
  
   
## **TIPOS DE COLECCIONES** ##

- **SET**  
  La interfaz **SET** define una coleccion que no puede contener elementos duplicados. Esta interfaz contiene, unicamente, los metodos
  heredador de ***COLLECTION*** añadiendo la restriccion de que los elementos duplicados estan prohibidos. Para comprobar si los elementos 
  son elementos duplicados o no lo son, es necesario que dichos elementos tengas implementada, de forma correcta, los metodos ***Equals y HashCode***.
  Para comprobar si dos **SET** son iguales, se comprobaran si todos los elementos que los componen son iguales sin importar en el orden que 
  ocupen dichos elementos.  


  Dentro de la interfaz **SET** existen varios tipos de implementaciones realizadas dentro de la plataforma Java.

  - ***HashSet***: Esta implementacion almacena los elementos en una tabla ***Hash***. Es la implementacion con mejor rendimiento de todas pero no 
  garantiza ningun orden a la hora de realizar iteraciones. Es la implementacion mas empleada debido a su rendimiento y a que, generalmente, no nos 
  importa el orden que ocupen los elementos. Proporciona tiempos constantes en las operaciones basicas siempre y cuando la funcion ***Hash*** disperse de 
  forma correcta los elementos dentro de la tabla ***Hash***.  


  - ***TreeSet***: Esta implementacion almacena los elementos ordenandolos en funcion de sus valores. Es bastante mas lento que ***HashSet***. Los elementos 
  almacenados deben implementar la interfaz **COMPARABLE**. Esta implementacion garantiza, siempre, un redimiento de ***log(N)*** en las operacions basicas, 
  debido a la estructura de arbol empleada para almacenar los elementos.  


  - ***LinkedHashSet***: Esta implementacion almacena los elementos en funcion del orden de insercion. Es simplemente, un poco mas costosa que ***HashSet***.  
  

  Ninguna de estas implementacions son sincronizadas; es decir, no se garantia el estado del **SET** si dos o mas hilos acceden de forma concurrente al mismo.  

- **LIST**  
  La interfaz **LIST** define una sucesion de elementos. A diferencia de la interfaz **SET**, la interfaz **LIST** si admite elementos duplicados. A parte de 
  los metodos heredados de **COLLECTION**, añade metodos que permiten mejorar los siguientes puntos:  

  - ***Acesso posicional a elementos***: manipula elementos en funcion de su posicion en la lista.  
  - ***Busqueda de elementos***: Busca un elemento concreto de la lista y devuelve su posicion.  
  - ***Iteracion sobre elementos***: Mejora el **ITERADOR** por defecto.  
  - ***Rango de operacion***: Permite realizar ciertas operaciones sobre ragos de elementos dentro de la propia lista.  

  Dentro de la interfaz **LIST** existen varios tipos de implementaciones realizados dentro de la plataforma Java.  

  - **ArrayList**: Esta es la implementacion tipica.Se basa en un ***array*** redimensionable que aumenta su tamaño segun crece la coleccion de elementos. Es la 
  que mejor rendimiento tiene sobre la mayoria de situaciones.  
  - **LinkedList**: Esta implementacion permite que mejore el rendimiento en ciertas ocasiones. Esta implementacion se basa en una lista doblemente enlazada de los 
  elementos, teniendo cada uno de los elementos un puntero al anterios y al siguiente elemento.  

- **MAP**  
  La interfaz **MAP** asocia claves a valores. Esta interfaz no puede contener claves duplicadas y; cada una de dichas clave, solo puede tener asociado un valor como 
  maximo.Dentro de la interfaz **MAP** existen varios tipos de implementaciones realizadas dentro de la plataforma Java.  

  - ***HashMap***: Esta implementacion almacena las claves en una tabla ***hash***. Es la implementacion con mejor rendimiento de todas pero no garantiza ningun orden 
  a la hora de realizar iteracion. Proporciona tiempos constantes en las opeaciones basicas siempre y cuando la funcion ***hash*** disperse de forma correcta los elementos 
  dentro de la tabla ***hash***  
  - ***LinkedHashMap***: Esta implementacion almacena las claves en funcion del orden de insercion. Es simplemente, un poco mas costosa que **HashMap**.  
  
- **STREAM API**  
  Gracias a la llegada de Java 8, las colecciones han aumentado su funcionalidad con la llegada de los **streams**. Los **streams** permiten realizar operaciones funcionales 
  sobre los elementos de las colecciones.  

  >Ejemplo de las bondades de los **streams** donde, a partir de una lista de personas (donde cada una de ellas tiene un nombre), obtenemos una lista con todos los nombres.  

```List people = new ArrayList();```  
```List names = people.stream().map(Person::getName).collect(Collectors.toList());```  

# **JAVA COLLECTION FRAMEWORK** #  

Una coleccion es como un contenedor que combina multiples articulor en una unidad. Por ejemplo: ***una lata de chocolate, lista, etc..***. Casi todos los lenguajes de programacion 
usan colecciones, y cuando llega Java, tambien viene con una pequeña clase de coleccion; **Vector, Apilar, Tabla, Formacion**. Java 1.2 proporciona **Collection Framework**. Es 
una arquitectura que representa y manipula colecciones en Java de forma estandar. El Java Collections FrameWork contiene las siguientes partes:  

- **INTERFAZ**: La interfaz de Java Collections Framework proporciona tipos de datos abstractos que representan colecciones ```java.util.Collection```. Es la interfaz raiz de 
Framework Framework. Esta en la parte superior de la jerarquia del marco de colecciones. contiene algunos metodos importantes como ```size(), iterator(), add(), remove(), clear()```.
Cada clase de coleccion debe implementarse. Algunas otras interfaces importantes son ```java.util.List```, ```java.util.Set```, ```java.util.Queue``` con ```java.util.Map```. 
Map es la unica interfaz que no hereda de la interfaz Collection, pero es parte del marco de Collection. Todas las interfaces del marco de recopilacion existen en ```java.util``` en la 
bolsa.  
- **CLASE DE IMPLEMENTACION**: Las colecciones en java proporcionan clases principales de implementacion para colecciones. Podemos usarlos para crear diferentes tipos de colecciones 
en programas java. Algunas clases importantes de recoleccion son ```ArrayList, LinkedList, HasMap, TreeMap, HashSet, TreeSet```. Estas clases resuelven la mayoria de nuestras 
necesidades de programacion, pero si necesitamos algunas clases de colecion especiales, podemos extenderlas para crear nuestras clases de colecciones personalizadas. A Java 1.5 se le 
ocurrio la idea de permitir modificar una coleccion mientras se iteraba, algunas de ellas son clases de coleccion seguras para subprocesos ```CopyOnWriteArrayList```, 
```ConcurrentHashMap, CopyOnWriteArraySet```. Estas clases se encuentran en el paquete ```java.util.concurrent```. Todas las clases de coleccion existen en ```Java.util``` con 
```java.util.concurrent``` paquete.  
- **ALGORITMO**: los algoritmos son metodos utiles que proporcionan algunas funciones de uso comun, como **buscar, ordenar y barajar**.  

El siguiente diagrama de clase muestra la jerarquia del marco de colecciones. Por simplicidad, solo se incluye interfaces y clases de uso comun.  

![JavaCollectionFramework](Colecciones.jpg)  

# **VENTAJAS DE JAVA COLLECTIONS FRAMEWORK** #  

- ***Reduce el esfuerzo de desarrollo***: Contiene casi todos los tipos comunes de colecciones y metodos utiles para iterar y manipular datos. Por lo tanto, podemos centarnos mas en la 
logica empresarial en lugar de diseñar nuesta API de recopilacion.  
- ***Mejora de calidad***: Usar clases de coleccion centar bien probadas puede mejorar la calidad del programa, en lugar de utiliar cualquier estructura de datos desarrollada por la familia.  
- ***Reusabilidad e interoperabilidad***  
- ***Reducir la carga de trabajo***: Si usamos la clase API de la coleccion principal, aprenda cualquier nueva API.


  



 


