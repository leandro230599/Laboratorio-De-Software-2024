## Considerar:

Todos los proyectos se hicieron usando el IDE IntellIJ. Las carpetas .idea y out se ignoran al subir los proyectos al repo. Como para la practica 4 y el desafio 3 se usa GUI Form, que es un feature propio de IntellIJ, no corrian las apps ejecutandolas desde Eclipse, por ejemplo. Entonces, se crearon jars para cada app swing desarrollada, pudiendo asi ejecutarse correctamente en cualquier pc, independientemente de IntellIJ.

Cada practica/desafio es un proyecto en sí, aunque la carpeta global LaboratorioDeSoftware también lo es. Para evitar inconvenientes conviene clonar el repo y luego abrir cada practica/desafio como un proyecto independiente en el ide que utilices, es decir, no abrir directamente el proyecto gigante LaboratorioDeSoftware. EL tema es que si abrimos este ultimo, para que se detecten las clases, hay que marcar cada src dentro de cada proyecto anidado como 'Source', y luego al compilar es un poco un lio ya que todo se va a guardar en la carpeta out de LaboratorioDeSoftware (podes cambiarlo para que quede el codigo compilado en la carpeta out del proyecto anidado al que pertenece la clase a compilar cada vez que ejecutes algo diferente pero no es practico). Conviene tener cada cosa por separado.