package groad.groad_server.domain.review.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PatchReviewReq {

    private Long id;

    private String title;

    private String contents;
}
