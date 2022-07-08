 public class Weather {
    public static void main(String[] args) {
        double noon = 77;          //temperature at noon in fahrenheit.
        double evening = 61;       //temperature during the evening in fahrenheit
        double midnight = 55;      //temperature at midnight in fahrenheit

        //Task 3 - Call the printTemperatures function. 

        double celcius1 = fahrenheitToCelsius(77);
        double celcius2 = fahrenheitToCelsius(61);
        double celcius3 = fahrenheitToCelsius(55);

        printTemperatures(77, celcius1);
        printTemperatures(61, celcius2);
        printTemperatures(55, celcius3);
    }

    //Task 1: Make a function here. See the doc comments below. 
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celcius = (fahrenheit - 32) * 5/9;
        return celcius;
    }
    
    /**
     * Function name: fahrenheitToCelsius - converts fahrenheit to celcius
     * @param fahrenheit (double)
     * @return celsius (double)
     * 
     * Inside the function:
     * 1. returns the temperature in celcius. C = (F - 32) * 5/9. 
     */
     
    //Task 2: Make a function here. See the doc comments below. 
    public static void printTemperatures(double fahrenheit, double celcius) {
        System.out.println("The temperature at " + fahrenheit + " in fahrenheit is " + celcius + " degrees in celsius.\n");
    }

    /**
     * Function name: printTemperatures - prints both temperature values. 
     * @param fahrenheit (double)
     * 
     * Inside the function: 
     *  1. prints: F: <temperature in fahrenheit>.
     *  2. prints: C: <temperature in celsius> . 
     */
}