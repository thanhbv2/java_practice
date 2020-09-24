package collection;

import java.io.Serializable;

public class GeneralResponse<T> implements Serializable {

    private ResponseStatus status;
    private T data;

    public GeneralResponse(ResponseStatus responseStatus, T user) {
        this.status = responseStatus;
        this.data = user;
    }

}
