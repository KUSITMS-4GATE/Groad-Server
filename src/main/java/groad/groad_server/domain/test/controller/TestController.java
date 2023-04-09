package groad.groad_server.domain.test.controller;

import groad.groad_server.domain.test.DTO.PostTestReq;
import groad.groad_server.domain.test.entity.Test;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Api(tags = "Groad Test Controller")
@RequestMapping("/test")
public class TestController {

    @ApiOperation("Input Test Actions")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 500, message = "Exception")
    })
    @PostMapping("/register")
    public ResponseEntity<String> TestActions(@RequestBody PostTestReq postTestReq) {
        Test test = new Test(postTestReq.getName());
        return ResponseEntity.ok(test.getName());
    }
}
