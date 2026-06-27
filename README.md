Climalert

Servicio backend de monitoreo climático y alertas automáticas.
Trabajo Práctico - Diseño de Sistemas de Información (UTN.BA)

 ¿Qué hace?

Climalert es un servicio autónomo que consulta el clima de la ciudad de Buenos Aires, Distrito Federal en tiempo real, integrándose con WeatherAPI.

El sistema evalúa constantemente los datos y dispara notificaciones por correo electrónico a los equipos de emergencia exclusivamente cuando se cumplen estas condiciones críticas simultáneas:

- Temperatura: > 35°C

- Humedad: > 60%


Hay que renombrar el archivo applicationExample.yaml a application.yaml y Pegar la clave gratuita de WeatherAPI que te fue asignada:

climalert:
  baseUrl: [http://api.weatherapi.com/v1](http://api.weatherapi.com/v1)
  apiKey: TU_API_KEY

