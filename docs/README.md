## 01. Polimorfismo

**¿Qué ventaja ofrece el polimorfismo en el diseño de clases frente al uso de múltiples condicionales para determinar el comportamiento de un objeto?**

El polimorfismo permite que diferentes clases respondan de manera distinta al mismo método. Así evitamos tener muchos `if` o `switch` y el código queda más fácil de mantener y extender.

## 03. Encapsulamiento

**¿Qué problema podría aparecer en un sistema si los atributos de las clases se mantienen públicos en lugar de privados con getters y setters controlados?**

Se puede modificar el estado de un objeto desde cualquier parte del programa sin ningún control. Esto puede generar datos inválidos o inconsistencias. Con atributos privados podemos controlar cómo se leen o modifican.

## 05. Principio de Única Responsabilidad

**¿Por qué es importante que una clase cumpla con el Principio de Única Responsabilidad? Da un ejemplo donde se vulnere.**

Porque una clase debería tener una sola responsabilidad, así es más fácil mantenerla y modificarla. Por ejemplo, una clase que maneje usuarios y además se encargue de enviar correos estaría haciendo dos cosas diferentes.

## 07. Maven

**¿Qué diferencia hay entre `mvn compile`, `mvn package` y `mvn install`?**

`mvn compile` compila el código. `mvn package` además crea el archivo empaquetado, como un JAR. `mvn install` hace lo mismo y además instala ese paquete en el repositorio local de Maven para poder usarlo desde otros proyectos.
---

# Parte 2 — Hackathon Express

## Reto 4 — La Balanza Trucada del Mercado

### Patrón de Diseño

**Categoría:** Estructural

**Patrón utilizado:** Adapter

### Justificación

El patrón Adapter se utiliza para permitir que el sistema convierta un pesaje desde cualquier unidad de peso hacia cualquier otra unidad sin modificar la clase `Balanza`.

El adaptador traduce las diferentes unidades a una unidad de referencia, el kilogramo, y posteriormente realiza la conversión hacia la unidad solicitada.

### Aplicación

El patrón se implementó mediante la interfaz `ConvertidorPeso` y la clase `AdaptadorBalanza`.

La `Balanza` se encarga de crear los objetos `Pesaje`, mientras que `AdaptadorBalanza` se encarga de realizar las conversiones entre unidades.

El flujo de conversión es:

    Unidad origen
          ↓
      Kilogramos
          ↓
    Unidad destino

De esta manera se pueden realizar conversiones entre gramos, kilogramos, libras y arrobas.

### Clases involucradas

- `UnidadPeso`: representa las unidades de peso soportadas.
- `Pesaje`: representa una cantidad junto con su unidad.
- `PesajeSolicitud`: relaciona un pesaje con la unidad a la que debe convertirse.
- `Balanza`: crea los pesajes.
- `ConvertidorPeso`: define el contrato para realizar conversiones.
- `AdaptadorBalanza`: implementa el patrón Adapter y realiza las conversiones.
- `Reto4BalanzaTrucada`: controla la interacción con el usuario y procesa los pesajes.

### Streams

Se utilizan Streams para procesar los pesajes y calcular el total equivalente en kilogramos.

Se utiliza `mapToDouble()` junto con `sum()` para obtener el acumulado de todos los pesajes.

### Evidencia de ejecución

```text
Balanza Honesta del Mercado
¿Cuántos pesajes? 3
P 1: 2.500 g -> kg
P 2: 40 lb -> kg
P 3: 3 @ -> lb

P 1: 2.500 g = 2,5 kg
P 2: 40 lb = 18,144 kg
P 3: 3 @ = 82,673 lb
--- Resumen ---
Total kg equivalente: 58,144 kg
¡Gracias por comprar en la plaza!