package groad.groad_server.domain.test.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

@Getter
public class PostTestReq {

    @ApiModelProperty(notes = "Test Name", example = "그로드")
    private String name;
}
