package groad.groad_server.domain.review.entity;

import groad.groad_server.domain.common.BaseTimeEntity;

import javax.persistence.*;

@Entity
@Table(name = "review")
public class Review extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "member_id")
    private Long member_id;

    @Column(name = "title")
    private String title;

    @Column(name = "contents")
    private String contents;
}
