package br.edu.ifrn.ypsosapp.services;

import java.util.List;

import br.edu.ifrn.ypsosapp.models.Aluno;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface AlunoService {

    @POST("alunos")
    Call<Aluno> createAluno(@Body Aluno aluno);

    @GET("alunos/{id}")
    Call<Aluno> getAlunoById(@Path("id") Aluno idAluno);

    @GET("alunos")
    Call<List<Aluno>> getAlunos();

    @GET("alunos/{nome}")
    Call<List<Aluno>> getAlunosByNome(@Path("nome") Aluno nomeAluno);

    // Verificar se está correto.
    @PUT("alunos")
    Call<Boolean> updateAluno(@Body Aluno aluno);

    //Colocar métodos de deletar conta e realizar login.

}
