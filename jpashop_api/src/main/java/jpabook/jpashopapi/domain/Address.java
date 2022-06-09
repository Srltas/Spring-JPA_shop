package jpabook.jpashopapi.domain;

import lombok.*;

import javax.persistence.Embeddable;

@Embeddable
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private String city;
    private String street;
    private String zipcode;

}
