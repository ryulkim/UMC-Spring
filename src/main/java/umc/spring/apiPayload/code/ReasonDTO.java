package umc.spring.apiPayload.code;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@Builder
@RequiredArgsConstructor
public class ReasonDTO {
    private final Boolean isSuccess;
    private final HttpStatus httpStatus;
    private final String code;
    private final String message;
}
