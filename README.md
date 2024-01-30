
## Vista
![image](https://github.com/leocadio624/citas_medicas_spring_boot/assets/51096985/fb8743f5-1b4a-4439-b916-da246987ae15)



Para compilar y ejecutar la aplicapción es necesario:

- [JDK 1.8](https://openjdk.org/)
- [Maven 3.9.2](https://maven.apache.org)


To run your application using spring-boot plugin:

``` bash
mvn spring-boot:run
```


## BD 
``` sql
CREATE TABLE IF NOT EXISTS medico(
	pk INT UNSIGNED NOT NULL AUTO_INCREMENT,
	nombre varchar(50) NOT NULL,
	ap_paterno varchar(50) NOT NULL,
	ap_materno varchar(50) NOT NULL,
	esp varchar(50) NOT NULL,
	PRIMARY KEY (pk)
);

CREATE TABLE IF NOT EXISTS consultorio(
	pk INT UNSIGNED NOT NULL AUTO_INCREMENT,
	numero INT NOT NULL,
	piso INT NOT NULL,
	PRIMARY KEY (pk)
);

--estado 1 creada 2, atendida
CREATE TABLE IF NOT EXISTS cita(
	pk INT UNSIGNED NOT NULL AUTO_INCREMENT,
	fecha_creacion DATETIME NOT NULL,
	fecha_consulta DATETIME NOT NULL,
	nombre_paciente varchar(60) NOT NULL,
	estado INT NOT NULL,
	fk_consultorio INT UNSIGNED NOT NULL,
	fk_medico INT UNSIGNED NOT NULL,
	PRIMARY KEY (pk),
	FOREIGN KEY (fk_consultorio) REFERENCES consultorio(pk),
	FOREIGN KEY (fk_medico) REFERENCES medico(pk)
);

```

## 
``` python
#listado de citas en formato json
http://localhost:3456/cita/all


#endpoint test creacion de cita
http://localhost:3456/cita/test

```



