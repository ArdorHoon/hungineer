package com.portfolio.hungineer.domain.repository

import com.portfolio.hungineer.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long> {


}