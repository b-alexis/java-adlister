public class Config {
    private static String url;
    private static String user;
    private static String password;

//    public Config(String url, String user, String password) {
//        this.url = url;
//        this.user = user;
//        this.password = password;
//    }

    public static String getUrl() {
        return url;
    }

    public static String getUser(){
        return user;
    }

    public static String getPassword(){
        return password;
    }
}

