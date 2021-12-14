package renan.apigateway.request;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "course-service", //Nome para course-service app.
        path  = "/api/course",    //Pre-path para course-service
        // url   = "${course.service.url}",
        configuration = FeignConfiguration.class)
public interface CourseServiceRequest {

    @PostMapping //api/course
    Object saveCourse(@RequestBody Object requestBody);

    @DeleteMapping("{courseId}") //api/course/{courseId}
    void deleteCourse(@PathVariable("courseId") Long courseId);

    @GetMapping //api/course
    List<Object> getAllCourses();
}