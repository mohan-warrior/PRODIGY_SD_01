# Temperature Converter

This temperature converter is built using Java programming language. It converts temperatures between Celsius, Fahrenheit, and Kelvin scales.

## Features

- Converts temperatures between Celsius, Fahrenheit, and Kelvin
- User-friendly command-line interface
- Displays results with two decimal places of precision

## Requirements

You must have Java installed to run this program.

## How it works

The program uses a `Scanner` to get user input for the temperature value and unit. It then applies the appropriate conversion formulas based on the input unit:

- Celsius to Fahrenheit: F = (C * 9/5) + 32
- Celsius to Kelvin: K = C + 273.15
- Fahrenheit to Celsius: C = (F - 32) * 5/9
- Fahrenheit to Kelvin: K = (F + 459.67) * 5/9
- Kelvin to Celsius: C = K - 273.15
- Kelvin to Fahrenheit: F = (K * 9/5) - 459.67

The converted temperatures are then displayed to the user.

## Usage

1. Run the program
2. Enter a temperature value when prompted
3. Enter the original unit (C, F, or K) when prompted
4. View the converted temperatures in all three scales
