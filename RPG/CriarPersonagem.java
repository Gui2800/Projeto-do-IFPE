package rpg;
public class CriarPersonagem {
    private String nome;
    private String raca;
    private String sexo;
    private int idade;
    private String classe;
    private double vida;
    private double mana;
    private double ataqueFisico;
    private double ataqueMagico;
    
    //Nome
    private String getNome(){
        return nome;
    }
    private void setNome(String nome){
        this.nome = nome;
    }

    //Idade
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    //Raca
    private String getRaca(){
        return raca;
    }
    private void setRaca(String raca){
        if ("Elfo".equals(raca)) {
            this.raca = "Elfo";
        }else if ("Humanno".equals(raca)) {
            this.raca = "Humano";
        }else if ("Orc".equals(raca)) {
            this.raca = "Orc";
        }else if ("Goblin".equals(raca)) {
            this.raca = "Goblin";
        }else if ("Anão".equals(raca)) {
            this.raca = "Anão";
        }else {
            System.out.println("Raça, não existente.");
        }
    }
    
    //Sexo
    private String getSexo(){
        return sexo;
    }
    private void setSexo(String sexo){
        if ("Masculino".equals(sexo)) {
            this.sexo = "Masculino";
        }else if ("Feminino".equals(sexo)) {
            this.sexo = "Feminino";
        }else {
            System.out.println("Exite outro sexo? hahaha");
        }
    }
    
    //Classe
    private String getClasse(){
        return classe;
    }
    private void setClasse(String classe){
        if ("Guerreiro".equals(classe)) {
            this.classe = "Guerreiro";
        }else if ("Mago".equals(classe)) {
            this.classe = "Mago";
        }else if ("Druida".equals(classe)) {
            this.classe = "Druida";
        }else if ("Ladino".equals(classe)) {
            this.classe = "Ladino";
        }else if ("Caçador".equals(classe)) {
            this.classe = "Caçador";
        }else {
            System.out.println("Esta classe não existe meu(minha) caro(a).");
        }
    }
    
    //Vida 
    private double getVida(){
        return vida;
    }
    private void setVida(double vida ){
        if (this.getClasse() == "Guerreiro") {
            this.vida = 2500;
        }else if (this.getClasse() == "Mago") {
            this.vida = 1650;
        }else if (this.getClasse() == "Druida") {
            this.vida = 2350;
        }else if (this.getClasse() == "Ladino") {
            this.vida = 1500;
        }else if (this.getClasse() == "Caçador") {
            this.vida = 1500;
        }
    }
    
    //Mana
    private double getMana(){
        return mana;
    }
    private void setMana(double mana){
        if (this.getClasse() == "Guerreiro") {
            this.mana = 550;
        }else if (this.getClasse() == "Mago") {
            this.mana = 1200;
        }else if (this.getClasse() == "Druida") {
            this.mana = 1050;
        }else if (this.getClasse() == "Ladino") {
            this.mana = 470;
        }else if (this.getClasse() == "Caçador") {
            this.mana = 500;
        }
    }
    
    //Ataque Fisico
    private double getAtaqueFisico(){
        return ataqueFisico;
    }
    private void setAtaqueFisico(double ataqueFisico){
        if (this.getClasse() == "Guerreiro") {
            this.ataqueFisico = 55;
        }else if (this.getClasse() == "Mago") {
            this.ataqueFisico = 5;
        }else if (this.getClasse() == "Druida") {
            this.ataqueFisico = 25;
        }else if (this.getClasse() == "Ladino") {
            this.ataqueFisico = 80;
        }else if (this.getClasse() == "Caçador") {
            this.ataqueFisico = 85;
        }
    }
    
    //Ataque Magico
    private double getAtaqueMagico(){
        return ataqueMagico;
    }
    private void setAtaqueMagico(double ataqueMagico ){
        if (this.getClasse() == "Guerreiro") {
            this.ataqueMagico = 0;
        }else if (this.getClasse() == "Mago") {
            this.ataqueMagico = 86;
        }else if (this.getClasse() == "Druida") {
            this.ataqueMagico = 25;
        }else if (this.getClasse() == "Ladino") {
            this.ataqueMagico = 8;
        }else if (this.getClasse() == "Caçador") {
            this.ataqueMagico = 5;
        }
    }
    
    public void descriçao(){
        if (this.getClasse() == "Guerreiro") {
            System.out.println("Os guerreiros se equipam cuidadosamente ");
            System.out.println("para o combate e enfrentam seus inimigos de frente, ");
            System.out.println("permitindo que ataques atinjam sua pesada armadura");
        }else if (this.getClasse() == "Mago") {
            System.out.println("Os magos destroem seus adversários com o uso de conjurações arcanas.");
        }else if (this.getClasse() == "Druida") {
            System.out.println("Os druidas são combatentes versáteis e capazes de ");
            System.out.println("atuar em quase todas as funções: curador ");
            System.out.println(", tanque ou causador de danos.");
        }else if (this.getClasse() == "Ladino") {
            System.out.println("Os ladinos geralmente iniciam o combate ");
            System.out.println("com um ataque surpresa vindo das sombras ");
            System.out.println("seguido de golpes corpo a corpo brutais.");
        }else if (this.getClasse() == "Caçador") {
            System.out.println("Os caçadores lutam contra o inimigo à distância, ");
            System.out.println("ordenando seus animais para o ataque enquanto lançam ");
            System.out.println("suas flechas e atiram com suas armas de fogo.");
        }
        System.out.println("E assim começa a jornada do(a) " + this.getNome() + ", com incriveis " + this.getIdade() + " anos de idade.");
        System.out.println("O mesmo(a) da raça " + this.getRaca() + " e da classe " + this.getClasse() + ".");
        System.out.println("-----ATRIBUTOS-----");
        System.out.println("Vida: " + this.vida);
        System.out.println("Mana: " + this.mana);
        System.out.println("Ataque Fisico: " + this.ataqueFisico);
        System.out.println("Ataque Magico: " + this.ataqueMagico);
    }
    
    //Construtor
    public CriarPersonagem(String nome, String raca, String sexo, int idade, String classe){
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.idade = idade;
        this.classe = classe;
    }
}
