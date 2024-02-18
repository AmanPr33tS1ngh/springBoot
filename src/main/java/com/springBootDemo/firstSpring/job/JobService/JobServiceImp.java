package com.springBootDemo.firstSpring.job.JobService;

import com.springBootDemo.firstSpring.job.Job;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class JobServiceImp implements JobService{
    private List<Job> jobs = new ArrayList<>();
    private Long id = 1L;

    @Override
    public ResponseEntity<List<Job>> findAll() {
        return new ResponseEntity<>(this.jobs, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> createJob(Job job) {
        job.setId(this.id++);
        this.jobs.add(job);
        return new ResponseEntity<>("Job Added!", HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Job> getJobById(Long id) {
        for (Job job: this.jobs){
            if(job.getId().equals(id))return new ResponseEntity<>(job, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<String> DeleteJobById(Long id) {
        Iterator<Job> jobIterator = this.jobs.iterator();
        while(jobIterator.hasNext()){
            Job job = jobIterator.next();
            if(job.getId().equals(id)) {
                jobIterator.remove();
                return new ResponseEntity<>("Deleted successfully!", HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("Not found!", HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<String> updateJobById(Long id, Job reqJob) {
        for (Job job: this.jobs){
            if(job.getId().equals(id)) {
                job.setTitle(reqJob.getTitle());
                job.setDescription(reqJob.getDescription());
                job.setMaxSalary(reqJob.getMaxSalary());
                job.setMinSalary(reqJob.getMinSalary());
                job.setLocation(reqJob.getLocation());
                return new ResponseEntity<>("Updated Successfully!", HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("Not found!", HttpStatus.NOT_FOUND);
    }
}
