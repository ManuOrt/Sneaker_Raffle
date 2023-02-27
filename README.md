#  Sneaker Raffle

## Introducción
Cuando una tienda de zapatillas recibe una remesa de sneakers de coleccion organiza una rifa entre las personas usuarias registradas para sortear el derecho a comprar la zapatilla.

Cada participante introduce sus datos personales para el envío del paquete y autoriza un cargo en su sistema de pago preferido para que, si resulta agraciada, la tienda ejecute el cobro pendiente por el precio de la zapatilla.

Si la participante no resulta elegida, la tienda solicita la anulación del cobro y el sistema de pago elimina el cargo en la cuenta cliente.

Sólo se permite una participación por persona, por lo que la tienda se encarga de implementar una serie de medidas para evitar las dobles entradas (gente que participa dos veces con la misma cuenta) y bots de personas que disponen de más de una cuenta en el sistema.

Implementa las historias de usuario de las GUI proporcionadas, pero en ASCII.

La lógica tras cada historia de usuario está descrita en el main de la clase principal App.java.

Implementa las historias de usuario de las GUI proporcionadas en la carpeta historias de usuaria GUI, pero en ASCII.
## Funcionalidades
#### Sneaker
- Registra un usuario
- No se admiten registros duplicados
- Se admite la cancelación de un registro
- Se elige un participante al azar


#### GUI
- Imprime la zapatilla
- Imprime todos los datos de la entrada
- Imprime el ganador de la rifa


#### Paypal
- Contiene todas las cuentas de los participantes
- Adminitra el credito de cada participante
- Permite pagar el sneaker ganado si el participante tiene suficiente credito



## Prerequisitos
- Java 11
- Maven

## Instalación

Para instalar las dependencias de maven ejecuta:
```
mvn install
```

## Créditos

Este proyecto a sido creado por Manuel Ortega.

## Contacto
Github: https://github.com/ManuOrt/Sneaker_Raffle

Email: mortegamarti@cifpfbmoll.eu


