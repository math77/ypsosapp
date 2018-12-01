package br.edu.ifrn.ypsosapp.services;

import java.util.List;

import br.edu.ifrn.ypsosapp.models.Aluno;
import br.edu.ifrn.ypsosapp.models.Plano;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface PlanoService {

    @POST("planos")
    Call<Plano> createPlano(@Body Plano plano);

    @GET("planos")
    Call<List<Plano>> getPlanos();

    @GET("planos/{id}")
    Call<Plano> getPlanoById(@Path("id") Plano idPlano);

    @GET("planos/{nome}")
    Call<List<Plano>> getPlanosByNome(@Path("nome") Plano nomePlano);

    @GET("planos/{aluno}")
    Call<List<Plano>> getPlanosByAluno(@Path("aluno") Aluno loginAluno);

}
