
package clases;


public class Mixto {
    private int numerador;
    private int denominador;
    private int entero;
    
    public Mixto(int numerador, int denominador, int entero) throws DenominadorCeroException{
        this.numerador = numerador;
        this.denominador = denominador;
        this.entero = entero;
        if (this.denominador == 0){
            throw new DenominadorCeroException();
        }   
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }
    
    public Mixto suma(Mixto f2) throws DenominadorCeroException{
        int num, den, enter;
        Mixto f;
        num = (this.numerador * f2.denominador) + (this.denominador * f2.numerador);
        den = this.denominador * f2.denominador;
        enter = this.entero + f2.entero;
        f = new Mixto(num,den,enter);
        return f;
    }
    
    public Mixto resta(Mixto f2) throws DenominadorCeroException{
        int numf1, numf2, denf1, denf2, num, den, numixto, demixto, enter;
        Mixto f;
        numf1 = (this.entero * this.denominador) + this.numerador;
        denf1 = this.denominador;
        numf2 = (f2.entero * f2.denominador) + f2.numerador;
        denf2 = f2.denominador;
        num = (numf1 * denf2) - (denf1 * numf2);
        den = denf1 * denf2;
        enter = (num / den);
        numixto = (num % den);
        demixto = den;
        f = new Mixto(enter,numixto,demixto);
        return f;
    }
    
    public Mixto multiplicacion(Mixto f2) throws DenominadorCeroException{
        int numf1, numf2, denf1, denf2, num, den, numixto, demixto, enter;
        Mixto f;
        numf1 = (this.entero * this.denominador) + this.numerador;
        denf1 = this.denominador;
        numf2 = (f2.entero * f2.denominador) + f2.numerador;
        denf2 = f2.denominador;
        num = numf1 * numf2;
        den = denf1 * denf2;
        enter = (num / den);
        numixto = (num % den);
        demixto = den;
        f = new Mixto(enter,numixto,demixto);
        return f;
    }
    
    public Mixto division(Mixto f2) throws DenominadorCeroException{
        int numf1, numf2, denf1, denf2, num, den, numixto, demixto, enter;
        Mixto f;
        numf1 = (this.entero * this.denominador) + this.numerador;
        denf1 = this.denominador;
        numf2 = (f2.entero * f2.denominador) + f2.numerador;
        denf2 = f2.denominador;
        num = numf1 * denf2;
        den = denf1 * numf2;
        enter = (num / den);
        numixto = (num % den);
        demixto = den;
        f = new Mixto(enter,numixto,demixto);
        return f;
    }
   
}