package com.example.maven.project_conversor;

public class ConversorDegreesRadians {
	
	public double degreesToRadian(double numberToConvert) {
		return numberToConvert*Math.PI/180;
	}
	
	public double radiansToDegrees(double numberToConvert) {
		return numberToConvert*180/Math.PI;
	}


}
