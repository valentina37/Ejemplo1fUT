package com.ejemplo1.millan.app.variables;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "entrenadores")
public class Entrenador {
@Id
@GeneratedValue( strategy = GenerationType.IDENTITY)
private Integer id;
private String nombre;
private String apellido;
private int edad;
private String nacionalidad;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public String getNacionalidad() {
	return nacionalidad;
}

public void setNacionalidad(String nacionalidad) {
	this.nacionalidad = nacionalidad;
}

}



