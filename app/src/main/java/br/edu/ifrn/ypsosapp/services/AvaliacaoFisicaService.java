package br.edu.ifrn.ypsosapp.services;


import java.util.List;

import br.edu.ifrn.ypsosapp.models.AvaliacaoFisica;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface AvaliacaoFisicaService {

    @POST("avaliacoes")
    Call<AvaliacaoFisica> createAvaliacao(@Body AvaliacaoFisica avaliacaoFisica);

    @GET("avaliacoes")
    Call<List<AvaliacaoFisica>> getAvaliacoes();

    @GET("avaliacoes/{id}")
    Call<AvaliacaoFisica> getAvaliacaoById(@Path("id") AvaliacaoFisica idAvaliacao);

    //Criar endpoint para pegar ultima avaliacao realizada
}
