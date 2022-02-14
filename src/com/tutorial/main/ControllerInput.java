package com.tutorial.main;

import com.studiohartman.jamepad.ControllerManager;
import com.studiohartman.jamepad.ControllerState;

public class ControllerInput extends ControllerManager{
	
	ControllerManager controllers = new ControllerManager();
	
	public ControllerInput(){

		controllers.initSDLGamepad();
	}
		
	public void getJoy() {
		ControllerState currState = this.controllers.getState(0);

	
	if(!currState.isConnected || currState.b) {
		System.out.println("\"b\" on \"" + currState.controllerType + "\" is pressed");
	}
	if(currState.a) {
	  System.out.println("\"A\" on \"" + currState.controllerType + "\" is pressed");
	}
	}
}