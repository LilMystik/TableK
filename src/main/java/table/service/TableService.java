package table.service;



import table.tableapi.TableApi;
import org.springframework.stereotype.Service;

@Service
public class TableService {
    TableApi api;
    public TableService(TableApi api) {
        this.api = api;
    }
    public String getGroupData(String groupId) {
        return api.fetchGroupData(groupId);
    }
}
