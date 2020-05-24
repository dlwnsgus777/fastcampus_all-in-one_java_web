package kr.co.fastcampus.eatgo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Setter
    private Long restaurantId;

    private String name;

    @Transient // DB에 넣지 않는다는 뜻
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private boolean destroy;

}
