package com.springboot.blog.service.impl;

import com.springboot.blog.entity.Post;
import com.springboot.blog.exception.ResourceNotFoundException;
import com.springboot.blog.payload.PostDto;
import com.springboot.blog.repository.PostRepository;
import com.springboot.blog.service.PostService;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    @Override
    public PostDto createPost(PostDto postDto) {
        // convert DTO to entity by calling mapToEntity() method
        Post post = mapToEntity(postDto);

        // save entity which returns an entity object which is saved
        Post newPost = postRepository.save(post);

        // convert response entity to DTO by calling mapToDto() method
        return mapToDto(newPost);
    }

    @Override
    public List<PostDto> getAllPosts() {
        List<Post> posts = postRepository.findAll();
        return posts.stream().map(this::mapToDto).collect(Collectors.toList());
    }

    @Override
    public PostDto getPostById(long id) {
        Post post = postRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Post","id",id));
        return mapToDto(post);
    }

    // converts entity obj to DTO
    private PostDto mapToDto(Post post) {
        PostDto postResponse = new PostDto();
        postResponse.setId(post.getId());
        postResponse.setContent(post.getContent());
        postResponse.setDescription((post.getDescription()));
        postResponse.setTitle(post.getTitle());
        return postResponse;
    }

    // convert DTO obj to entity obj
    private Post mapToEntity(PostDto postDto) {
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        return post;
    }
}
