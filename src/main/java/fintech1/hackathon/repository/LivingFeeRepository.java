package fintech1.hackathon.repository;

import fintech1.hackathon.entity.Member.LivingFee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LivingFeeRepository extends JpaRepository<LivingFee, Long> {
    Optional<LivingFee> findByEmail(String email);
}
