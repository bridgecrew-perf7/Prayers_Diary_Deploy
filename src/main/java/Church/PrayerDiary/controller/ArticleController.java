package Church.PrayerDiary.controller;

import Church.PrayerDiary.domain.Article;
import Church.PrayerDiary.service.WriteService;
import Church.PrayerDiary.web.WriteForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ArticleController {

    private final WriteService writeService;


    @GetMapping(value = "/article")
    public String createForm(Model model){
        model.addAttribute("form", new WriteForm());
        return "article/post";
    }

    @PostMapping(value = "/article")
    public String create(WriteForm form) {

        Article writing = new Article();

        writing.setTitle(form.getTitle());
        writing.setContent(form.getContent());
        writing.setUser(form.getUser());
        writeService.join(writing);

        return "/main";

    }

}
