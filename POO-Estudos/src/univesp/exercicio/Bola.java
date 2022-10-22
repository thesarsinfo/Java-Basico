package src.univesp.exercicio;

public class Bola
{
    private String material;
    private String cor;
    private int tamanho;
    private boolean cheia;   
    public String getMaterial(){return this.material;}
    public void setMaterial(String material){ this.material = material;}
    public String getCor() {return this.cor;}
    public void setCor(String cor) { this.cor = cor;}
    public int getTamanho() {return this.tamanho;}
    public void setTamanho(int tamanho) { this.tamanho = tamanho;}
    public boolean getCheia() {return this.cheia;}   
    public void setCheia(Boolean cheia) { this.cheia = cheia;}    
 

    public Bola(){}
    public Bola(String material, String cor, int tamanho, boolean cheia){}
    public Bola(String cor, int tamanho){}

    public void pintar(String cor)
    {
        setCor(cor);
    }
    public void encher()
    {
        if(getCheia()) {
            System.out.println("A bola já se encontra cheia");
        }
        else {
            setCheia(true);
        }
    }
    public void esvaziar()
    {
        if(getCheia())
        {
            setCheia(false);
        }
        else{
            System.out.println("A bola já se encontra vazia");
        }
    }    
}