# Manual del Administrador

## Introducción
Este manual proporciona instrucciones detalladas para los administradores del sistema sobre cómo configurar y mantener la aplicación Denal Calculator.

## Configuración del Producto
En esta sección, se detallan los pasos necesarios para configurar el producto antes de su implementación.

### Configuración del Servidor de Aplicaciones
1. Instale Tomcat 9.0 en el servidor.
2. Configure las variables de entorno JAVA_HOME y CATALINA_HOME.
3. Despliegue el archivo WAR de la aplicación en el servidor Tomcat.

## Procedimientos de Mantenimiento
Esta sección proporciona instrucciones para mantener y actualizar la aplicación en producción.

### Actualización de la Aplicación
1. Descargue la última versión del archivo WAR de la aplicación desde el repositorio de GitHub.
2. Detenga el servidor Tomcat.
3. Reemplace el archivo WAR existente con la nueva versión.
4. Reinicie el servidor Tomcat.

## Acceso a Funciones Administrativas
Esta sección describe cómo acceder a las funciones administrativas de la aplicación.

### Panel de Administración
1. Abra un navegador web.
2. Navegue a la URL de la aplicación seguida de `/admin`.
3. Ingrese las credenciales de administrador para acceder al panel de administración.

## Problemas Comunes y Soluciones
En esta sección, se enumeran problemas comunes que pueden surgir durante la administración de la aplicación y cómo solucionarlos.

### Error de Conexión a la Base de Datos
- **Problema:** La aplicación no puede conectarse a la base de datos.
- **Solución:** Verifique la configuración de conexión en el archivo de configuración `application.properties` y asegúrese de que las credenciales de la base de datos sean correctas.

## Contribución
Para contribuir al desarrollo de la aplicación, siga los siguientes pasos:
1. Clone el repositorio desde GitHub.
2. Cree un nuevo branch para su contribución.
3. Realice los cambios necesarios y haga commit en su branch.
4. Envíe un pull request al repositorio principal y espere la revisión y aprobación.

