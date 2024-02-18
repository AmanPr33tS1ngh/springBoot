package com.springBootDemo.firstSpring.job.JobService;

import com.springBootDemo.firstSpring.job.Job;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface JobService {
    ResponseEntity<List<Job>> findAll();
    ResponseEntity<String> createJob(Job job);
    ResponseEntity<Job> getJobById(Long id);
    ResponseEntity<String> DeleteJobById(Long id);
    ResponseEntity<String> updateJobById(Long id, Job reqJob);
}
