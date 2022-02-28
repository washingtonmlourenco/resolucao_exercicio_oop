package example.carro;

public class Carro
{
    public String marca;
    public String modelo;
    public Integer ano;
    public String variante;

    public Carro()
    {
        this.marca = "Chevrolet";
        this.modelo = "Sedan";
        this.ano = 2021;
    }

    public String getMarca()
    {
        return marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public Integer getAno()
    {
        return ano;
    }

    public String getVariante()
    {
        return variante;
    }

    public void setVariante(String variante)
    {
        this.variante = variante;
    }
}
