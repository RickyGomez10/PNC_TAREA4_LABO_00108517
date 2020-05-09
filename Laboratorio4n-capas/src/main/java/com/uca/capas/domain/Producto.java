package com.uca.capas.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
	@Size(message ="El nombre no debe tener más de 15 caracteres", max=15)
	@NotEmpty(message = "Este campo no puede estar vacío")
	private String nombre;
	
	@Size(message ="El nombre no debe tener más de 15 caracteres", max=30)
	@NotEmpty(message = "Este campo no puede estar vacío")
	private String  descripcion;
	
	@NotNull(message ="El nombre no debe tener más de 15 caracteres")
	@Min(value = 0, message = "Este campo no puede estar vacío")
	private Double precio;
	
	@NotEmpty(message = "Este campo no puede estar vacío")
	@Pattern(regexp ="^(((0[1-9]|[12][0-9]|30)[-/]?(0[13-9]|1[012])|31[-/]?(0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-/]?02)[-/]?[0-9]{4}|29[-/]?02[-/]?([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$" , message="El formato debe ser dd/mm/yyyy")
	private String vencimiento;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}


}
