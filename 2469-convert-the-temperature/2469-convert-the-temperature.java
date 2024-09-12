class Solution {
    public double[] convertTemperature(double celsius) {
        double[] answer = new double[2];

        double kelvin = celsius + 273.15;
        answer[0] = kelvin;

        double farenheit = celsius * 1.80 + 32.00;
        answer[1] = farenheit;
        return answer;
    }
}