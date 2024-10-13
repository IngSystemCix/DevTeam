# Dev Team

## Ejercicio: Sistema de Gestión de Archivos

### Descripción del ejercicio:

Vas a crear un sistema que lea archivos de texto desde diferentes ubicaciones, los analice y procese para obtener información relevante, como el número de palabras, la longitud de las líneas, el contenido de las líneas, entre otros. El sistema estará compuesto por 10 clases interconectadas, cada una con una responsabilidad específica.
Clases involucradas:
>[!NOTE]
> MainApp: Clase principal que inicializa el programa y gestiona la interacción con el usuario.

> [!NOTE]
> FileReaderManager: Clase que utiliza la librería ReadFile para leer archivos y delega las operaciones de análisis a otras clases.

> [!Note]
> FileAnalyzer: Clase abstracta que define la estructura básica para cualquier tipo de análisis de archivo.

> [!NOTE]
> WordCountAnalyzer: Subclase de FileAnalyzer, encargada de contar cuántas palabras hay en un archivo.

> [!NOTE]
> LineLengthAnalyzer: Subclase de FileAnalyzer, que calcula la longitud de cada línea en el archivo.

> [!NOTE]
> FileData: Clase que contiene el contenido del archivo leído y proporciona métodos para acceder a los datos del archivo.

> [!NOTE]
> FileStatistics: Clase que almacena las estadísticas generadas por los analizadores, como el número total de palabras, líneas más largas, etc.

> [!NOTE]
> FileLogger: Clase que registra las operaciones realizadas en los archivos, utilizando Logger.

> [!NOTE]
> FilePathManager: Clase que gestiona las rutas de los archivos, asegurando que las rutas sean válidas antes de procesarlas.

> [!NOTE]
>UserInputHandler: Clase encargada de manejar la entrada del usuario, como rutas de archivos, selección de operaciones y otros comandos.