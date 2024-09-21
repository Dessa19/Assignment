package Composition;

public class TvShow {
    private String seasons;
    private int  episodes;

    public TvShow(String seasons, int episodes) {
        this.seasons = seasons;
        this.episodes = episodes;
    }

    public String getSeasons() {
        return seasons;
    }

    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
