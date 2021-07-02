package Church.PrayerDiary.controller;

import Church.PrayerDiary.domain.Board;
import Church.PrayerDiary.repository.BoardRepository;
import Church.PrayerDiary.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping(value = "/boards")
    public String list(Model model) {
        List<Board> board = boardService.showAll();
        model.addAttribute("boards", board);
        return "boards/boardList";
    }


}
