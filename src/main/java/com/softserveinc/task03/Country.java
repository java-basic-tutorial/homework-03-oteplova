package com.softserveinc.task03;

import com.softserveinc.task02.City;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private String name;
    private String continent;
    private String code;
    private City capital;
    private List<City> cities;

    public Country() {

    }

    public Country(String name, String continent, String code, City capital) {
        this.name = name;
        this.continent = continent;
        this.code = code;
        this.capital = capital;
        this.cities = new ArrayList<City>();
        this.cities.add(capital);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public List<City> getCities() {
        return cities;
    }

    // why do we need this method? in case of use it, it re-write all massive by new data
    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", code='" + code + '\'' +
                ", capital=" + capital +
                ", cities=" + cities +
                '}';
    }

    //append new city into array cities
    public void addCity(City newCity) {
        if (newCity == null) {
            return;
        }
        this.cities.add(newCity);
    }

    //return count all inhabitants of all cities in country
    public int getInhabitants() {
        int countInhabitants = 0;
        for (City city : this.cities) {
            countInhabitants += city.getInhabitants();
        }
      //  return countInhabitants + this.capital.getInhabitants();
        return countInhabitants;
    }
}
