package br.edu.ifrn.ypsosapp.services;

import java.util.List;

import br.edu.ifrn.ypsosapp.models.Professor;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ProfessorService {

    @POST("professores")
    Call<Professor> createProfessor(@Body Professor professor);

    @GET("professores")
    Call<List<Professor>> getProfessores();

    @GET("professores/{id}")
    Call<Professor> getProfessorById(@Path("id") Professor idProfessor);

    @GET("professores/{nome}")
    Call<List<Professor>> getProfessorByNome(@Path("nome") Professor nomeProfessor);

}
