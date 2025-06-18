🚀 Programación Orientada a Objetos en Java - Curso SENATI
https://img.icons8.com/color/96/java-coffee-cup-logo--v1.png
https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTUkkUzrgcUkVMHMt3isZ0Cn8i2sCLkpwIZyg&s

📚 Introducción al Proyecto
Este repositorio contiene material educativo sobre Programación Orientada a Objetos (POO) en Java, desarrollado como parte del curso vacacional de Java en SENATI. El proyecto demuestra conceptos fundamentales de POO mediante ejemplos prácticos y ejercicios interactivos.

🎯 Conceptos Clave Cubiertos
Fundamentos de POO: Clases, objetos, encapsulamiento

Relaciones entre clases: Herencia, composición, asociación

Modificadores de acceso: private, protected, public, default

Polimorfismo y Abstracción: Interfaces y clases abstractas

Desarrollo de GUI: Introducción a Java Swing

� Estructura del Proyecto
📁 src/
├── 📁 uno/             # Paquete principal con clases base
│   ├── ClaseA.java     # Demuestra modificadores de acceso
│   └── ClaseB.java     # Acceso desde mismo paquete
├── 📁 dos/             # Paquete secundario para herencia
│   ├── ClaseC.java     # Herencia entre paquetes
│   └── ClaseD.java     # Acceso mediante relaciones
├── 📁 prueba/          # Casos de prueba
│   ├── prueba01.java   # Prueba ClaseA
│   ├── prueba02.java   # Prueba ClaseB
│   ├── prueba03.java   # Prueba ClaseC
│   └── prueba04.java   # Prueba ClaseD
└── 📁 view/            # Ejemplos de interfaces gráficas
    └── PedidoView.java # Formulario Swing interactivo
classDiagram
    direction LR
    
    class ClaseA {
        -int n1
        ~int n2
        #int n3
        +int n4
        +ClaseA()
        +metodoA()
    }
    
    class ClaseB {
        +metodoB()
    }
    
    class ClaseC {
        +metodoC()
    }
    
    class ClaseD {
        +metodoD()
    }
    
    ClaseA <|-- ClaseC : Herencia
    ClaseB --> ClaseA : Usa
    ClaseC --> ClaseA : Usa
    ClaseD --> ClaseA : Usa
    
    note "ClaseC accede a n3 (protected) mediante herencia"
    note "ClaseD solo puede acceder a n4 (public)"
    🖥️ Interfaz Gráfica - Java Swing
https://via.placeholder.com/600x400/2c3e50/ffffff?text=Formulario+Interactivo+Java+Swing
Ejemplo de formulario para gestión de pedidos

⚙️ Cómo Ejecutar el Proyecto
git clone https://github.com/tu-usuario/poo-java-senati.git
Importar proyecto en NetBeans/Eclipse como proyecto Java existente

Ejecutar los casos de prueba:

prueba01.java: Demuestra acceso completo dentro de la misma clase

prueba04.java: Muestra acceso limitado desde otro paquete

Para la interfaz gráfica:

Ejecutar PedidoView.java desde el paquete view

📋 Resultados Esperados
Caso de Prueba	Output Esperado
prueba01	n1=20, n2=30, n3=40, n4=50
prueba02	n2=30, n3=40, n4=50
prueba03	n3=40, n4=50
prueba04	n4=50
🛠️ Tecnologías Utilizadas
Lenguaje: Java 11+

IDE: NetBeans / Eclipse

Gestión de dependencias: Maven

Control de versiones: Git

Documentación: Markdown + Mermaid
