package groad.groad_server.domain.review.dto.response;

import groad.groad_server.domain.review.entity.Review;
import lombok.Builder;

public class GetReviewRes {

    private Long id;

    private String member_name;

    private String title;

    private String contents;

    @Builder
    public GetReviewRes(Review review, String name) {
        this.id = review.getId();
        this.member_name = name;
        this.title = review.getTitle();
        this.contents = review.getContents();
    }
}
