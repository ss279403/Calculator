package com.lmig.gfc.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.lmig.gfc.calculator.models.Calculator;

@Controller
public class CalculatorController {

	private Calculator calc;

	public CalculatorController() {
		calc = new Calculator();
	}

	@RequestMapping("/")
	public ModelAndView showPage(Integer firstNumber, Integer secondNumber, String operator) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");

		if (operator != null) {

			calc.setFirstNumber(firstNumber);
			calc.setSecondNumber(secondNumber);
			calc.setOperator(operator);

			if (operator.equals("+")) {
				calc.add();
			}

			if (operator.equals("-")) {
				calc.subtract();
			}

			if (operator.equals("*")) {
				calc.multiply();
			}

			if (operator.equals("/")) {
				calc.divide();
			}

			if (operator.equals("^")) {
				calc.expo();
			}

			mv.addObject("calc", calc);

		}

		return mv;
	}

}
