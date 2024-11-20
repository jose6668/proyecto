# tienda
**Presentado por:**  
- Romero Trujillo Marlos David  
- Trujillo Bonilla Julián Alberto  
- Vargas Herrera José Leonardo  

---

## Tabla de Contenido
1. [Enlace del Video Explicativo por Jose Leonardo](#enlace-del-video-explicativo-del-nuevo-componente-de-Jose-Leonardo-Vargas-Herrera)
2. [Descripción General del Proyecto](#descripción-general-del-proyecto)
3. [Funcionalidades Principales](#funcionalidades-principales)
   - [Frontend](#frontend)
   - [Backend](#backend)
4. [Modelo Entidad Relación (MER)](#modelo-entidad-relación-mer)
5. [Requisitos Funcionales y No Funcionales](#requisitos-funcionales-y-no-funcionales)
   - [Requisitos Funcionales](#requisitos-funcionales)
   - [Requisitos No Funcionales](#requisitos-no-funcionales)
6. [Configuración de la Base de Datos](#configuración-de-la-base-de-datos)
7. [Pasos para Despliegue](#pasos-para-despliegue)
   - [Clonación del proyecto](#clonación-del-proyecto)
   - [Sincronización de cambios](#sincronización-de-cambios)
   - [Instalación y despliegue del Frontend](#instalación-y-despliegue-del-frontend)
   - [Instalación y despliegue del Backend](#instalación-y-despliegue-del-backend)
   - [Generación del APK](#generación-del-apk)
8. [Evidencias del Proyecto](#evidencias-del-proyecto)
   - [Imágenes](#imágenes)
   - [Imágenes APK](#imágenes-apk)
9. [Descarga de Recursos](#descarga-de-recursos)
10. [Resultado](#resultado)
---
---

## Enlace del Video Explicativo del nuevo componente de Marlon David Romero Trujillo

Puedes ver el video explicativo del nuevo componente en el siguiente enlace:
- **[Enlace al Video](https://drive.google.com/file/d/1lbhr7YlrGxcdj2OdKWdqY1RTbrNKJSaI/view?usp=drive_link)**

---
---

## Descripción General del Proyecto

**Objetivo:**  
Facilitar la compra de ropa masculina de alta calidad a través de una plataforma móvil, ofreciendo una amplia variedad de estilos para satisfacer las necesidades del hombre moderno. Esta plataforma está especializada para el comercio en Neiva.  

**Tecnologías utilizadas:**  
- **Backend:** Spring Boot con Java.  
- **Frontend:** Ionic con Angular.  
- **Base de Datos:** MySQL.  
- **Aplicación Móvil:** Generada con Ionic para dispositivos Android.  

---

## Funcionalidades Principales

### Frontend
- **Agregar productos:** Los usuarios pueden añadir productos al catálogo.
- **Eliminar productos:** Permite la gestión del inventario eliminando productos.
- **Editar productos:** Facilita la actualización de información de productos.
- **Gestión de pedidos:** Validación y eliminación de pedidos realizados.

### Backend
- **Diseño de la arquitectura de la base de datos:** Base de datos relacional optimizada para la gestión de productos y pedidos.
- **Implementación de rutas API:** Proporciona endpoints para la interacción entre el frontend y la base de datos.

---

## Modelo Entidad Relación (MER)

El diseño MER incluye las tablas necesarias para la gestión de productos y pedidos, adaptado a las necesidades específicas de la tienda LJM.
[Descargar presentación](proyecto.pptx)
---

## Requisitos Funcionales y No Funcionales

### Requisitos Funcionales
1. **Gestión de productos:**  
   - Agregar, editar y eliminar productos del catálogo.  
2. **Gestión de pedidos:**  
   - Validar y procesar pedidos realizados por los usuarios.  
3. **Inicio de sesión:**  
   - Permite el acceso de usuarios y administradores al sistema.  

### Requisitos No Funcionales
1. **Compatibilidad:**  
   - Compatible con navegadores modernos y dispositivos móviles Android.  
2. **Seguridad:**  
   - Mecanismos de autenticación y autorización para usuarios.  
3. **Rendimiento:**  
   - Respuesta en menos de 2 segundos bajo carga normal.  

---

## Configuración de la Base de Datos

**Base de datos utilizada:** MySQL  

**Pasos para la configuración:**
1. Instalar **MySQL** en el sistema (puedes usar **XAMPP** o **MySQL Workbench**).  

---

## Pasos para Despliegue

### Clonación del proyecto
```bash
git clone <URL-del-repositorio>
```

### Sincronización de cambios
```bash
git pull
```

### Modificación o publicación
```bash
git pull
git add -A
git commit -m "Mensaje que informe el cambio"
git push
```

### Instalación y despliegue del Frontend
1. Instalar dependencias:
   ```bash
   npm install
   ```
2. Iniciar servidor de desarrollo:
   ```bash
   ng serve
   ```

### Instalación y despliegue del Backend
1. Configurar conexión con la base de datos en `application.properties`.  
2. Iniciar el servidor backend con Spring Boot por debug.  

### Generación del APK
1. Instalar Capacitor Android:
   ```bash
   npm install @capacitor/android
   ```
2. Agregar plataforma Android:
   ```bash
   npx cap add android
   ```
3. Compilar el proyecto:
   ```bash
   ionic build
   ```
4. Verificar configuración de Capacitor:
   ```bash
   npx cap ls
   ```
5. Copiar el proyecto a Android:
   ```bash
   npx cap copy android
   ```
6. Abrir en Android Studio:
   ```bash
   npx cap open android
   ```

---

## Evidencias del Proyecto

### Imágenes


![paso 1](Evidencia/1.png)
![paso 2](Evidencia/2.png)
![paso 3](Evidencia/3.png)
![paso 4](Evidencia/4.png)
![paso 5](Evidencia/5.png)
![paso 6](Evidencia/6.png)
![paso 7](Evidencia/7.png)
![paso 8](Evidencia/8.png)
### Imágenes APK
![paso 9](Evidencia/9.png)

![paso 10](Evidencia/10.png)

![paso 11](Evidencia/11.png)

![paso 12](Evidencia/12.png)

## Descarga de Recursos

- **Aplicación móvil:**  
  Generada con **Ionic** para dispositivos Android. Puedes descargarla y abrirla desde tu dispositivo móvil:  
  [Descargar APK](app-debug.apk).  

  > Si estás navegando desde tu dispositivo móvil, haz clic en el enlace para iniciar la descarga y luego abre el archivo para instalar la aplicación.  

## Resultado
La Tienda LJM es una plataforma eficiente para la gestión de productos y pedidos, adaptada a las necesidades del comercio en Neiva. La integración entre el frontend y el backend, junto con el uso de MySQL como base de datos, garantiza un rendimiento óptimo y una experiencia de usuario satisfactoria. La aplicación móvil permite una gestión cómoda desde cualquier dispositivo Android.
