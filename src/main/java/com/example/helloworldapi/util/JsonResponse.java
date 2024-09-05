package com.example.helloworldapi.util;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class JsonResponse<T> {
    private List<T> data;
    private boolean isError = false;
    private List<String> errorMessages= new ArrayList<>();

    public JsonResponse( List<T> data, Throwable th ) {
        this.data = data;
        populateError(th);
    }

    private void populateError(Throwable th) {
        if (th == null)
            return;

        this.isError = true;

        this.errorMessages.add(th.getMessage());
    }
}
