package com.lmig.gfc.calculator.models;

import java.util.ArrayList;

public class Calculator {
	private float firstNumber;
	private float secondNumber;
	private String operator;
	private double result;

	private ArrayList<String> history;

	public Calculator() {
		history = new ArrayList<String>();
	}

	public void add() {
		result = firstNumber + secondNumber;
		history.add(0, firstNumber + " " + operator + " " + secondNumber + " =  " + result);
	}

	public void subtract() {
		result = firstNumber - secondNumber;
		history.add(0, firstNumber + " " + operator + " " + secondNumber + " =  " + result);
	}

	public void multiply() {
		result = firstNumber * secondNumber;
		history.add(0, firstNumber + " " + operator + " " + secondNumber + " =  " + result);
	}

	public void divide() {
		result = firstNumber / secondNumber;
		history.add(0, firstNumber + " " + operator + " " + secondNumber + " =  " + result);
	}

	public void expo() {
		result = Math.pow(firstNumber, secondNumber);
		history.add(0, firstNumber + " " + operator + " " + secondNumber + " =  " + result);
	}

	public float getFirstNumber() {
		return firstNumber;
	}

	public float getSecondNumber() {
		return secondNumber;
	}

	public String getOperator() {
		return operator;
	}

	public double getResult() {
		return result;
	}

	public void setFirstNumber(float firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(float secondNumber) {
		this.secondNumber = secondNumber;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public ArrayList<String> getHistory() {
		return history;
	}

	public void setHistory(ArrayList<String> history) {
		this.history = history;
	}

}
