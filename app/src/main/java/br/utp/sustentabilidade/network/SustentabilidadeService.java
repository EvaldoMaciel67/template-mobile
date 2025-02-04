package br.utp.sustentabilidade.network;

import java.util.List;

import br.utp.sustentabilidade.models.Organico;
import br.utp.sustentabilidade.models.RespostaJSON;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface SustentabilidadeService {

    @GET("organico/{id}")
    Call<RespostaJSON<Organico>> listarOrganico(@Path("id") int id);

    @GET("organico/all/{pagina}")
    Call<RespostaJSON<List<Organico>>> listarOrganicos(@Path("pagina") int pagina);

    @POST("organico/new")
    Call<RespostaJSON<Organico>> inserirOrganico(@Body Organico organico);

    @PUT("organico")
    Call<RespostaJSON<Organico>> atualizarOrganico(@Body Organico organico);

    @GET("organico/{id}")
    Call<RespostaJSON<Organico>> removerOrganico(@Path("id") int id);

}
