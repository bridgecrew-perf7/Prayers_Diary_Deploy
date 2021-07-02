package Church.PrayerDiary.repository;

import Church.PrayerDiary.domain.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class BoardRepository {

    @PersistenceContext
    private final EntityManager em;

    public void save(Board board) {
        em.persist(board);
    }

    public List<Board> showAll() {
        return em.createQuery("select b from Board b",
                Board.class).getResultList();
    }



}
