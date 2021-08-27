package com.example.ex00.sample;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@ToString
@Component // 스프링에서 관리를 해줘야하는 주인공

public class Restaurant {

    @Autowired
    @Qualifier("englandChef")
    private Chef chef; // 나 쉐프가 필요해
}