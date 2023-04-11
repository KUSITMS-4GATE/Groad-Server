package groad.groad_server.domain.review.repository;

import groad.groad_server.domain.review.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface ReviewRepository extends JpaRepository<Review, Long> {

}
