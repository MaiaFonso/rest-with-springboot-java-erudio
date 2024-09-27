package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exceptions.UnsupportedMathOperationsException;
import com.example.demo.functions.FunctionsController;
import com.example.demo.operations.SimpleMath;

@RestController
public class MathController {
	
	private SimpleMath simpleMath = new SimpleMath(); 
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
		) throws Exception {
		if (!FunctionsController.isNumeric(numberOne) || !FunctionsController.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationsException("Forneça um valor numérico");
		}
		return simpleMath.sum(FunctionsController.convertToDouble(numberOne), FunctionsController.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sub(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
		) throws Exception {
		if (!FunctionsController.isNumeric(numberOne) || !FunctionsController.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationsException("Forneça um valor numérico");
		}
		return simpleMath.sub(FunctionsController.convertToDouble(numberOne), FunctionsController.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/mul/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mul(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
		) throws Exception {
		if (!FunctionsController.isNumeric(numberOne) || !FunctionsController.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationsException("Forneça um valor numérico");
		}
		return simpleMath.mul(FunctionsController.convertToDouble(numberOne), FunctionsController.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double div(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
		) throws Exception {
		if (!FunctionsController.isNumeric(numberOne) || !FunctionsController.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationsException("Forneça um valor numérico");
		}
		return simpleMath.div(FunctionsController.convertToDouble(numberOne), FunctionsController.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/med/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double med(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
		) throws Exception {
		if (!FunctionsController.isNumeric(numberOne) || !FunctionsController.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationsException("Forneça um valor numérico");
		}
		return simpleMath.med(FunctionsController.convertToDouble(numberOne), FunctionsController.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/raiz/{numberOne}", method = RequestMethod.GET)
	public Double raiz(@PathVariable(value = "numberOne") String numberOne) throws Exception {
		if (!FunctionsController.isNumeric(numberOne)) {
			throw new UnsupportedMathOperationsException("Forneça um valor numérico");
		}
		return simpleMath.raiz(FunctionsController.convertToDouble(numberOne));
	}
	
}
