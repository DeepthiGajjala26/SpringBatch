package com.springbatch.BaiscSpringBatch.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

//    @Autowired
//    private JobLauncher jobLauncher;
//
//    @Autowired
//    private Job job;
@GetMapping("/get")
public String test(){
    return "started controller";
}
    @GetMapping("/test")
    public String deepu(){
        return "end controller";
    }
    @GetMapping("/merge")
    public String merge(){
        return "merge sucessfully";
    }
    @GetMapping("/pull")
    public String pull(){
        return "pull sucessfully";
    }
    @GetMapping("/test1")
    public String test1(){
        return "test1 method";

    }






































































































































//  @GetMapping("/batch")
//    public String StartJob() throws JobInstanceAlreadyCompleteException, JobExecutionAlreadyRunningException, JobParametersInvalidException, JobRestartException {
//
//      jobLauncher.run(job, new JobParameters());
//      return "Job has been executed successfully!";
//
//  }

}
