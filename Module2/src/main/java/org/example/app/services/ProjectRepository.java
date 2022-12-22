package org.example.app.services;

import java.util.List;

public interface ProjectRepository<T> {
    List<T> retreiveAll();

    void store(T book);

    boolean removeItemById(Integer bookIdToRemove);

    void removeItemsByTitle(String title);
    void removeItemsBySize(String size);
    void removeItemsByAuthor(String author);
}
