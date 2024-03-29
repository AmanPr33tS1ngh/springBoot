package com.springBootDemo.firstSpring.job;
import com.springBootDemo.firstSpring.job.JobService.JobService;
import com.springBootDemo.firstSpring.job.JobService.JobServiceImp;
import jakarta.websocket.server.PathParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class JobController {
    private JobService jobService;
    public JobController(JobService service){
        this.jobService = service;
    }
    @GetMapping("/jobs")
    public ResponseEntity<List<Job>> findAll(){
        return this.jobService.findAll();
    }
    @PostMapping("/create")
    public ResponseEntity<String> createJob(@RequestBody Job job){
        return this.jobService.createJob(job);
    }
    @GetMapping("/jobs/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable Long id){
        return this.jobService.getJobById(id);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteJobById(@PathVariable Long id){
        return this.jobService.DeleteJobById(id);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateJobById(@PathVariable Long id, @RequestBody Job reqJob){
        return this.jobService.updateJobById(id, reqJob);
    }
}
