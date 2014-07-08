package modelo.util;

import modelo.negocio.Funcionario;

public class Acesso {

    private static Funcionario funcionarioLogado;

    public static Funcionario getFuncionarioLogado() {
        return funcionarioLogado;
    }

    public static void setFuncionarioLogado(Funcionario funcionarioLogado) {
        Acesso.funcionarioLogado = funcionarioLogado;
    }
}
