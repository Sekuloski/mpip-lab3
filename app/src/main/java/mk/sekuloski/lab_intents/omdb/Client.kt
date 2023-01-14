package mk.sekuloski.lab_intents.omdb

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Client {

    companion object {
        private var api: Api? = null
        val apiKey = "82d5f771";

        fun getOMDbApi(): Api? {
            if(api == null) {
                api = Retrofit.Builder()
                    .baseUrl("http://www.omdbapi.com")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(Api::class.java)
            }

            return api
        }
    }

}