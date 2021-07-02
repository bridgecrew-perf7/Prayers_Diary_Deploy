package Church.PrayerDiary.service;

import Church.PrayerDiary.domain.Board;
import Church.PrayerDiary.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
public class BoardService {

    private final BoardRepository boardRepository;


    public List<Board> showAll() {

        return boardRepository.showAll();
    }

}
