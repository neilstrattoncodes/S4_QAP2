package com.keyin.rest.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;
@RepositoryRestResource(collectionResourceRel = "videogames", path = "videogames")
public interface VideogameAPIService extends JpaRepository<VideoGames, Long> {
    public List<VideoGames> findByTitle(@Param("title")String title);
    public List<VideoGames> findByConsole(@Param("console")String console);

    public List<VideoGames> findByPrice(@Param("price")double price);

}
