package com.socialpop.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.socialpop.socialMediaApi.entity.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {

}
