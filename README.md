En application.properties, se pueden escribir propiedades a usar por el programa, en este caso:
greeting=Hello world!
#my.number=100

En el programa, para poder usar dichas variables/propiedades:

@Value("${greeting}")
	private String greeting;

@Value("${my.number}")
	private String myNumber;
