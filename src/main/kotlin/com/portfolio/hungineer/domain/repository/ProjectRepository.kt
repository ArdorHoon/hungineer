package com.portfolio.hungineer.domain.repository

import com.portfolio.hungineer.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository : JpaRepository<Project, Long> {


}