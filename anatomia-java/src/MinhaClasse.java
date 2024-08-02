public class MinhaClasse {
    public static void main(String[] args){
        String primeiroNome = "Samuel";
        String segundoNome = "Duarte";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println("Nome completo: " + nomeCompleto);

    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
