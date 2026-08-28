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

## Reto 1 — La Boleteria del Cine Astor

Para resolver este ejercicio solo aplicamos el uso de SOLID y Programacion orientada a objetos

## Reto 2 —  El Sastre a la Medida

### Patrón de Diseño

**Categoría:** Estructural

**Patrón utilizado:** Builder

Lo usamos ya que requerimos construir un objeto paso a paso

## Reto 3 — La Fabrica de Instrumentos

### Patrón de Diseño

**Categoría:** Creacional

**Patrón utilizado:**  Abstract Factory

Usamos este patron de diseño creacional que nos permite producir familias de objetos relacionados sin especificar sus clases concretas

## Reto 4 — La Balanza Trucada del Mercado

### Patrón de Diseño

**Categoría:** Estructural

**Patrón utilizado:** Adapter

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
```
---

## Reto 5 — La Moto Personalizada

### Patrón de Diseño

**Categoría:** Estructural

**Patrón utilizado:** Decorator

### Justificación

Se utiliza el patrón Decorator porque la moto puede recibir diferentes accesorios, pinturas y complementos de manera dinámica.

Este patrón permite agregar nuevas mejoras sin modificar la clase base `MotoBase`, cumpliendo con el principio Abierto/Cerrado (OCP).

Cada mejora envuelve una moto existente y agrega su propia descripción y precio.

### Cómo se aplicó

La solución utiliza una interfaz `Moto`, que define las operaciones comunes:

- `getDescripcion()`
- `getPrecio()`

La clase `MotoBase` representa la moto original:

- Naked 250
- Precio base: $9.800.000

La clase abstracta `DecoradorMoto` mantiene una referencia a una `Moto` y sirve como base para las diferentes mejoras.

Los decoradores concretos son:

- `EscapeDeportivo`: agrega $1.400.000.
- `PinturaMateNegro`: agrega $900.000.
- `BaulTrasero`: agrega $550.000.

Las mejoras se pueden encadenar:

    MotoBase
        ↓
    EscapeDeportivo
        ↓
    PinturaMateNegro
        ↓
    BaulTrasero

De esta manera, cada decorador agrega su propia descripción y precio sin modificar las clases anteriores.

### Aplicación de SOLID

**Open/Closed Principle (OCP):**

La clase `MotoBase` no necesita modificarse cuando se agrega una nueva mejora. Para incorporar una nueva mejora basta con crear un nuevo decorador que implemente el comportamiento correspondiente.

**Single Responsibility Principle (SRP):**

Cada clase tiene una responsabilidad específica:

- `Moto`: define el contrato de una moto.
- `MotoBase`: representa la moto base.
- `DecoradorMoto`: proporciona la estructura común para los decoradores.
- `EscapeDeportivo`: agrega el escape deportivo.
- `PinturaMateNegro`: agrega la pintura mate negro.
- `BaulTrasero`: agrega el baúl trasero.
- `Reto5MotoPersonalizada`: ejecuta el reto y muestra el resultado.

### Resultado de ejecución

```text
Taller Turbo Andes
Moto base: Naked 250
Precio base: $9.800.000

--- Tu Moto ---
Naked 250 + Escape deportivo + Pintura mate negro + Baúl trasero

Descripción:
Naked 250 con escape deportivo,
pintura mate negro y baúl trasero

Precio base: $9.800.000
Mejoras: $2.850.000
Total: $12.650.000
¡Buen viaje!
```
---

## Reto 6 — Sala de Urgencias

### Patrón de Diseño

**Categoría:** Comportamiento

**Patrón utilizado:** Chain of Responsibility

### Justificación

Se utiliza el patrón Chain of Responsibility porque los pacientes son atendidos mediante una cadena de profesionales. Cada profesional decide si puede atender el caso y, si no puede, lo pasa al siguiente profesional de la cadena.

La cadena está formada por:

    Enfermero
        ↓
    Médico General
        ↓
    Especialista
        ↓
    Otra institución

Esto permite agregar o cambiar profesionales de la cadena sin modificar los demás participantes.

### Cómo se aplicó

La clase `Paciente` representa los datos de cada paciente:

- Síntoma.
- Nivel.
- Prioridad.

Los niveles posibles son:

- Leve.
- Moderado.
- Grave.
- Crítico.

La clase abstracta `Profesional` representa el manejador de la cadena y mantiene una referencia al siguiente profesional.

Los profesionales concretos son:

- `Enfermero`: atiende pacientes de nivel Leve.
- `MedicoGeneral`: atiende pacientes de nivel Moderado.
- `Especialista`: atiende pacientes de nivel Grave.

Los pacientes de nivel Crítico no pueden ser atendidos por ninguno de los profesionales disponibles y son remitidos a otra institución.

### Estadísticas

Las estadísticas se calculan utilizando Streams:

- Cantidad de pacientes atendidos por nivel.
- Cantidad de pacientes remitidos.
- Promedio de prioridad de los pacientes atendidos.

### Resultado de ejecución

```text
P1: Enfermero atendió.
P2: Médico General atendió.
P3: Especialista atendió.
P4: Sin profesional disponible.
Paciente remitido a otra institución.

--- Estadísticas ---
Atendidos - Leve: 1 Moderado: 1 Grave: 1
Remitidos a otra institución: 1
Promedio prioridad atendidos: 2.0
```
## Reto 7 — Rover Explorador de Marte

### Patrón de Diseño

**Categoría:** Comportamiento

**Patrón utilizado:** Command

### Justificación

Se utiliza el patrón Command porque cada acción del rover se representa como un objeto comando. Esto permite encapsular las operaciones del rover y mantener un historial de las acciones realizadas.

Cada comando puede ejecutarse y deshacerse individualmente mediante la operación `undo`.

### Cómo se aplicó

La interfaz `Comando` define las operaciones que deben realizar los comandos:

- Ejecutar una acción.
- Deshacer una acción.
- Obtener la descripción de la acción.
- Obtener el operador que realizó la acción.

La clase `Rover` representa el receptor y contiene las operaciones que puede realizar:

- Avanzar.
- Retroceder.
- Recoger muestras.
- Soltar muestras.
- Grabar con la cámara.
- Detener la cámara.
- Perforar.
- Retraer el taladro.

Los comandos concretos son:

- `ComandoMotor`
- `ComandoBrazo`
- `ComandoCamara`
- `ComandoTaladro`

La clase `Historial` almacena los comandos ejecutados y permite deshacer una acción específica sin afectar las demás.

### Historial y Undo

El historial registra cada acción junto con el operador que la realizó. Las acciones pueden deshacerse individualmente utilizando su número dentro del historial.

Por ejemplo:

```java
historial.deshacer(3);


## Reto 8 — La Academia de Fútbol de los UML

Para resolver este ejercicio solo aplicamos el uso de SOLID y Programacion orientada a objeto
