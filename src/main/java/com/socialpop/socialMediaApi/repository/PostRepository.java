package com.socialpop.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.socialpop.socialMediaApi.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
