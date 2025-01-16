# HttpBuilder

A simple Http message builder, to be used into my Http Server.

- Create request and responses (X)
- From the Http object create a byte array (X)
- From the byte array transform it to a String (X)
- From the String build the Http object to easily access is different part

## Http Schema

![Http Schema](Image/HttpBuilder.png)

The header is separated in different section so that the specific header section object can be reused by the user for
multiple Http message. 

For example :
If the user always use the same security parameters in the header, he can create a SecurityHeader and reused it for all
his message.

Not all section need to be instantiated in the header, in fact you can create an empty header.

A custom header make it easy to add new parameter specific to the user case.

## Installation

## Usage