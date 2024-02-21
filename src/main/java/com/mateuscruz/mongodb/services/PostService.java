package com.mateuscruz.mongodb.services;

import com.mateuscruz.mongodb.domain.Post;
import com.mateuscruz.mongodb.repository.PostRepository;
import com.mateuscruz.mongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text) {
        return repo.findByTitleCotaining(text);
    }
}
