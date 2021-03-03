package E1;

/* Criar um programa onde é solicitado a digitação do nome do aluno mais 3 notas.
O programa deverá retornar o nome e clacular a média aritmética deste aluno.
nota1 + nota2 + nota 3 / 3. */
public class LetraA {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
  
    public double calcularMedia()
    {
        // Média aritimética
        return (this.nota1 + this.nota2 + this.nota3) / 3; 
    }
    
}
