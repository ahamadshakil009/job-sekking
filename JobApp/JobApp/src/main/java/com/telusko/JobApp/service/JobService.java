package com.telusko.JobApp.service;

import com.telusko.JobApp.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    @Lazy
    private JobService service;

    public void addJob(JobPost jobpost){
        service.addJob(jobpost);
    }

    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }
}
