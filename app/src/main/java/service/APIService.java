package service;

public class APIService {
    private static String base_url = "https://stmusic.000webhostapp.com/sever/";
    public static Datasevice getservice(){
        return APIretrofitclient.getClient(base_url).create(Datasevice.class);

    }
}
