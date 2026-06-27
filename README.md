Climalert

Servicio backend de monitoreo climático y alertas automáticas.
Trabajo Práctico - Diseño de Sistemas de Información (UTN.BA)

 ¿Qué hace?

Climalert es un servicio autónomo que consulta el clima de la ciudad de CABA en tiempo real integrándose con WeatherAPI.

El sistema evalúa constantemente los datos y dispara notificaciones por correo electrónico a los equipos de emergencia exclusivamente cuando se cumplen estas condiciones críticas simultáneas:

- Temperatura: > 35°C

- Humedad: > 60%


Configurá tu API Key:

Andá a la carpeta src/main/resources/.

Renombrá el archivo applicationExample.yaml a application.yaml.

Pegá tu clave gratuita de WeatherAPI:

climalert:
  baseUrl: [http://api.weatherapi.com/v1](http://api.weatherapi.com/v1)
  apiKey: TU_API_KEY_AQUI

