package com.guide.guidemicroservice.controller;

import com.guide.guidemicroservice.entities.Guide;
import com.guide.guidemicroservice.service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class GuideController {
    @Autowired
    private GuideService _guideService;

    @PostMapping("/post")
    public ResponseEntity<Guide> createPost(@RequestBody Guide _guide){
        Guide createdGuide = _guideService.createGuide(_guide);
        return new ResponseEntity<>(createdGuide, HttpStatus.CREATED);
    }

    @GetMapping("/post")
    public ResponseEntity<List<Guide>> getAllPost(){
        List<Guide> guides = _guideService.getAllGuide();
        return new ResponseEntity<>(guides, HttpStatus.OK);
    }
    @PutMapping("/post/{id}")
    public ResponseEntity<Void> updatePost(@PathVariable("id") int id, @RequestBody Guide _guide){
        _guide.setId(id);
        _guideService.updateGuide(_guide);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/post/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable("id") int id){
        _guideService.deleteGuide(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/post/{id}")
    public ResponseEntity<Guide> getPostById(@PathVariable("id") int id){
        try {
            Guide guide = _guideService.getGuideById(id);
            return new ResponseEntity<>(guide, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
