package io.javabrains.ipldashboard.repository;

import io.javabrains.ipldashboard.model.Team;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TeamRepository extends CrudRepository<Team, Long> {

    Team findByTeamName(String teamName);
}
