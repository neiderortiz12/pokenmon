package com.example.myapplication.pokeapi;

import com.example.myapplication.models.PokemonRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PokeApiService {

    @GET("pokemon")
    Call<PokemonRespuesta> obtenerListaPokemon();

}
