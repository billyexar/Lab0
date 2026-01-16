public class Movie {
    private final String aDirector;
    private final int aRunTime;
    private final Genre aGenre;

    public Movie(String pDirector, int pRunTime, Genre pGenre){
        aDirector = pDirector;
        aRunTime = pRunTime;
        aGenre = pGenre;
    }

    public String getDirector(){
        return aDirector;
    }

    public int getRunTime(){
        return aRunTime;
    }

    public Genre getGenre(){
        return aGenre;
    }

}
