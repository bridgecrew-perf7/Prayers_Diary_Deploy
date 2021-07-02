package Church.PrayerDiary.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "writings")
@Getter @Setter
public class Article {

    @Id @GeneratedValue
    @Column(name = "write_id")
    private Long id;
    private String title;
    private String content;
    private String user;
    private int count;
    private LocalDateTime localDateTime;



    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;




}
