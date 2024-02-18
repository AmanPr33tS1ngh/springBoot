package com.springBootDemo.firstSpring.job.JobRepo;

import com.springBootDemo.firstSpring.job.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {}
