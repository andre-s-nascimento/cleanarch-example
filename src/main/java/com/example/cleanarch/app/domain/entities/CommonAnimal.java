package com.example.cleanarch.app.domain.entities;


import java.time.LocalDate;
import java.util.Objects;

public class CommonAnimal implements Animal{

    private String name;
    private LocalDate birthDate;
    private String breed;
    private String color;
    private String kind;

    public CommonAnimal(String name, LocalDate birthDate, String breed, String color, String kind) throws Exception {
        this.name = name;
        if(birthDate.isAfter(LocalDate.now()))
            throw new Exception("birthDate cannot be after now");
        this.birthDate = birthDate;
        this.breed = breed;
        this.color = color;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) throws Exception {
        if(birthDate.isAfter(LocalDate.now()))
            throw new Exception("birthDate cannot be after now");
        this.birthDate = birthDate;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge(){
        return LocalDate.now().getYear() - this.birthDate.getYear();
    }

    @Override
    public String toString() {
        return "CommonAnimal{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", kind='" + kind + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommonAnimal that = (CommonAnimal) o;
        return Objects.equals(name, that.name) && Objects.equals(birthDate, that.birthDate) && Objects.equals(breed, that.breed) && Objects.equals(color, that.color) && Objects.equals(kind, that.kind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDate, breed, color, kind);
    }

}
