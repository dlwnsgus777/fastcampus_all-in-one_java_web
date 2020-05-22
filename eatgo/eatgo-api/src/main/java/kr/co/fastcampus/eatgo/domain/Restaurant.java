package kr.co.fastcampus.eatgo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.core.convert.support.GenericConversionService;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter
    private Long id;

    @Setter
    @NotEmpty
    private String name;

    @NotEmpty
    private String address;

    @Transient
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<MenuItem> menuItems = new ArrayList<MenuItem>();

    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Restaurant(long id, String name, String address) {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public String getInfomation() {
        return name + " in " + address;
    }

//    public void addMenuItem(MenuItem menuItem) {
//        if (menuItems == null) {
//            menuItems = new ArrayList<MenuItem>();
//        }
//
//        menuItems.add(menuItem);
//    }

    public void setMenuItem(List<MenuItem> menuItems) {
        this.menuItems = new ArrayList<>(menuItems);
//        for(MenuItem menuItem: menuItems) {
//            addMenuItem(menuItem);
//        }
    }

    public void updateInfomation(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
