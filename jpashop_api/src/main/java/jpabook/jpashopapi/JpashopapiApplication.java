package jpabook.jpashopapi;

import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpashopapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpashopapiApplication.class, args);
	}

	//엔티티를 직접 노출할 때 사용
	//엔티티를 외부에 노출하는 것은 좋지 않음
	//Hibernate5Module를 직접 사용해서까지 엔티티를 쓰지 말고 DTO를 사용하자
	@Bean
	Hibernate5Module hibernate5Module() {
		return new Hibernate5Module();
	}
}
