package com.uca.capas.domain;

import javax.validation.constraints.AssertTrue;

public class Robot {
	@AssertTrue(message = "No puedes agregar un producto porque eres robot, hacer click en regresar")
	private Boolean soyRobot;
	
	public Boolean getSoyRobot() {
		return soyRobot;
	}

	public void setSoyRobot(Boolean soyRobot) {
		this.soyRobot = soyRobot;
	}

	

}
