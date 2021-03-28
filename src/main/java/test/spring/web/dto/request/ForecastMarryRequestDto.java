package test.spring.web.dto.request;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode
@ToString
public class ForecastMarryRequestDto {
    private int day;
    private int month;
    private int year;
}
