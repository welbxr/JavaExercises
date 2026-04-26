void main()
{

    Alimentacao arroz = new Alimentacao();
    Cultura filme = new Cultura();
    Vestuario camisa = new Vestuario();
    SaudeBemEstar academia = new SaudeBemEstar();

    System.out.println(arroz.tributes(20));
    System.out.println(filme.tributes(80));
    System.out.println(camisa.tributes(120));
    System.out.println(academia.tributes(150));

}
