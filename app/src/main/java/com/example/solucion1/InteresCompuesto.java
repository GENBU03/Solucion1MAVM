package com.example.solucion1;

public class InteresCompuesto {
    double capital = 0;
    double tasa = 0;
    double tiempo = 0;

    public InteresCompuesto(double cap, double tas, double tie){
        this.capital = cap;
        this.tasa = tas;
        this.tiempo = tie;
    }
    public double Acumulado(){
         return this.capital*Math.pow((1 + this.tasa/100),tiempo);

    }

    public double Interes(){
        return this.Acumulado() - this.capital;
    }

}
