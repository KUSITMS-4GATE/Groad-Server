package groad.groad_server.domain.review.entity;

import groad.groad_server.domain.common.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "review")
@Where(clause = "deleted_at IS NULL")
@SQLDelete(sql = "UPDATE review SET deleted_at = NOW() where id = ?")
@NoArgsConstructor (access = AccessLevel.PROTECTED)
public class Review extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "member_id")
    private Long member_id;

    @NotNull
    @Column(name = "title")
    private String title;

    @NotNull
    @Column(name = "contents")
    private String contents;

    @Builder
    public Review(Long id, Long member_id, String contents) {
        this.member_id = member_id;
        this.contents = contents;
    }
}
