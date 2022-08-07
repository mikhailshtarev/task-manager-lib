package exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorResponse {
    public String message;
    public int errorCode;
    public String userDescription;
    public String devDescription;
}
