package example.carro;

public class Main {

    public static void main(String[] args)
    {
        Carro carro = new Carro();

        //carro.setMarca("Chevrolet");
        System.out.println("Comprei um carro da " + carro.getMarca());

        //carro.setModelo("Sedan");
        System.out.println("Modelo " + carro.getModelo());

        //carro.setAno(2021);
        System.out.println("ano " + carro.getAno());

        carro.setVariante("variante");
        System.out.println(carro.getVariante());
    }

}
