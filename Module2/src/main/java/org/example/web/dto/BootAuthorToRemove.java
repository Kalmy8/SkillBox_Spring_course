package org.example.web.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class BootAuthorToRemove {
    @NotBlank
    @NotNull
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
