package ComplexNumberCalculator.Controller;

import ComplexNumberCalculator.Model.Calculator;

/**
 * CalculateInterface интерфейс для реализации методов;
 * @see CalculatorDecorator #additionNumbers(Calculator numberNew);
 * @see CalculatorDecorator #subtractNumbers(Calculator numberNew);
 * @see CalculatorDecorator #multiplyNumbers(Calculator numberNew);
 * @see CalculatorDecorator #divideNumbers(Calculator numberNew);
 */
public interface CalculateInterface {
    Calculator additionNumbers(Calculator numberNew);

    Calculator subtractNumbers(Calculator numberNew);

    Calculator multiplyNumbers(Calculator numberNew);

    Calculator divideNumbers(Calculator numberNew);

    String toString();
}