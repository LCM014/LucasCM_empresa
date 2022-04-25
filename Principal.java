public class Principal
{
    public static void main(String[] args) 
    {
        Vendedor v = new Vendedor();
        v.setNome("Maria");
        v.setDataDeEntrada("02/03/1992");
        v.setDepartamento("Vendas");
		v.setEstaNaEmpresa(true);
		v.setRg("45");

        Gerente g = new Gerente();
        g.setNome("Marcelo");

     

    }
}