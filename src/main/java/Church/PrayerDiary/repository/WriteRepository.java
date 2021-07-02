package Church.PrayerDiary.repository;

import Church.PrayerDiary.domain.Article;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@RequiredArgsConstructor
public class WriteRepository {

    @PersistenceContext
    private final EntityManager em;

    public void save(Article writing) {

        em.persist(writing);
    }

}
