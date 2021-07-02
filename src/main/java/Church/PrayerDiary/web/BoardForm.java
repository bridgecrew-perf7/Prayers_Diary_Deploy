package Church.PrayerDiary.web;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BoardForm {

    private int id;
    private String user;
    private String title;
    private String content;
}
