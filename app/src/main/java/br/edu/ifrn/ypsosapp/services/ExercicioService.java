package br.edu.ifrn.ypsosapp.services;

import java.util.List;

import br.edu.ifrn.ypsosapp.models.Exercicio;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ExercicioService {

    @POST("exercicios")
    Call<Exercicio> createExercicio(@Body Exercicio exercicio);

    @GET("exercicios")
    Call<List<Exercicio>> getExercicios();

    @GET("exercicios/{id}")
    Call<Exercicio> getExercicioById(@Path("id") Exercicio idExercicio);

    @GET("exercicios/{nome}")
    Call<List<Exercicio>> getExerciciosByNome(@Path("nome") Exercicio nomeExercicio);

}
