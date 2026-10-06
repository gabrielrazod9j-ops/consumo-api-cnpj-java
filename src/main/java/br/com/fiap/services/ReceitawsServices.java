package br.com.fiap.services;

import br.com.fiap.api.Empresa;
import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class ReceitawsServices {


    public Empresa getEmpresa(String cnpj) throws IOException {

        Empresa empresa = null;

        // request
        // cria a requisição HTTP GET para a URL do Receitaws com o cnpj informado
        HttpGet request = new HttpGet("https://www.receitaws.com.br/v1/cnpj/"+cnpj);

        // client
        CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();

        // response
        CloseableHttpResponse response = httpClient.execute(request);

        // entity
        HttpEntity entity = response.getEntity();

        if (entity != null){

            // Converte o conteúdo da resposta para uma String em formato JSON
            String result = EntityUtils.toString(entity);

            Gson gson = new Gson();
            empresa = gson.fromJson(result, Empresa.class);
        }
        return empresa;
    }
}
