package br.edu.ifrn.ypsosapp.services;

import java.util.List;

import br.edu.ifrn.ypsosapp.models.GrupoMuscular;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GrupoMuscularService {

    @GET("gruposmusculares")
    Call<List<GrupoMuscular>> getGruposMusculares();

    @GET("gruposmusculares/{descricao}")
    Call<List<GrupoMuscular>> getGruposByDescricao(@Path("descricao") GrupoMuscular descricao);
}
