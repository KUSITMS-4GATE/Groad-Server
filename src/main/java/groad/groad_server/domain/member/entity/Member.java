package groad.groad_server.domain.member.entity;


import groad.groad_server.domain.common.BaseTimeEntity;

import javax.persistence.*;

@Entity
@Table(name = "member")
public class Member extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "authority")
    private String authority;

    @Column(name = "university")
    private String university;
}
