package platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import  platform.model.Code;

import java.util.List;
import java.util.UUID;

public interface CodeRepository extends JpaRepository<Code, UUID> {
    List<Code> findTop10BySecretOrderByDateDesc(boolean secret);
}
