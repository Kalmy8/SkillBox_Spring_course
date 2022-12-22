package org.example.web.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class BookSizeToRemove {
    @NotBlank
    @NotNull
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
