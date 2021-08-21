package fintech1.hackathon.repository;

import fintech1.hackathon.entity.Member.LivingFee;
import fintech1.hackathon.entity.Member.Preference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PreferenceRepository extends JpaRepository<Preference, Long> {
    Optional<Preference> findByEmail(String email);
}
