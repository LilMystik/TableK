package table.controller;

import table.service.TableService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TableController {
    private final TableService service;
    public TableController(TableService service) {
        this.service = service;
    }
    @GetMapping(value="/info", produces="application/json")
    public ResponseEntity<String> groupData (@RequestParam("id") String groupId) {
        return ResponseEntity.ok(service.getGroupData(groupId));
    }
}
