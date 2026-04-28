# Unit Converter

This project is a simple web application that allows users to convert between different units of measurement, including length, weight, volume, area, and temperature. Users can input a value, select the units to convert from and to, and view the converted value.

## Features
- Convert units of length: millimeter, centimeter, meter, kilometer, inch, foot, yard, mile.
- Convert units of weight: milligram, gram, kilogram, ounce, pound.
- Convert temperature: Celsius, Fahrenheit, Kelvin.

## How to Run the Application
1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```bash
   cd unit-converter
   ```
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```
5. Open a web browser and go to `http://localhost:8080` to access the application.

You can include the following units of measurement to convert between:

Length: millimeter, centimeter, meter, kilometer, inch, foot, yard, mile.

Weight: milligram, gram, kilogram, ounce, pound.

Temperature: Celsius, Fahrenheit, Kelvin.

How it works
You don't need to use any database for this project. There will be a simple webpage that will submit the form to the server and get the converted value back and display it on the webpage.

Unit Converter
You can have 3 webpages for each type of unit conversion (length, weight, temperature) with forms to input the value and select the units to convert from and to. Submitting a form will submit the data to the current page (i.e. target="_self") and display the converted value. You can do this using the backend programming language of your choice i.e. check if the form is submitted and then calculate the converted value and display it on the webpage, if not submitted then display the form.