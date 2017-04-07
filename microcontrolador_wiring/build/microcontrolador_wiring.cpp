/*
  Programa para simular los sensores del brazalete.
 Al presionar el boton, un led se activa para 
 se\u00f1alar el funcionamiento y el microcontrolador
 envia datos aleatorios por el puerto.
 */
#include <string.h>
//Numero de pin de entrada del boton
#include "WProgram.h"
void setup();
void loop();
const int pinBoton = 14;
//Numero de pin de entrada de pulso
const int pulsePin = 31;
//Constante del led integrado en el wiring
const int blinkPin = 15;

//Variables de almacenamiento de datos
int frecuencia = 0;
int presion = 0;
int estres = 0;

// arreglo de chars para envio final del dato del sensor.
String tempArray[3] = {
  "", "", ""
};

//Variable de conteo
int i = 0;

//Variable de entrada del boton
int bot = LOW;
int pulse = 0;

void setup()
{
  // Abre puerto serial y lo configura a 9600 bps
  Serial.begin(9600);
  //Inicializa los pines de entrada y salida
  pinMode(pinBoton, INPUT);
  pinMode(pulsePin, INPUT);
  pinMode(blinkPin, OUTPUT);
}


void loop()
{
  //Lee la entrada del boton y revisa si esta presionado
  bot = digitalRead(pinBoton);
  pulse = analogRead(pulsePin);
  if(pulse>=550)
  {
    digitalWrite(blinkPin, HIGH);
  }
  else
  {
    digitalWrite(blinkPin, LOW);
  }
  if( bot == HIGH )
  { 
    //Calcula los valores y los almacena
    frecuencia = 80 + random(-20, 40);
    tempArray[0] = String(frecuencia);
    presion = 80 + random(-20, 40);
    tempArray[1] = String(presion);
    estres = random(0, 10);
    tempArray[2] = String(estres);

    //Envia los datos por el terminal
    for (i=0; i<3; i++)
    {
      Serial.print(tempArray[i]);
      if(i < 2)
      {
        Serial.print("\t");
      }
    }
    Serial.println("");
    delay(1000);
  }
  delay(10);
}


