#  ***INTERFACES DE ESCUCHA*** #

Un detector de eventos de Java esta diseñado para procesar algun
tipo de evento: "Escucha" un evento, como el clic del mouse de un usuario
o la presion de una tecla, y luego respone en consecuencia.
Un detector de eventos debe estar conectado a un objeto de
eventos debe estar conectado a un objeto de evento que defina el evento.  

## COMO FUNCIONAN LOS OYENTES DE EVENTOS ##  

Cada interfaz de escucha de eventos incluye al menos un metodo utilizado
por la fuente de eventos equivalente.  
Para esto consideraremos un evento de mouse, es decir, cada vez que un
usuario hace clic en algo con el mouse, representando por la clase de Java 
**MouseEvent**. Para manejar este tipo de evento, primero debe crear una clase 
***MouseListener*** que implementa la interfaz Java ***MouseListener***. Esta
interfaz tiene cinco metodos; implemente el que se relacione con el tipo de 
accion del mouse que anticipa que realizara el usuario. Estos son:  
  
- ```void mouseClicked (MouseEvent e)```  
>Se invoca cuando se hace clic en el boton del mouse (se presiona
y se suelta) en un componente.  
  
- ```void mouseEntered (MouseEvent e)```  
>Se invoca cuando el mouse ingresa un componente  
  
- ```void mouseExited (MouseEvent e)```  
>Se invoca cuando el mouse sale de un componente  
  
- ```void mousePressed (MouseEvent e)```  
>Se invoca cuando se presiona un boton del mouse en un componente  
  
- ```void mouseReleased (MouseEvent e)```  
>Se invoca cuando se suelta un boton del mouse en un componente  
  
Como puede ver, cada metodo tiene un unico parametro de objeto de evento:
el evento de mouse particular para el que esta diseñado. En su clase ***MouseListener***,
se registra para **escuchar** cualquiera de estos eventos para estar
informado cuando ocurren.  
  
## TIPOS DE OYENTES DE EVENTOS ##  
  
Los oyentes de eventos estan representados por diferentes interfaces,
cada una de las cuales esta diseñada para procesar un evento equivalente.  
Tenga en cuenta que los oyentes de eventos son flexibles en el sentido
de que se puede registrar un solo oyente para **escuchar** multiples 
tipos de eventos. Esto significa que, para un conjunto similar de 
componentes que realizan el mismo tipo de accion, un detector de eventos
puede manejar todos los eventos.  
  
Estos son algunos de los tipos mas comunes:  
  
- ***ActionListener***: escucha un **ActionEvent**, es decir cuando se 
hace clic en un elemento grafico, como un boton o un elemento de una 
lista.  
  
- ***ContainerListener***: escucha un **ContainerEvent**, que puede 
ocurrir si el usuario agrega o elimina un objeto de la interfaz.  
  
- ***KeyListener***: escucha un **KeyEvent** el usuario que lo presiona,
escribe o suelta una tecla.  
  
- ***WindowListener***: escucha un **WindowEvento**, por ejemplo, cuando
una ventana esta cerrada, activa o desactivada.  
  
- ***MouseListener***: escucha un **MouseEvent**, como cuando se hace clic
o se presiona un mouse.  
  
- ***AdjustmentListener***: Generado por el usuario cuando un componente
es ajustado: **mover una barra (scroll) de desplazamiento con el raton**.  
  
- ***ItemListener***: Un evento **ItemListener** se usa cuando un item
cambia segun pulsemos: **en un meno, en una lista desplegable**, esto puede
desencadenar tambien un determinado tipo de evento, el que se haya definido
en la aplicacion.  
  
- ***MouseMotionListener***: **mouseDragged (MouseEvent), mouseMoved (MouseEvent)**
sirven para controlar el movimiento del raton. Sigue todos los movimientos del
puntero sobre el interface, puede realizar acciones como determinar coordenadas
de un punto x,y y determinar los valores de esos puntos.  
  



  
  


