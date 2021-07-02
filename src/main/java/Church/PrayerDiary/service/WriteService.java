package Church.PrayerDiary.service;

import Church.PrayerDiary.domain.Board;
import Church.PrayerDiary.domain.Article;
import Church.PrayerDiary.repository.BoardRepository;
import Church.PrayerDiary.repository.WriteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class WriteService {

    private final WriteRepository writeRepository;
    private final BoardRepository boardRepository;


    public Long join(Article writing) {

        writeRepository.save(writing);

        Board board = new Board();
        board.setContent(writing.getContent());
        board.setTitle(writing.getTitle());
        board.setUser(writing.getUser());
        boardRepository.save(board);

        return writing.getId();
    }

}
