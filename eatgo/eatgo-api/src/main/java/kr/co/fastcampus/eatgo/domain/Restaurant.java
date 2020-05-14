package kr.co.fastcampus.eatgo.domain;

import org.springframework.core.convert.support.GenericConversionService;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {


    private String name;
    private String address;
    private Long id;
    private List<MenuItem> menuItems = new ArrayList<MenuItem>();

    public Restaurant() {
    }

    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
    }

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

    public void setId(long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void setMenuItem(List<MenuItem> menuItems) {
        for(MenuItem menuItem: menuItems) {
            addMenuItem(menuItem);
        }
    }

}
