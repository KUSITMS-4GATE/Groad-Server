package groad.groad_server.domain.review.entity;

import groad.groad_server.domain.common.BaseTimeEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "review")
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
}
