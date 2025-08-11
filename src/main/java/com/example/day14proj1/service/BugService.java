package com.example.day14proj1.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.day14proj1.dto.BugResponseDTO;
import com.example.day14proj1.repository.BugRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BugService {

    private final BugRepository bugRepository;

    public List<BugResponseDTO> filterBugs(String status, String assignee, String project) {
        return bugRepository.findAll().stream().filter(b -> status == null || b.getStatus().equalsIgnoreCase(status))
                .filter(b -> assignee == null || b.getAssignee().equalsIgnoreCase(assignee))
                .filter(b -> project == null || b.getProject().equalsIgnoreCase(project))
                .map(b -> new BugResponseDTO(b.getId(), b.getTitle(), b.getStatus(), b.getAssignee(), b.getProject()))
                .collect(Collectors.toList());
    }

}
