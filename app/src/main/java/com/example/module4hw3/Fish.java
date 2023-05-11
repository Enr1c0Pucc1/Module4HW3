package com.example.module4hw3;

public class Fish {
    private String name;
    private String animalDescription;
    private int animalResource;
    private String populationSize;

    public Fish(String name, String animalDescription, int animalResource, String populationSize){
        this.name = name;
        this.animalDescription = animalDescription;
        this.animalResource = animalResource;
        this.populationSize = populationSize;
    }
    public String getFishName(){
        return name;
    }
    public void setFishName(String name){
        this.name = name;
    }
    public String getFishDescription(){
        return animalDescription;
    }
    public void setFishDescription(String animalDescription){
        this.animalDescription = animalDescription;
    }
    public int getFishResource(){
        return animalResource;
    }
    public void setFishResource(int animalResource){
        this.animalResource = animalResource;
    }
    public String getPopulationSize(){
        return populationSize;
    }
    public void setPopulationSize(String populationSize){
        this.populationSize = populationSize;
    }
}
