package univesp.exercicio;

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
 

    public Bola()
    {
        this.material = "";
        this.cor = "";
        this.tamanho = 0;
        this.cheia = false;
    }
    public Bola(String material, String cor, int tamanho, boolean cheia)
    {
        this.material = material;
        this.cor = cor;
        this.tamanho = tamanho;
        this.cheia = cheia;
    }
    public Bola(String cor, int tamanho)
    {        
        this.cor = cor;
        this.tamanho = tamanho;        
    }

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