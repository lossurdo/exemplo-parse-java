package com.lossurdo.exparsejava.bd;

import com.lossurdo.exparsejava.bean.Aluno;
import com.lossurdo.exparsejava.util.ParseUtil;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author lossurdo
 */
public class AlunoBD {
    
    private Client client;

    public AlunoBD() {
        ClientConfig config = new DefaultClientConfig();
        client = Client.create(config);
    }

    public void salvar(Aluno aluno) {
        WebResource resource = client.resource(ParseUtil.PARSE_URL + "aluno");
        
        ClientResponse response = resource
                .type(MediaType.APPLICATION_JSON)
                .header("X-Parse-Application-Id", ParseUtil.PARSE_APPLICATION_ID)
                .header("X-Parse-REST-API-Key", ParseUtil.PARSE_REST_KEY)
                .header("Content-Type", "application/json")
                .post(ClientResponse.class, aluno);
        
        System.out.println("Resposta do PARSE: " + response.getEntity(String.class));
    }

}
