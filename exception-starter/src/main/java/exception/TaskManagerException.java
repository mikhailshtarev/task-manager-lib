package exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TaskManagerException extends RuntimeException {
    private String message;
    private int code;
    private String userDescription;
    private String devDescription;
}
