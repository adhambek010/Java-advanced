package com.example.SpringStarter.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.SpringStarter.models.Account;
import com.example.SpringStarter.models.Post;
import com.example.SpringStarter.services.AccountService;
import com.example.SpringStarter.services.PostService;

@Component
public class SeedData implements CommandLineRunner{
    
    @Autowired 
    private PostService postService;

    @Autowired
    private AccountService accountService;

    @Override
    public void run(String... args) throws Exception {

        Account account1 = new Account();
        account1.setEmail("account1@gmail.com");
        account1.setPassword("password");
        account1.setFirstName("User1");

        Account account2 = new Account();
        account2.setEmail("account2@gmail.com");
        account2.setPassword("password");
        account2.setFirstName("User2");

        accountService.save(account1);
        accountService.save(account2);

        List<Post> posts = postService.getAll();
        if (posts.size() == 0) {
            Post post1 = new Post();
            post1.setTitle("Post 1");
            post1.setBody("Post 1 body................");
            post1.setAccount(account1);
            postService.save(post1);

            Post post2 = new Post();
            post2.setTitle("Post 2");
            post2.setBody("Post 2 body................");
            post2.setAccount(account2);
            postService.save(post2);
        }
    }
}
