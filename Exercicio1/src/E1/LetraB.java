package E1;

/* Criar um programa é solicitado ao usuário que digite o valor do raio de
uma circunferência. O programa retorna o valor do diâmetro e de
1 quadrante desta circunferência. */
public class LetraB {
    public double raio;
    
    public double calcularDiametro()
    {
        return (this.raio * 2);
    }
    
    // Àrea / 4
    public double calcularQuadrante()
    {
        return (Math.PI * Math.pow(this.raio, 2)) / 4;
    }
}
