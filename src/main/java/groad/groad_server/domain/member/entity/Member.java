package groad.groad_server.domain.member.entity;


import groad.groad_server.domain.common.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "member")
@Where(clause = "deleted_at IS NULL")
@SQLDelete(sql = "UPDATE member SET deleted_at = NOW() where id = ?")
@NoArgsConstructor (access = AccessLevel.PROTECTED)
public class Member extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "email", unique = true)
    private String email;

    @NotNull
    @Column(name = "authority")
    private String authority;

    @Column(name = "university")
    private String university;

    @Builder
    public Member(Long id, String name, String email, String authority, String university) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.authority = authority;
        this.university = university;
    }
}
