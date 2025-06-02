class Solution {
    public double[] convertTemperature(double Celsius) {
        double res[] =  new double[2];
        res[0] =  Celsius + 273.15;
        res[1] =  Celsius * 1.80 + 32.00;
 return res;
    }
}