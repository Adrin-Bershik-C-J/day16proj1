package com.example.day14proj1.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14proj1.dto.BugResponseDTO;
import com.example.day14proj1.service.BugService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/bugs")
@RequiredArgsConstructor
public class BugController {

    private final BugService bugService;

    @GetMapping
    public ResponseEntity<List<BugResponseDTO>> getFilteredBugs(
            @RequestParam(required = false) String status,
            @RequestParam(required = false) String assignee,
            @RequestParam(required = false) String project) {

        List<BugResponseDTO> bugs = bugService.filterBugs(status, assignee, project);
        return ResponseEntity.ok(bugs);
    }
}