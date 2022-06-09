package jpabook.jpashopapi.repository;

import jpabook.jpashopapi.domain.Address;
import jpabook.jpashopapi.domain.OrderStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderSimpleQueryDto {

    private Long orderId;
    private String name;
    private LocalDateTime orderDate;
    private OrderStatus orderStatus;
    private Address address;

    public OrderSimpleQueryDto(Long orderId, String name, LocalDateTime orderDate, OrderStatus orderStatus, Address address) {
        this.orderId = orderId;
        this.name = name; //LAZY 초기화 -> 영속성 컨텍스트가 member id를 가지고 영속성 컨텍스트안에서 찾아본 뒤 없으면 DB 쿼리 날림
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.address = address; //LAZY 초기화
    }
}
