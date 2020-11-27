package pl.nosql.weather.cityweatherapp.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;
import java.util.List;

@Table
public class Data {

    @PrimaryKey
    private final Integer id;
    private City city;
    private Date time;
    private MainData main;
    private Wind wind;
    private Cloud clouds;
    private List<Phenomenon> weather;

    public Data(Integer id, City city, Date time, MainData main, Wind wind,
                Cloud clouds, List<Phenomenon> weather) {
        this.id = id;
        this.city = city;
        this.time = time;
        this.main = main;
        this.wind = wind;
        this.clouds = clouds;
        this.weather = weather;
    }

    public Integer getId() {
        return id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public MainData getMain() {
        return main;
    }

    public void setMain(MainData main) {
        this.main = main;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public void setClouds(Cloud clouds) {
        this.clouds = clouds;
    }

    public Cloud getClouds() {
        return clouds;
    }

    public List<Phenomenon> getWeather() {
        return weather;
    }

    public void setWeather(List<Phenomenon> weather) {
        this.weather = weather;
    }
}