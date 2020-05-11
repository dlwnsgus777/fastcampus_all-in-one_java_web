package kr.co.fastcampus.eatgo.domain;

public class Restaurant {


    private final String name;
    private final String address;
    private final Long id;

    public Restaurant(long id, String name, String address) {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getInfomation() {
        return name + " in " + address;
    }

    public Long getId() {
        return id;
    }
}
