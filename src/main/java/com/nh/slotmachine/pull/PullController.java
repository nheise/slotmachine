package com.nh.slotmachine.pull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pull")
public class PullController {

    @Autowired
    private PullService pullService;

    @PostMapping
    public ResponseEntity<PullResult> pull() {
        return ResponseEntity.ok(pullService.pull());
    }

}
