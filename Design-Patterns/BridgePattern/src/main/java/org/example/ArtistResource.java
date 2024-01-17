package org.example;

public class ArtistResource implements Resource{

    private Artist artist;
    public ArtistResource(Artist artist){
        this.artist = artist;
    }
    @Override
    public String snipped() {
        return artist.getBio();
    }

    @Override
    public String title() {
        return artist.getArtistName();
    }

    @Override
    public String image() {
        return artist.getImage();
    }

    @Override
    public String url() {
        return artist.getUrl();
    }
}
