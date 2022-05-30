//import com.cmlteam.personin4backend.entity.Job;
//import com.cmlteam.personin4backend.entity.Jobs;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//@Slf4j
//public class DataService {
//  public static List<String> getLinkedIn(String linkedIn) {
//    return Arrays.stream(linkedIn.split("; "))
//        .filter(l -> l.length() != 1)
//        .collect(Collectors.toList());
//  }
//
//  public static List<Job> getJobs(String jobs) throws JsonProcessingException {
//    if (jobs.length() == 1) {
//      return new ArrayList<>();
//    } else {
//      final ObjectMapper objectMapper = new ObjectMapper();
//      List<Jobs> jobsList = objectMapper.readValue(jobs, new TypeReference<>() {});
//      return jobsList.stream()
//          .map(job -> new Job(job.getJobTitle(), job.getLink()))
//          .collect(Collectors.toList());
//    }
//  }
//}
