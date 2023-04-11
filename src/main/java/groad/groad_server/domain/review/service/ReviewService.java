package groad.groad_server.domain.review.service;

import groad.groad_server.domain.review.dto.request.PatchReviewReq;
import groad.groad_server.domain.review.dto.request.PostReviewReq;
import groad.groad_server.domain.review.dto.response.GetReviewRes;
import groad.groad_server.domain.review.entity.Review;
import groad.groad_server.domain.review.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;


    public void register(PostReviewReq postReviewReq) {
        // User 존재여부 확인 후 가져오기 (현재 member logic이 미완성 constant num 할당하여 진행)
        Long member_id = 1L;

        // DTO to Entity
        Review review = Review.builder()
                .member_id(member_id)
                .title(postReviewReq.getTitle())
                .contents(postReviewReq.getContents())
                .build();

        reviewRepository.save(review);
    }

    public void update(PatchReviewReq patchReviewReq) {
        // 더티 체킹 방식 활용
        
        // reviewRepository.save();
    }

    public GetReviewRes getReview(Long id) {
        // 해당 ID의 리뷰 미존재시 500
        Review review = reviewRepository.findById(id).orElseThrow();

        // 작성자 찾기
        String name = "test";

        GetReviewRes getReviewRes = GetReviewRes.builder()
                .review(review)
                .name(name)
                .build();

        return getReviewRes;
    }
}
