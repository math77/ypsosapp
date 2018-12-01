package br.edu.ifrn.ypsosapp.network;

import br.edu.ifrn.ypsosapp.services.AlunoService;
import br.edu.ifrn.ypsosapp.services.AvaliacaoFisicaService;
import br.edu.ifrn.ypsosapp.services.ExercicioService;
import br.edu.ifrn.ypsosapp.services.GrupoMuscularService;
import br.edu.ifrn.ypsosapp.services.PlanoService;
import br.edu.ifrn.ypsosapp.services.ProfessorService;
import br.edu.ifrn.ypsosapp.services.TreinoService;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfig {

    private static Retrofit retrofit;
    private static final String BASE_URL = "url_api_rest";

    /*
    * Create retrofit instance for api connection.
    *
    */
    public static Retrofit getRetrofitInstance(){
        if(retrofit == null){
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(JacksonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public AlunoService getAlunoService(){
        return RetrofitConfig.retrofit.create(AlunoService.class);
    }

    public ProfessorService getProfessorService(){
        return RetrofitConfig.retrofit.create(ProfessorService.class);
    }

    public ExercicioService getExercicioService(){
        return RetrofitConfig.retrofit.create(ExercicioService.class);
    }

    public AvaliacaoFisicaService getAvaliacaoFisicaService(){
        return RetrofitConfig.retrofit.create(AvaliacaoFisicaService.class);
    }

    public GrupoMuscularService getGrupoMuscularService(){
        return RetrofitConfig.retrofit.create(GrupoMuscularService.class);
    }

    public PlanoService getPlanoService(){
        return RetrofitConfig.retrofit.create(PlanoService.class);
    }

    public TreinoService getTreinService(){
        return RetrofitConfig.retrofit.create(TreinoService.class);
    }
}
