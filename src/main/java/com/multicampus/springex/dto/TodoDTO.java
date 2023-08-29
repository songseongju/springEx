package com.multicampus.springex.dto;

import lombok.*;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@ToString
@Data                //setter&getter lombok 에서 다처리함.
@Builder
@AllArgsConstructor  // 모든 속성에 대한 아규먼트 처리
@NoArgsConstructor   // Default 생성자
public class TodoDTO {
    private int tno;

    @NotEmpty // NULL , 빈문자열 불가
    private String title;

    @Future // 현재보다 미래인가?
    private LocalDate dueDate;
    private boolean finished;

    @NotEmpty
    private String writer;
}
