package br.com.fiap.main;

import br.com.fiap.api.Empresa;
import br.com.fiap.services.ReceitawsServices;

import javax.swing.*;
import java.io.IOException;

public class TesteReceitaws {

    //metodo static:
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    public static void main(String[] args) throws IOException {
        ReceitawsServices receitawsServices = new ReceitawsServices();

        String cnpj = texto("Informe o numero do cnpj desejado:\n(Digite somente numeros)");

        Empresa empresa = receitawsServices.getEmpresa(cnpj);

        System.out.println(empresa);

    }
}
