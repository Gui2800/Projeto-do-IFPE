package rpg;
public class Luta extends CriarPersonagem{
    
    public Luta(String nome, String raca, String sexo, int idade, String classe) {
        super(nome, raca, sexo, idade, classe);
    }
    
    
    public void atacarFis(){
        System.out.println("Atacar o inimigo " + ", dando um dano de " + this.getAtaqueFisico());
        //Diminuir a vida do inimigo
        
    }
    public void atacarMag(){
        System.out.println("Atacar o inimigo " + ", dando um dano de " + this.getAtaqueMagico());
        //Diminuir a vida do inimigo
    }
    
    public void defender(){
        
    }
    
}
