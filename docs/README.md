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