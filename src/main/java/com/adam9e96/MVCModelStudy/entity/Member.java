package com.adam9e96.MVCModelStudy.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    /**
     * Member 번호
     */
    @Id
    private Integer id;

    // 직접 생성한 setter 메서드
    /**
     * Member 이름
     */
    private String name;
}
