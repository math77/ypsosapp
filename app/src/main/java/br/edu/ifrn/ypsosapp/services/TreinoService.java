package br.edu.ifrn.ypsosapp.services;

import java.util.List;

import br.edu.ifrn.ypsosapp.models.Treino;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface TreinoService {

    @POST("treinos")
    Call<Treino> createTreino(@Body Treino treino);

    @GET("treinos")
    Call<List<Treino>> getTreinos();

    @GET("treinos/{id}")
    Call<Treino> getTreinoById(@Path("id") Treino idTreino);

    @GET("treinos/{nome}")
    Call<List<Treino>> getTreinoByNome(@Path("nome") Treino nomeTreino);

    @GET("treinos/{aluno}")
    Call<List<Treino>> getTreinosByAluno(@Path("aluno") Treino aluno);

}
