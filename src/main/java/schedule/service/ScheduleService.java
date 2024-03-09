package schedule.service;



import schedule.tableapi.ScheduleApi;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {
    ScheduleApi api;
    public ScheduleService(ScheduleApi api) {
        this.api = api;
    }
    public String getGroupData(String groupId) {
        return api.fetchGroupData(groupId);
    }
}
