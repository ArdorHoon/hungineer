package com.portfolio.hungineer.domain.repository

import com.portfolio.hungineer.domain.entity.Achievement
import com.portfolio.hungineer.domain.entity.ProjectSkill
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectSkillRepository : JpaRepository<ProjectSkill, Long> {


}