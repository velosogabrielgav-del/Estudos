public class PrincipalIdadePessoa {
    public static void main(String[] args) {
        IdadePessoa idadepessoa = new IdadePessoa();

        idadepessoa.setIdade(20);
        idadepessoa.setNome("Gabriel");

        System.out.println("Meu nome é " + idadepessoa.getNome());
        System.out.println("Tenho "+idadepessoa.getIdade()+ " anos" );
        idadepessoa.verificarIdade();
    }
}
