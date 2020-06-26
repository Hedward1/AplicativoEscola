package com.unicuritiba.a01_escola_pi.Networking;

import android.os.AsyncTask;

import org.json.JSONObject;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConexionSecretaria {
    public static class ClasseAssincrona extends AsyncTask<String, Void, String> {

        private ConexaoListener conexaoListener;

        public ClasseAssincrona(ConexaoListener conexaoListener) {
            this.conexaoListener = conexaoListener;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            try {
                JSONObject objetoResposta = new JSONObject(s);
                conexaoListener.onConexaoFinalizada(objetoResposta);
            } catch (Exception e) {
                conexaoListener.onConexaoFinalizada(null);
            }
        }

        @Override
        protected String doInBackground(String... strings) {

            String urlString = strings[0];

            try {
                URL url = new URL(urlString);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

                //urlConnection.setRequestMethod("GET");
                //urlConnection.setConnectTimeout(10000);
                //urlConnection.setReadTimeout(10000);

                // urlConnection.setRequestMethod("POST");
                //urlConnection.addRequestProperty("Content-Type","application/json");
                //urlConnection.setDoOutput(true);

                // JSONObject object = new JSONObject();
                //OutputStream outputStream = urlConnection.getOutputStream();
                //outputStream.write(object.toString().getBytes());
                //outputStream.flush();

                urlConnection.connect();

                if (urlConnection.getResponseCode() == 200) {
                    InputStream inputStream = urlConnection.getInputStream();
                    return IOUtils.toString(inputStream, "UTF-8");
                } else {
                    return null;
                }
            } catch (Exception e) {
                return null;
            }
        }

        public interface ConexaoListener {
            void onConexaoFinalizada(JSONObject object);
        }
    }
}
