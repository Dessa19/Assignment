public class TvShow extends Media {

   private int seasons;
    private int episodes;


    public TvShow( int seasons, int episodes) {
     this.setSeasons(seasons);
        this.setEpisodes(episodes);

    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
