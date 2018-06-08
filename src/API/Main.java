/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.net.*;
import java.io.*;
/**
 *
 * @author gonzalo
 */
public class Main {
    public static void main(String[] args) throws IOException {
        URL oracle = new URL("http://api.football-data.org/v1/competitions/467/teams");
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        
        String inputLine;
        String lectura = "";
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
            lectura += inputLine;
        }
        
        in.close();
        final String json=lectura;
        final Gson gson = new Gson();
        final Api api = gson.fromJson(json, Api.class);
        System.out.println(api.tamanoTeams());
        for (int i=0; i<api.tamanoTeams();i++){
            System.out.println(api.teams.get(i).toString());
        }
    }
}
