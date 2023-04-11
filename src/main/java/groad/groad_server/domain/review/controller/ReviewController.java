package groad.groad_server.domain.review.controller;

import groad.groad_server.domain.review.dto.request.PatchReviewReq;
import groad.groad_server.domain.review.dto.request.PostReviewReq;
import groad.groad_server.domain.review.dto.response.GetReviewRes;
import groad.groad_server.domain.review.service.ReviewService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(tags = "Groad Review Controller")
@RestController
@RequestMapping("/review")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    @ApiOperation("후기 글 작성")
    @PostMapping("/register")
    public ResponseEntity<String> postReview(@RequestBody PostReviewReq postReviewReq) {
        reviewService.register(postReviewReq);

        return ResponseEntity.ok("Register Success");
    }

    @ApiOperation("후기 글 수정")
    @PostMapping("/update")
    public ResponseEntity<String> updateReview(@RequestBody PatchReviewReq patchReviewReq) {
        reviewService.update(patchReviewReq);

        return ResponseEntity.ok("Update Success");
    }

    @ApiOperation("특정 후기 글 조회")
    @GetMapping("/{id}")
    public ResponseEntity<GetReviewRes> getReview(@PathVariable("id") Long id) {
        GetReviewRes getReviewRes = reviewService.getReview(id);

        return ResponseEntity.ok(getReviewRes);
    }
}
