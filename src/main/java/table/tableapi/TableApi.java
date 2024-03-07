package table.tableapi;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
@Component
public class TableApi {
    RestTemplate restTemplate;
    public TableApi() {
        restTemplate = new RestTemplate();
    }
    public String fetchGroupData(String groupId) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://iis.bsuir.by/api/v1/schedule?studentGroup=" + groupId);
        return restTemplate.getForObject(builder.toUriString(), String.class);
    }
}