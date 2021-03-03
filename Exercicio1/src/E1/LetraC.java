package E1;

/* Faça um programa que leia uma variável real "A" digitada pelo usuário
e apresente o resultado dos seguintes cálculos:
- o dobro de "A"
- o triplo do dobro de "A"
- a metade do triplo do dobro de "A"
- o quadrado da variável "A"
- a quinta parte do dobro de "A" */
public class LetraC {
    public double A;
    
    public double dobroA()
    {
        return A * 2;
    }
    public double triploDobroA()
    {
        return this.dobroA() * 3;
    }
    public double metadeTriploDobroA()
    {
        return this.triploDobroA() / 2;
    }
    public double quadradoA()
    {
        return Math.sqrt(this.A);
    }
    public double quintaParteDobroA()
    {
        return this.dobroA() / 5;
    }

    @Override
    public String toString() {
        return "A: " + A
                + "\n- o dobro de A: " + dobroA()
                + "\n- o triplo do dobro de A: " + triploDobroA()
                + "\n- a metade do triplo do dobro de A: " + metadeTriploDobroA()
                + "\n- o quadrado da variável A: " + quadradoA()
                + "\n- a quinta parte do dobro de A: " + quintaParteDobroA();
    }
    
    
}
