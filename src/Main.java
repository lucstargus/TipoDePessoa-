public class Main {
    public static void main(String[] args) {

        Juridica PessoaJuridica = new Juridica();

        PessoaJuridica.setNome("Gus Fring");
        PessoaJuridica.setCNPJ(33311122233000L);
        PessoaJuridica.setIdade(51d);
        PessoaJuridica.setEmpresa("Los Pollos Hermanos");

        Fisica PessoaFisica = new Fisica();

        PessoaFisica.setNome("Walter White");
        PessoaFisica.setCPF(42333366460L);
        PessoaFisica.setIdade(65d);
        PessoaFisica.setEmprego("Professor");


        System.out.println("Pessoa Juridica: " + "\nNome: " + PessoaJuridica.getNome() + "\nCPNJ: " + PessoaJuridica.getCNPJ()
                + "\nIdade:" + PessoaJuridica.getIdade() + "\nEmpresa: " + PessoaJuridica.getEmpresa());
        System.out.println("\nPessoa Fisica: " + "\nNome: " + PessoaFisica.getNome() + "\nCPF: " + PessoaFisica.getCPF()
                + "\nIdade:" + PessoaFisica.getIdade() + "\nEmprego: " + PessoaFisica.getEmprego());
    }
}