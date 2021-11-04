/*
    L'insieme C dei numeri complessi e' l'insieme delle coppie ordinate (x,y) 
    con x e y appartenenti a R (insieme dei numeri reali).
    Dato il numero complesso z = x + i *y,  i numeri reali x e y sono detti
    parte reale e parte immaginaria di z.
    Nei commenti che seguono, facciamo riferimento ai numeri complessi
        z = x + i*y, z1 = x1 + i*y1, z2 = x2 + i*y2
*/

public class MyComplex
{
    double x;
    double y;

    // inizializza il numero complesso al valore 0 + i0 (zero complesso)
    public MyComplex()
    {
        x =0;
        y =0;
    }

    // inizializza il numero complesso al valore re + i*im
    public MyComplex(double _realPart, double _imagPart)
    {
        x = _realPart;
        y = _imagPart;
    }

    //Somma a questo numero complesso il numero complesso z
    //somma di due complessi: z = z1+z2 = (x1+x2) + i(y1+y2)
    public MyComplex add(MyComplex z)
    {
        return new MyComplex(this.x + z.x, this.y + z.y);
    }

    //Sottrae a questo numero complesso il numero complesso z
    //sottrazione di due complessi: z = z1-z2 = (x1-x2) +i(y1-y2)
    public MyComplex sub(MyComplex z)
    {
        return new MyComplex(this.x - z.x, this.y - z.y);
    }

    //Moltiplica questo numero complesso per il numero complesso z
    //prodotto di due complessi: z = z1*z2 = (x1*x2 -y1*y2) + i*(x1*y2 + x2*y1)
    public MyComplex mult(MyComplex z)
    {
        return new MyComplex(this.x*z.x - this.y*z.y, this.x*z.y - z.x*this.y);
    }

    //Divide questo numero complesso per il numero complesso z
    //divisione fra due complessi: z1/z2 = z1 *1/z2, per z2 != 0
    public MyComplex div(MyComplex z)
    {
        
        return this.mult(z.inv());
    }
          
    //Calcola il coniugato di questo numero complesso
    //coniugato del complesso z:  z^= x - i*y
    public MyComplex conj()
    {
        return new MyComplex(this.x, -this.y);
    }
          
    //Calcola l'inverso rispetto al prodotto di un numero complesso
    //inverso del complesso z: 1/z = x/(|z|*|z|) -i*y/(|z|*|z|), per z != 0
    public MyComplex inv()
    {
        return new MyComplex(this.x/(Math.pow(this.x,2)+Math.pow(this.y,2)),-this.y/(Math.pow(this.x,2)+Math.pow(this.y,2)));
    }

    //Calcola il modulo di questo numero complesso
    //modulo del complesso z: |z| = sqrt( x*x + y*y).
    public double mod()
    {
        return this.x*this.x + this.y*this.y;
    }
           
    //Confronta con tolleranza due numeri complessi.
    public boolean approxEquals(MyComplex z)
    {
       if(x == z.x && y ==z.y){
           return true;
       }
       else{
           return false;
       }
    }

    //Crea una stringa che rappresenta questo numero complesso
    //Formato stringa: parte reale + i*parte immaginaria
    public String toString()
    {
        if(y>0){
            return String.format("%.2f %s %.2f", x, "+ i", y );
        }
        else if(y<0){
            return String.format("%.2f %s %.2f", x, "- i", y );
        }
        else{
            return String.format("%f", x);
        }
    }


    //-------- metodi di accesso ----------
          
    //Restituisce la parte complessa di un numero complesso
    public double getIm()
    {
        return x;
    }
    //Restituisce la parte reale di un numero complesso
    public double getRe()
    {
        return y;
    }
}